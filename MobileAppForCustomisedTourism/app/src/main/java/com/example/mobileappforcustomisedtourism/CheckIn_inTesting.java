package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CheckIn_inTesting extends AppCompatActivity {
    private Spinner spinner;
    private Button CheckIn;
    private Button GoBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in_in_testing);
        addItemstoSpinner();


        GoBack = (Button)findViewById(R.id.btn_goBackFromCheckIn2);
        CheckIn = (Button)findViewById(R.id.CheckInCheckIn2);

        GoBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(CheckIn_inTesting.this, HomeScreen.class));
                startActivity(intent);
            }
        });

        CheckIn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                OpenDialog();
            }
        });


    }


    public void addItemstoSpinner()
    {
        spinner = (Spinner)findViewById(R.id.spinner);
        List<String> places = new ArrayList<>();
        places.add("Botanical Garden");
        places.add("The Gallery of Modern Art");
        places.add("The Edinburgh Castle");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,places);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
    }

    public void OpenDialog()
    {
        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();

        // Set Custom Title
        TextView title = new TextView(this);
        // Title Properties
        title.setText("Congrats, you just received an achievement!");
        title.setPadding(10, 10, 10, 10);   // Set Position
        title.setGravity(Gravity.CENTER);
        title.setTextColor(Color.BLACK);
        title.setTextSize(20);
        alertDialog.setCustomTitle(title);

        // Set Message
        TextView msg = new TextView(this);
        // Message Properties
        msg.setText("This 'GetAchievment()' function is used for testing. \n If you want to unblock achievement in user profile, \n" +
                "please click accept");
        msg.setGravity(Gravity.CENTER_HORIZONTAL);
        msg.setTextColor(Color.BLACK);
        alertDialog.setView(msg);


        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL," ", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                if(spinner.getSelectedItem() == "Botanical Garden")
                {
                    Intent intent1 = (new Intent(CheckIn_inTesting.this, UserProfile.class));
                    intent1.putExtra("Achievement1","Botanical Garden");
                    startActivity(intent1);
                    finish();
                }
            }
        });

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE," ", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                alertDialog.dismiss();
            }
        });

        new Dialog(getApplicationContext());
        alertDialog.show();

        // Set Properties for OK Button
        final Button okBT = alertDialog.getButton(AlertDialog.BUTTON_NEUTRAL);
        LinearLayout.LayoutParams neutralBtnLP = (LinearLayout.LayoutParams) okBT.getLayoutParams();
        neutralBtnLP.gravity = Gravity.FILL_HORIZONTAL;
        okBT.setPadding(50, 10, 10, 10);   // Set Position
        okBT.setTextColor(Color.BLUE);
        okBT.setLayoutParams(neutralBtnLP);
        okBT.setBackgroundResource(R.drawable.accept_button);

        final Button cancelBT = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE);
        LinearLayout.LayoutParams negBtnLP = (LinearLayout.LayoutParams) okBT.getLayoutParams();
        negBtnLP.gravity = Gravity.FILL_HORIZONTAL;
        cancelBT.setTextColor(Color.RED);
        cancelBT.setBackgroundResource(R.drawable.small_go_back);
        cancelBT.setLayoutParams(negBtnLP);
    }


}
