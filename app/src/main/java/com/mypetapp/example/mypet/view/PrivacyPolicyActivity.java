package com.mypetapp.example.mypet.view;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mypetapp.example.mypet.R;

public class PrivacyPolicyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Privacy Policy");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
