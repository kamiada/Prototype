package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CheckIn extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        Button goBack = (Button)findViewById(R.id.btn_goBackFromCheckIn);
        final Button CheckIn = (Button)findViewById(R.id.CheckInCheckIn);

        goBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = (new Intent(CheckIn.this, HomeScreen.class));
                startActivity(intent);
            }
        });

        CheckIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
