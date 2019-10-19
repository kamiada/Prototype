package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        final FirebaseAuth mAuth;
        mAuth = FirebaseAuth.getInstance();
        final Button UserProfile = (Button)findViewById(R.id.Profile);
        Button Continue = (Button)findViewById(R.id.Continue);

        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(HomeScreen.this, Questionnaire.class));
                startActivity(intent);
            }
        });

        UserProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(HomeScreen.this, UserProfile.class));
                startActivity(intent);
            }
        });

        Button SignOut = (Button)findViewById(R.id.SignOut);
        SignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                Toast.makeText(HomeScreen.this,"Signing you out",Toast.LENGTH_LONG).show();
                System.exit(0);
            }
        });

        final Button CheckIn = (Button)findViewById(R.id.CheckIn);
        CheckIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(HomeScreen.this, CheckIn.class));
                startActivity(intent);
            }
        });

    }
}
