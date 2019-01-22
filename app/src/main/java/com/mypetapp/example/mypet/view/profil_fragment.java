package com.mypetapp.example.mypet.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mypetapp.example.mypet.R;

public class profil_fragment extends Fragment{

    private Button btnadd, btnedit;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_profil, null);
    }

    @Override
    public void onViewCreated(View v, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(v, savedInstanceState);

            btnadd = (Button) v.findViewById(R.id.btndadd);
            btnadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent moveIntent = new Intent(getActivity(), adoptionActivity.class);
                    getActivity().startActivity(moveIntent);
                }
            });

            btnedit = (Button) v.findViewById(R.id.btnservice);
            btnedit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent moveIntent2 = new Intent(getActivity(), editserActivity.class);
                    getActivity().startActivity(moveIntent2);
                }
            });
    }
}