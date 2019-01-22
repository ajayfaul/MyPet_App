package com.mypetapp.example.mypet.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mypetapp.example.mypet.R;

import butterknife.OnClick;



import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {


    Button btnLogin, btnRegister;
    TextView btnForgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(this);

        btnForgotPass = findViewById(R.id.btnForgotPassword);
        btnForgotPass.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnLogin:
                    Intent moveIntent = new Intent(LoginActivity.this, menuNav.class);
                    startActivity(moveIntent);
                    break;
                case R.id.btnRegister:
                    Intent moveIntent2 = new Intent(LoginActivity.this, RegisterActivity.class);
                    startActivity(moveIntent2);
                case R.id.btnForgotPassword:
                    Intent moveIntent3 = new Intent(LoginActivity.this, LupaPassActivity.class);
                    startActivity(moveIntent3);

            }
    }
}
