package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Science extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        Button SurgeonHalls = (Button)findViewById(R.id.surgeonHalls);
        SurgeonHalls.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Science.this, MapsActivity.class));
                String SurgeonHalls = "55.9467, -3.1853";
                intent.putExtra("Picked Location", SurgeonHalls);
                startActivity(intent);
            }
        });

        Button AnatomicalMuseum = (Button)findViewById(R.id.anatomicalMuseum);
        AnatomicalMuseum.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Science.this, MapsActivity.class));
                String AnatomicalMuseum = "55.9451, -3.1901";
                intent.putExtra("Picked Location", AnatomicalMuseum);
                startActivity(intent);
            }
        });

        Button NationalMuseumOfScotland = (Button)findViewById(R.id.NationalMuseumOfScotland);
        NationalMuseumOfScotland.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Science.this, MapsActivity.class));
                String NationalMuseumOfScotland = "55.9416629, -3.187165918";
                intent.putExtra("Picked Location", NationalMuseumOfScotland);
                startActivity(intent);
            }
        });

        Button CameraObscura = (Button)findViewById(R.id.CameraObscura);
        CameraObscura.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Science.this, MapsActivity.class));
                String CameraObscura = "55.9489145, -3.19548";
                intent.putExtra("Picked Location", CameraObscura);
                startActivity(intent);
            }
        });

        Button CityObservatory = (Button)findViewById(R.id.CityObservatory);
        CityObservatory.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Science.this, MapsActivity.class));
                String CityObservatory = "55.9490, -3.1957";
                intent.putExtra("Picked Location", CityObservatory);
                startActivity(intent);
            }
        });

        Button DynamicEarth = (Button)findViewById(R.id.DynamicEarth);
        DynamicEarth.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Science.this, MapsActivity.class));
                String DynamicEarth = "55.9505, -3.1744";
                intent.putExtra("Picked Location", DynamicEarth);
                startActivity(intent);
            }
        });

        Button RoyalObservatory = (Button)findViewById(R.id.RoyalObservatory);
        RoyalObservatory.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Science.this, MapsActivity.class));
                String RoyalObservatory = "55.9231, -3.1879";
                intent.putExtra("Picked Location", RoyalObservatory);
                startActivity(intent);
            }
        });

        Button NelsonMonument = (Button)findViewById(R.id.NelsonMonument);
        NelsonMonument.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Science.this, MapsActivity.class));
                String NelsonMonument = "55.9541331, -3.1875845";
                intent.putExtra("Picked Location", NelsonMonument);
                startActivity(intent);
            }
        });

        Button RoyalBotanicGarden = (Button)findViewById(R.id.RoyalBotanicGarden);
        RoyalBotanicGarden.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Science.this, MapsActivity.class));
                String RoyalBotanicGarden = "55.9594, -3.2040";
                intent.putExtra("Picked Location", RoyalBotanicGarden);
                startActivity(intent);
            }
        });
    }
}