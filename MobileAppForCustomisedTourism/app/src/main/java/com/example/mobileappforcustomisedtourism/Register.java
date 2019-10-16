package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Register extends AppCompatActivity {

    EditText edit_email, edit_fullName, edit_Surname, edit_password, edit_password2, edit_username;
    Button btn_reg;
    FirebaseAuth mAuth;
    DatabaseReference reference;
    ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edit_email = findViewById(R.id.email);
        edit_password = findViewById(R.id.password);
        edit_password2 = findViewById(R.id.conf_password);
        edit_username = findViewById(R.id.new_username);
        progress = new ProgressDialog(this);
        btn_reg = findViewById(R.id.btn_reg);


        btn_reg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String txt_username = edit_username.getText().toString();
                String txt_email = edit_email.getText().toString();
                String txt_password = edit_password.getText().toString();
                String txt_password2 = edit_password2.getText().toString();

                mAuth = FirebaseAuth.getInstance();
                //Validation

                if(TextUtils.isEmpty(txt_username)|| TextUtils.isEmpty(txt_email)
                        ||TextUtils.isEmpty(txt_password)||TextUtils.isEmpty(txt_password2))
                {
                    Toast.makeText(Register.this,"All fields are required to be filled, in order to register an account",
                            Toast.LENGTH_SHORT).show();
                }
                else if(txt_password.length() < 6)
                {
                    Toast.makeText(Register.this, "Password needs to be minimum 6 characters long", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(!txt_password.equals(txt_password2))
                    {
                        Toast.makeText(Register.this, "Password needs to be same", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    else
                    {
                        registerUser(txt_username,txt_email,txt_password);
                    }
                }
            }
        });

    }


    private void registerUser(final String username, String email, String password)
    {
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    FirebaseUser firebaseUser = mAuth.getCurrentUser();
                    assert firebaseUser != null;
                    String userID = firebaseUser.getUid();

                    reference = FirebaseDatabase.getInstance().getReference("User").child(userID);

                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("id", userID);
                    hashMap.put("username", username);

                    reference.setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task)
                        {
                            if(task.isSuccessful())
                            {
                                Toast.makeText(Register.this, "Registration was succesful", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent (Register.this, Sign_In.class);
                                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);
                                finish();
                            }
                            else
                            {
                                Toast.makeText(Register.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }else
                {
                    Toast.makeText(Register.this, "This email already has an account", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    public void ProgressPopUp(final ProgressDialog progres)
    {
        progres.setMessage("Loading...");
        progres.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progres.setIndeterminate(true);
        progres.setProgress(0);
        progres.show();
        final int totalProgressTime = 100;

        final Thread thread = new Thread()
        {
            public void run()
            {
                int jumpTime = 0;
                while(jumpTime<totalProgressTime) {
                    try
                    {
                        sleep(200);
                        jumpTime += 5;
                        progres.setProgress(jumpTime);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();

    }


}

