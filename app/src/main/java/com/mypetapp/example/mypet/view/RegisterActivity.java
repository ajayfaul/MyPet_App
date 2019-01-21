package com.mypetapp.example.mypet.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mypetapp.example.mypet.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnLogin = findViewById(R.id.btn_Login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_Login:
                    Intent moveIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(moveIntent);
                    break;
            }
    }
}
