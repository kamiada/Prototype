package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Literature extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literature);

        Button WritersMuseum = (Button)findViewById(R.id.writersmuseum);
        WritersMuseum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Literature.this, MapsActivity.class));
                String WritersMuseum = "55.9496, -3.1939";
                intent.putExtra("Picked Location", WritersMuseum);
                startActivity(intent);
            }
        });

        Button MakarsCourt = (Button)findViewById(R.id.makarscourt);
        MakarsCourt.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Literature.this, MapsActivity.class));
                String MakarsCourt = "55.9497003, -3.1956305";
                intent.putExtra("Picked Location", MakarsCourt);
                startActivity(intent);
            }
        });

        Button NationalLibrary = (Button)findViewById(R.id.nationallibrary);
        NationalLibrary.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Literature.this, MapsActivity.class));
                String NationalLibrary = "55.9485782, -3.1941609";
                intent.putExtra("Picked Location", NationalLibrary);
                startActivity(intent);
            }
        });

        Button ScottishStorytellingCentre = (Button)findViewById(R.id.scottishstorytelling);
        ScottishStorytellingCentre.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Literature.this, MapsActivity.class));
                String ScottishStorytellingCentre = "55.9506153, -3.1870628";
                intent.putExtra("Picked Location", ScottishStorytellingCentre);
                startActivity(intent);
            }
        });

        Button ElephantHouse = (Button)findViewById(R.id.elephanthouse);
        ElephantHouse.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Literature.this, MapsActivity.class));
                String ElephantHouse = "55.9475692, -3.1939346";
                intent.putExtra("Picked Location", ElephantHouse);
                startActivity(intent);
            }
        });

        Button ArmchairBooks = (Button)findViewById(R.id.armchairbooks);
        ArmchairBooks.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Literature.this, MapsActivity.class));
                String ArmchairBooks = "55.946324, -3.2022197";
                intent.putExtra("Picked Location", ArmchairBooks);
                startActivity(intent);
            }
        });

        Button ScottMonument = (Button)findViewById(R.id.scottmonument);
        ScottMonument.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Literature.this, MapsActivity.class));
                String ScottMonument = "55.952381,-3.1954628";
                intent.putExtra("Picked Location", ScottMonument);
                startActivity(intent);
            }
        });

        Button ScottishPoetryLib = (Button)findViewById(R.id.scottishpoetrylib);
        ScottishPoetryLib.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Literature.this, MapsActivity.class));
                String ScottishPoetryLib = "55.9514237, -3.1802714";
                intent.putExtra("Picked Location", ScottishPoetryLib);
                startActivity(intent);
            }
        });

        Button OxfordBar = (Button)findViewById(R.id.oxfordbar);
        OxfordBar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Literature.this, MapsActivity.class));
                String OxfordBar = "55.9530024, -3.2068923";
                intent.putExtra("Picked Location", OxfordBar);
                startActivity(intent);
            }
        });
    }
}

