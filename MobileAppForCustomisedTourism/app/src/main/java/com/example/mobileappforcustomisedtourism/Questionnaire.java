package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);
        final RadioGroup categories = (RadioGroup) findViewById(R.id.radioGroup);
        categories.clearCheck();
        RadioGroup Categories = (RadioGroup)findViewById(R.id.radioGroup);
        final RadioButton Science = (RadioButton) findViewById(R.id.rb_Science);
        final RadioButton Literature = (RadioButton)findViewById(R.id.rb_Literature);
        final RadioButton Art = (RadioButton) findViewById(R.id.rb_Art);
        final RadioButton HistoryAndCulture = (RadioButton) findViewById(R.id.rb_HistoryAndCultureOfTheCity);
        Button confirm = (Button)findViewById(R.id.btn_confirm);

//        Button tester = (Button)findViewById(R.id.tester);
//        tester.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = (new Intent(Questionnaire.this, MapsActivity2.class));
//                startActivity(intent);
//            }
//        });

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(Science.isChecked())
                {
                    Intent intent = (new Intent(Questionnaire.this, Science.class));
                    startActivity(intent);
                }
                if(Literature.isChecked())
                {
                    Intent intent = (new Intent(Questionnaire.this, Literature.class));
                    startActivity(intent);
                }
                if(Art.isChecked())
                {
                    Intent intent = (new Intent(Questionnaire.this, Art.class));
                    startActivity(intent);
                }
                if(HistoryAndCulture.isChecked())
                {
                    Intent intent = (new Intent(Questionnaire.this, HistoryAndCulture.class));
                    startActivity(intent);
                }
            }
        });
    }
}