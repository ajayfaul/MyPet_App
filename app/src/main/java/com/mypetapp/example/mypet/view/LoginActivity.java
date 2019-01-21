package com.mypetapp.example.mypet.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.mypetapp.example.mypet.R;

import butterknife.OnClick;



import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnLogin:
                    Intent moveIntent = new Intent(LoginActivity.this, menuNav.class);
                    startActivity(moveIntent);
                    break;
            }
    }
}
