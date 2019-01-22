package com.mypetapp.example.mypet.view;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import com.mypetapp.example.mypet.R;

public class SettingsActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView btnPrivacy, btnFeedback, btnAbout, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Settings");

        btnPrivacy = findViewById(R.id.privacy_btn);
        btnPrivacy.setOnClickListener(this);

        btnFeedback = findViewById(R.id.feedbackbutton);
        btnFeedback.setOnClickListener(this);

        btnAbout = findViewById(R.id.aboutbutton);
        btnAbout.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.privacy_btn:
                Intent moveIntent = new Intent(SettingsActivity.this, PrivacyPolicyActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.feedbackbutton:
                Intent moveIntent2 = new Intent(SettingsActivity.this, FeedbackActivity.class);
                startActivity(moveIntent2);
                break;
            case R.id.aboutbutton:
                Intent moveIntent3 = new Intent(SettingsActivity.this, AboutActivity.class);
                startActivity(moveIntent3);


        }
    }
}
