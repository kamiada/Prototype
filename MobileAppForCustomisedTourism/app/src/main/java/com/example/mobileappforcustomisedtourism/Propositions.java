package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Propositions extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propositions);

        LinearLayout layout = (LinearLayout)findViewById(R.id.LinearLayout);
        Intent intentResult = this.getIntent();
        String result = intentResult.getStringExtra("CheckedBoxes");
        boolean consistArt = result.contains("Art ");
        boolean consistScience = result.contains("Science ");
        boolean consistHistoryAndCulture = result.contains("History and Culture ");
        boolean consistLiterature = result.contains("Literature ");


        //ART
        final String ScottishNationalGalleryMA = "55.9508233, -3.2276456";
        final String TalbotRiceGallery = "55.9473272, -3.1901138";
        final String ScottishNationalGallery = "55.9508623, -3.2204207";
        final String PortraitGallery = "55.955501, -3.1957337";
        final String CityArtCentre = "55.9510817, -3.1915918";
        final String StillsGallery = "55.950679, -3.1924417";

        //LITERATURE
        final String WritersMuseum = "55.9496, -3.1939";
        final String MakarsCourt = "55.9497003, -3.1956305";
        final String NationalLibrary = "55.9485782, -3.1941609";
        final String ScottishStorytellingCentre = "55.9506153, -3.1870628";
        final String ElephantHouse = "55.9475692, -3.1939346";
        final String ArmchairBooks = "55.946324, -3.2022197";
        final String ScottMonument = "55.952381,-3.1954628";
        final String ScottishPoetryLib = "55.9514237, -3.1802714";
        final String OxfordBar = "55.9530024, -3.2068923";

        //HISTORY AND CULTURE
        final String theMound = "55.951053, -3.1985449";
        final String GladsoneLand = "55.9494484, -3.195858";
        final String NationalWarMuseum = "55.9485514, -3.202909";
        final String ScotchWhiskyExperience = "55.9487357, -3.1980995";
        final String MuseumOfChildhood = "55.9504, -3.1855";
        final String JohnKnox = "55.950602, -3.1873052";
        final String ThePeopleStoryMuseum = "55.9514809, -3.1820342";
        final String MuseumOfEdinburgh = "55.9514806, -3.1886003";
        final String GeorgianHouse = "55.9525391, -3.2101351";
        final String PalaceofHolyroodhouse = "55.9527, -3.1723";
        final String LivingMemoryA = "555.9320715, -3.4862353";
        final String HeartMuseum = "55.9388825, -3.2351333";
        final String RoyalYacht = "55.9821554, -3.1794408";
        final String Greyfriars = "55.9471682, -3.1949848";
        final String LauristonCastle = "55.9711806, -3.2806528";
        final String NationalMiningMuseum = "55.862367, -3.0688767";

        //SCIENCE
        final String SurgeonHalls = "55.9467, -3.1853";
        final String AnatomicalMuseum = "55.9451, -3.1901";
        final String NationalMuseumOfScotland = "55.9416629, -3.187165918";
        final String CameraObscura = "55.9489145, -3.19548";
        final String CityObservatory = "55.9490, -3.1957";
        final String DynamicEarth = "55.9505, -3.1744";
        final String RoyalObservatory = "55.9231, -3.1879";
        final String NelsonMonument = "55.9541331, -3.1875845";
        final String RoyalBotanicGarden = "55.9594, -3.2040";


        
    }
}
