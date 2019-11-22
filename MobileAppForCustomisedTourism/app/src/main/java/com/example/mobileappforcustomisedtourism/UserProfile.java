/**
 * Created by Adrianna Kaminska - 40213297
 * The prototype of mobile application for customised tourism (honors project 2019)
 * Edinburgh Napier University
 * UserProfile
 */

package com.example.mobileappforcustomisedtourism;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UserProfile extends AppCompatActivity {
    private FirebaseDatabase mFirebaseDatabase;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference myRef;
    private  String userID;
    private String email;
    private static final String TAG = "ViewDatabase";
    Button achievementBotanical;
    Button achievementArt;
    Button achievementCastle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);



            //declare the database reference object. This is what we use to access the database.
            //NOTE: Unless you are signed in, this will not be useable.
            mAuth = FirebaseAuth.getInstance();
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            myRef = mFirebaseDatabase.getReference();
            FirebaseUser user = mAuth.getCurrentUser();
            userID = user.getUid();
            email = user.getEmail();


            Button goBack = (Button)findViewById(R.id.btn_goBack);
            goBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = (new Intent(UserProfile.this, HomeScreen.class));
                    startActivity(intent);
                }
            });

            TextView showEmail = (TextView)findViewById(R.id.userEmail);
            showEmail.setText(email);

        //show achievements basing on Check_In in testing
        achievementBotanical = (Button)findViewById(R.id.achievement1);
        achievementArt = (Button)findViewById(R.id.achievement2);
        achievementCastle = (Button)findViewById(R.id.achievement3);


        Intent intentResult = this.getIntent();
        String result = intentResult.getStringExtra("Achievement1");
        boolean botanics = result.contains("Botanical Garden");
        boolean art = result.contains("Modern Art");
        boolean castle = result.contains("Castle");
        boolean noAchievement = result.contains("NoAchievement");
        if(botanics) {
            achievementBotanical.setBackgroundResource(R.drawable.achievement_visited_botanical_garden);
        }
        if(art)
        {
            achievementArt.setBackgroundResource(R.drawable.achievement_startedarttour);
        }
        if(castle)
        {
            achievementCastle.setBackgroundResource(R.drawable.achievement_visited_castle);
        }

        if(noAchievement)
        {
            achievementArt.setBackgroundResource(R.drawable.empty_achievement);
            achievementBotanical.setBackgroundResource(R.drawable.empty_achievement);
            achievementCastle.setBackgroundResource(R.drawable.empty_achievement);
        }




            mAuthListener = new FirebaseAuth.AuthStateListener() {
                @Override
                public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                    FirebaseUser user = firebaseAuth.getCurrentUser();
                    if (user != null) {
                        Log.d(TAG, "onAuthStateChanged:signed_in:" + user.getUid());
                    } else {
                        Log.d(TAG, "onAuthStateChanged:signed_out");
                    }
                }
            };
            myRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    showData(dataSnapshot);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                }
            });
        }
        private void showData(DataSnapshot dataSnapshot)
        {
            for(DataSnapshot ds : dataSnapshot.getChildren())
            {
                UserProfileInformation userInfo = new UserProfileInformation();
                userInfo.setEmail(ds.child(userID).getValue(UserProfileInformation.class).getEmail());
                TextView showEmail = (TextView)findViewById(R.id.userEmail);
                showEmail.setText(userInfo.getEmail());
                // showEmail = userInfo.getEmail();
            }

        }
    }
