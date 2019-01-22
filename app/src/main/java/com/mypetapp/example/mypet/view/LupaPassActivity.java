package com.mypetapp.example.mypet.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.mypetapp.example.mypet.R;

public class LupaPassActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnSubmit, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lupa_pass);

        btnSubmit = findViewById(R.id.btn_SubmitForgot);
        btnSubmit.setOnClickListener(this);

        btnRegister = findViewById(R.id.btn_registerforgot);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_SubmitForgot:
                Intent moveIntent = new Intent(LupaPassActivity.this,
                        LupaPassActivity.class);
                    Toast.makeText(LupaPassActivity.this,
                            "Verifikasi Email telah dikirim",Toast.LENGTH_SHORT).show();
                    startActivity(moveIntent);
            break;
            case R.id.btn_registerforgot:
                Intent moveIntent2 = new Intent(LupaPassActivity.this, RegisterActivity.class);
                startActivity(moveIntent2);
        }
    }
}
