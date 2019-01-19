package com.mypetapp.example.mypet.view;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mypetapp.example.mypet.R;

public class splash_activity extends AppCompatActivity {
    private static int waktu = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashinten = new Intent(splash_activity.this, menuNav.class);
                startActivity(splashinten);
                finish();

            }

        }, waktu);
    }

}
