package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class Questionnaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire2);
        Listener();
    }

    public void Listener()
    {
        final CheckBox art = (CheckBox) findViewById(R.id.rb_Art);
        final CheckBox science = (CheckBox)findViewById(R.id.rb_Science);
        final CheckBox historyandCulture = (CheckBox)findViewById(R.id.rb_HistoryAndCultureOfTheCity);
        final CheckBox literature = (CheckBox)findViewById(R.id.rb_Literature);
        Button confirm = (Button)findViewById(R.id.btn_confirm);

        confirm.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                final ArrayList<String> checkedIds = new ArrayList<String>();
                if(art.isChecked())
                {
                    checkedIds.add("Art ");
                }
//                else
//                    if(checkedIds.contains("Art "))
//                    {
//                        checkedIds.remove("Art ");
//                    }
                if(science.isChecked())
                {
                    checkedIds.add("Science ");
                }
                if(historyandCulture.isChecked())
                {
                    checkedIds.add("History and Culture ");
                }
                if(literature.isChecked())
                {
                    checkedIds.add("Literature ");
                }

                Intent intent = (new Intent(Questionnaire.this, Propositions.class));
                intent.putExtra("CheckedBoxes", checkedIds.toString());
                startActivity(intent);
            }
        });

    }
}
