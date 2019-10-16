package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HistoryAndCulture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_and_culture);



        Button WritersMuseum = (Button)findViewById(R.id.writersmuseum);
        WritersMuseum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String WritersMuseum = "55.9496, -3.1939";
                intent.putExtra("Picked Location", WritersMuseum);
                startActivity(intent);
            }
        });

        Button theMound = (Button)findViewById(R.id.mound);
        theMound.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String theMound = "55.951053, -3.1985449";
                intent.putExtra("Picked Location", theMound);
                startActivity(intent);
            }
        });

        Button GladsoneLand = (Button)findViewById(R.id.gladstoneland);
        GladsoneLand.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String GladsoneLand = "55.9494484, -3.195858";
                intent.putExtra("Picked Location", GladsoneLand);
                startActivity(intent);
            }
        });

        Button NationalWarMuseum = (Button)findViewById(R.id.nationalwarmuseum);
        NationalWarMuseum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String NationalWarMuseum = "55.9485514, -3.202909";
                intent.putExtra("Picked Location", NationalWarMuseum);
                startActivity(intent);
            }
        });

        Button ScotchWhiskyExperience = (Button)findViewById(R.id.whiskyexperience);
        ScotchWhiskyExperience.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String ScotchWhiskyExperience = "55.9487357, -3.1980995";
                intent.putExtra("Picked Location", ScotchWhiskyExperience);
                startActivity(intent);
            }
        });

        Button MuseumOfChildhood = (Button)findViewById(R.id.museumofchildhood);
        MuseumOfChildhood.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String MuseumOfChildhood = "55.9504, -3.1855";
                intent.putExtra("Picked Location", MuseumOfChildhood);
                startActivity(intent);
            }
        });

        Button JohnKnox = (Button)findViewById(R.id.johnknox);
        JohnKnox.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String JohnKnox = "55.950602, -3.1873052";
                intent.putExtra("Picked Location", JohnKnox);
                startActivity(intent);
            }
        });

        Button ThePeopleStoryMuseum = (Button)findViewById(R.id.peoplestorymuseum);
        ThePeopleStoryMuseum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String ThePeopleStoryMuseum = "55.9514809, -3.1820342";
                intent.putExtra("Picked Location", ThePeopleStoryMuseum);
                startActivity(intent);
            }
        });

        Button MuseumOfEdinburgh = (Button)findViewById(R.id.museumofedinburgh);
        MuseumOfEdinburgh.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String MuseumOfEdinburgh = "55.9514806, -3.1886003";
                intent.putExtra("Picked Location", MuseumOfEdinburgh);
                startActivity(intent);
            }
        });

        Button NationalMuseumOfScotland = (Button)findViewById(R.id.NMSScotland);
        NationalMuseumOfScotland.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String NationalMuseumOfScotland = "55.9416629, -3.187165918";
                intent.putExtra("Picked Location", NationalMuseumOfScotland);
                startActivity(intent);
            }
        });

        Button GeorgianHouse = (Button)findViewById(R.id.georgianhouse);
        GeorgianHouse.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String GeorgianHouse = "55.9525391, -3.2101351";
                intent.putExtra("Picked Location", GeorgianHouse);
                startActivity(intent);
            }
        });

        Button PalaceofHolyroodhouse= (Button)findViewById(R.id.holyroodhouse);
        PalaceofHolyroodhouse.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String PalaceofHolyroodhouse = "55.9527, -3.1723";
                intent.putExtra("Picked Location", PalaceofHolyroodhouse);
                startActivity(intent);
            }
        });

        Button LivingMemoryA= (Button)findViewById(R.id.livingmemory);
        LivingMemoryA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String LivingMemoryA = "555.9320715, -3.4862353";
                intent.putExtra("Picked Location", LivingMemoryA);
                startActivity(intent);
            }
        });

        Button HeartMuseum= (Button)findViewById(R.id.hearts);
        HeartMuseum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String HeartMuseum = "55.9388825, -3.2351333";
                intent.putExtra("Picked Location", HeartMuseum);
                startActivity(intent);
            }
        });

        Button RoyalYacht= (Button)findViewById(R.id.royalyacht);
        RoyalYacht.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String RoyalYacht = "55.9821554, -3.1794408";
                intent.putExtra("Picked Location", RoyalYacht);
                startActivity(intent);
            }
        });

        Button Greyfriars= (Button)findViewById(R.id.greyfriars);
        RoyalYacht.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String Greyfriars = "55.9471682, -3.1949848";
                intent.putExtra("Picked Location", Greyfriars);
                startActivity(intent);
            }
        });

        Button LauristonCastle= (Button)findViewById(R.id.lauristoncastle);
        LauristonCastle.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String LauristonCastle = "55.9711806, -3.2806528";
                intent.putExtra("Picked Location", LauristonCastle);
                startActivity(intent);
            }
        });

        Button NationalMiningMuseum= (Button)findViewById(R.id.nationalminingmuseum);
        NationalMiningMuseum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(HistoryAndCulture.this, MapsActivity.class));
                String NationalMiningMuseum = "55.862367, -3.0688767";
                intent.putExtra("Picked Location", NationalMiningMuseum);
                startActivity(intent);
            }
        });

    }
}

