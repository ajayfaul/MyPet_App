package com.mypetapp.example.mypet.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mypetapp.example.mypet.R;
import com.mypetapp.example.mypet.view.veiwActivity.SettingsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Home_fragment extends Fragment {

    Intent intent;

    /**
     * A simple {@link Fragment} subclass.
     * Activities that contain this fragment must implement the
     * {@link Home_fragment.OnFragmentInteractionListener} interface
     * to handle interaction events.
     * Use the {@link Home_fragment#newInstance} factory method to
     * create an instance of this fragment.
     */
//    deklarasi untuk klik
    @BindView(R.id.imgsetting)
    ImageView imgsetting;
    @BindView(R.id.imgnotif)
    ImageView imgnotif;
    @BindView(R.id.imgadoption)
    ImageView imgadoption;
    @BindView(R.id.imgpetgroming)
    ImageView imgpetgroming;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private BlankFragment.OnFragmentInteractionListener mListener;

    public Home_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters
    public static Home_fragment newInstance(String param1, String param2) {
        Home_fragment fragment = new Home_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragmen_home, container, false);
        ButterKnife.bind(this,view);

        return view;
    }


    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }



    //Untuk membuat event klik dari butter knife gunakan @OnCLick(R.id.namaidview) terus kasih void klik()
    @OnClick(R.id.imgnotif)
    public void Klik(){
        Intent i=new Intent(getContext(), SettingsActivity.class);
        startActivity(i);
    }
//    klik setting
    @OnClick(R.id.imgsetting)
    public void Klik2(){
        Intent i=new Intent(getContext(),SettingsActivity.class);
        startActivity(i);
    }
//   klik petgroming
    @OnClick(R.id.imgadoption)
    public void Klik3(){
        Intent i=new Intent(getContext(),SettingsActivity.class);
        startActivity(i);
    }
//  klik adoption
    @OnClick(R.id.imgpetgroming)
    public void Klik4(){
        Intent i=new Intent(getContext(),SettingsActivity.class);
        startActivity(i);
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        /**
         * @param uri
         */
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}


