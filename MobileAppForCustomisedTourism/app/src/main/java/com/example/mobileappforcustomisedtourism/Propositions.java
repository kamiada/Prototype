package com.example.mobileappforcustomisedtourism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;


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


        if(consistArt)
        {
            Button MA = new Button (this);
            MA.setBackgroundResource(R.drawable.modernart);
            layout.addView(MA);
            MA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", ScottishNationalGalleryMA);
                    startActivity(intent);
                }
            });

            final Button TalbotR = new Button (this);
            TalbotR.setBackgroundResource(R.drawable.talbotricegallery);
            TalbotR.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(TalbotR);
            TalbotR.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", TalbotRiceGallery);
                    startActivity(intent);
                }
            });

            final Button SNGallery = new Button (this);
            SNGallery.setBackgroundResource(R.drawable.nationalgallery);
            SNGallery.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(SNGallery);
            SNGallery.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", ScottishNationalGallery);
                    startActivity(intent);
                }
            });

            final Button Portrait = new Button (this);
            Portrait.setBackgroundResource(R.drawable.portraitgallery);
            Portrait.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Portrait);
            Portrait.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", PortraitGallery);
                    startActivity(intent);
                }
            });


            final Button CityArt = new Button (this);
            CityArt.setBackgroundResource(R.drawable.cityartcentre);
            CityArt.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(CityArt);
            CityArt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", CityArtCentre);
                    startActivity(intent);
                }
            });

            final Button Stills = new Button (this);
            Stills.setBackgroundResource(R.drawable.stills);
            Stills.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Stills);
            Stills.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", StillsGallery);
                    startActivity(intent);
                }
            });
        }


        if(consistHistoryAndCulture)
        {

        }

        if(consistLiterature)
        {
            Button Writers = new Button (this);
            Writers.setBackgroundResource(R.drawable.writersmuseum);
            layout.addView(Writers);
            Writers.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", WritersMuseum);
                    startActivity(intent);
                }
            });

            final Button Makars = new Button (this);
            Makars.setBackgroundResource(R.drawable.makarscourt);
            Makars.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Makars);
            Makars.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", MakarsCourt);
                    startActivity(intent);
                }
            });

            final Button Library = new Button (this);
            Library.setBackgroundResource(R.drawable.nationalibraryofscotland);
            Library.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Library);
            Library.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", NationalLibrary);
                    startActivity(intent);
                }
            });

            final Button Storytelling = new Button (this);
            Storytelling.setBackgroundResource(R.drawable.scottishstorytellingcentre);
            Storytelling.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Storytelling);
            Storytelling.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", ScottishStorytellingCentre);
                    startActivity(intent);
                }
            });

            final Button Elephant = new Button (this);
            Elephant.setBackgroundResource(R.drawable.elephanthouse);
            Elephant.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Elephant);
            Elephant.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", ElephantHouse);
                    startActivity(intent);
                }
            });

            final Button Armchair = new Button (this);
            Armchair.setBackgroundResource(R.drawable.armchair);
            Armchair.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Armchair);
            Armchair.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", ArmchairBooks);
                    startActivity(intent);
                }
            });

            final Button Scott = new Button (this);
            Scott.setBackgroundResource(R.drawable.scottmonument);
            Scott.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Scott);
            Scott.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", ScottMonument);
                    startActivity(intent);
                }
            });

            final Button Poetry = new Button (this);
            Poetry.setBackgroundResource(R.drawable.scottishpoetrylibrary);
            Poetry.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Poetry);
            Poetry.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", ScottishPoetryLib);
                    startActivity(intent);
                }
            });

            final Button Oxford = new Button (this);
            Oxford.setBackgroundResource(R.drawable.oxfordpub);
            Oxford.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(Oxford);
            Oxford.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", OxfordBar);
                    startActivity(intent);
                }
            });
        }

        if(consistScience)
        {
            Button AnatomicMuseum = new Button (this);
            AnatomicMuseum.setBackgroundResource(R.drawable.anatomicalmuseum);
            layout.addView(AnatomicMuseum);
            AnatomicMuseum.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", AnatomicalMuseum);
                    startActivity(intent);
                }
            });

            final Button SurgeonHalls1 = new Button (this);
            SurgeonHalls1.setBackgroundResource(R.drawable.surgeonhalls);
            SurgeonHalls1.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(SurgeonHalls1);
            SurgeonHalls1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", SurgeonHalls);
                    startActivity(intent);
                }
            });

            final Button NationalMuseumOfScotland1 = new Button (this);
            NationalMuseumOfScotland1.setBackgroundResource(R.drawable.nationalmuseum);
            NationalMuseumOfScotland1.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(NationalMuseumOfScotland1);
            NationalMuseumOfScotland1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", NationalMuseumOfScotland);
                    startActivity(intent);
                }
            });

            final Button CameraObscura1 = new Button (this);
            CameraObscura1.setBackgroundResource(R.drawable.illusioncameraobscura);
            CameraObscura1.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(CameraObscura1);
            CameraObscura1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", CameraObscura);
                    startActivity(intent);
                }
            });

            final Button CObservatory = new Button (this);
            CObservatory.setBackgroundResource(R.drawable.cityobservatory);
            CObservatory.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(CObservatory);
            CObservatory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", CityObservatory);
                    startActivity(intent);
                }
            });

            final Button DynamicEarth1 = new Button (this);
            DynamicEarth1.setBackgroundResource(R.drawable.dynamicearth);
            DynamicEarth1.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(DynamicEarth1);
            DynamicEarth1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", DynamicEarth);
                    startActivity(intent);
                }
            });

            final Button RObservatory = new Button (this);
            RObservatory.setBackgroundResource(R.drawable.royalobservatory);
            RObservatory.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(RObservatory);
            RObservatory.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", RoyalObservatory);
                    startActivity(intent);
                }
            });

            final Button NMonument = new Button (this);
            NMonument.setBackgroundResource(R.drawable.nelsonmonument);
            NMonument.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(NMonument);
            NMonument.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", NelsonMonument);
                    startActivity(intent);
                }
            });

            final Button RBGardens = new Button (this);
            RBGardens.setBackgroundResource(R.drawable.royalbotanicalgarden);
            RBGardens.setLayoutParams(new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.addView(RBGardens);
            RBGardens.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(Propositions.this, MapsActivity.class));
                    intent.putExtra("Picked Location", RoyalBotanicGarden);
                    startActivity(intent);
                }
            });

        }
    }
}
