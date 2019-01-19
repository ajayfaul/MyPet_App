package com.mypetapp.example.mypet.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.mypetapp.example.mypet.R;

public class Home_fragment extends Fragment{

    Intent intent;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmen_home, null);

        intent = new Intent(getActivity(), SettingsActivity.class);
        final ImageButton btnSetting = (ImageButton) view.findViewById(R.id.setting);

        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });


        return view;
    }

}

