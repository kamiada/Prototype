/**
 * Created by Adrianna Kaminska - 40213297
 * The prototype of mobile application for customised tourism (honors project 2019)
 * Edinburgh Napier University
 * Sing_In
 */

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


public class Sign_In extends AppCompatActivity {

    EditText edit_email, edit_password;
    Button btn_login;
    Button btn_reg;

    FirebaseAuth mAuth;

    @Override
    protected void onStart() {
        super.onStart();

        // Automatic login
        if(mAuth.getCurrentUser() != null) {
            Intent intent = new Intent(Sign_In.this, HomeScreen.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__in);

        mAuth = FirebaseAuth.getInstance();

        edit_email = findViewById(R.id.email_tologin);
        edit_password = findViewById(R.id.password);
        btn_login = findViewById(R.id.btn_login);
        btn_reg = findViewById(R.id.btn_reg);
        ProgressDialog progress;
        progress = new ProgressDialog(this);

        RegistrationScreen();
        //Login();
        // ProgressPopUp(progress);
        btn_login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String txt_email = edit_email.getText().toString();
                String txt_password = edit_password.getText().toString();

                if(TextUtils.isEmpty(txt_email) )
                {
                    Toast.makeText(Sign_In.this, "Please type your email", Toast.LENGTH_SHORT).show();
                }
                if(TextUtils.isEmpty(txt_password))
                {
                    Toast.makeText(Sign_In.this, "Please type your password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    mAuth.signInWithEmailAndPassword(txt_email,txt_password).
                            addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task)
                                {
                                    if(task.isSuccessful())
                                    {
                                        Intent intent = new Intent(Sign_In.this, Questionnaire.class);
                                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intent);
                                    }
                                    else
                                    {
                                        Toast.makeText(Sign_In.this, "Signing in was unsuccesful", Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
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

    void RegistrationScreen()
    {
        btn_reg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sign_In.this,Register.class);
                startActivity(intent);
            }
        });
    }



    void Login()
    {
        btn_login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String txt_email = edit_email.getText().toString();
                String txt_password = edit_password.getText().toString();

                if(TextUtils.isEmpty(txt_email) )
                {
                    Toast.makeText(Sign_In.this, "Please type your email", Toast.LENGTH_SHORT).show();
                }
                if(TextUtils.isEmpty(txt_password))
                {
                    Toast.makeText(Sign_In.this, "Please type your password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    mAuth.signInWithEmailAndPassword(txt_email,txt_password).
                            addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task)
                                {
                                    if(task.isSuccessful())
                                    {
                                        Intent intent = new Intent(Sign_In.this, Questionnaire.class);
                                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intent);
                                    }
                                    else
                                    {
                                        Toast.makeText(Sign_In.this, "Signing in was unsuccesful", Toast.LENGTH_LONG).show();
                                    }
                                }
                            });
                }

            }
        });
    }
}
