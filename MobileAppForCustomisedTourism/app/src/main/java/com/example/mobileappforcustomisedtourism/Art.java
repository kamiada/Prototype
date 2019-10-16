package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Art extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        Button ScottishNationalGalleryMA = (Button)findViewById(R.id.scottishnationalgalleryofmodernart);
        ScottishNationalGalleryMA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Art.this, MapsActivity.class));
                String ScottishNationalGalleryMA = "55.9508233, -3.2276456";
                intent.putExtra("Picked Location", ScottishNationalGalleryMA);
                startActivity(intent);
            }
        });

        Button TalbotRiceGallery = (Button)findViewById(R.id.talbotricegallery);
        TalbotRiceGallery.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Art.this, MapsActivity.class));
                String TalbotRiceGallery = "55.9473272, -3.1901138";
                intent.putExtra("Picked Location", TalbotRiceGallery);
                startActivity(intent);
            }
        });

        Button ScottishNationalGallery = (Button)findViewById(R.id.scottishnationalgallery);
        ScottishNationalGallery.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Art.this, MapsActivity.class));
                String ScottishNationalGallery = "55.9508623, -3.2204207";
                intent.putExtra("Picked Location", ScottishNationalGallery);
                startActivity(intent);
            }
        });

        Button PortraitGallery = (Button)findViewById(R.id.portraitgallery);
        PortraitGallery.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Art.this, MapsActivity.class));
                String PortraitGallery = "55.955501, -3.1957337";
                intent.putExtra("Picked Location", PortraitGallery);
                startActivity(intent);
            }
        });

        Button CityArtCentre = (Button)findViewById(R.id.cityartcentre);
        CityArtCentre.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Art.this, MapsActivity.class));
                String CityArtCentre = "55.9510817, -3.1915918";
                intent.putExtra("Picked Location", CityArtCentre);
                startActivity(intent);
            }
        });

        Button StillsGallery = (Button)findViewById(R.id.stills);
        StillsGallery.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = (new Intent(Art.this, MapsActivity.class));
                String StillsGallery = "55.950679, -3.1924417";
                intent.putExtra("Picked Location", StillsGallery);
                startActivity(intent);
            }
        });
    }
}
