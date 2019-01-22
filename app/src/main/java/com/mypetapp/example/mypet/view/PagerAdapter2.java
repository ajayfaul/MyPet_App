package com.mypetapp.example.mypet.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mypetapp.example.mypet.view.fragmentpetadoption.VendorListFragment;
import com.mypetapp.example.mypet.view.fragmentpetadoption.YourOrderFragment;


public class PagerAdapter2 extends FragmentStatePagerAdapter {

    private int number_tabs;

    public PagerAdapter2(FragmentManager fm, int number_tabs) {
        super(fm);
        this.number_tabs = number_tabs;
    }

    //Mengembalikan Fragment yang terkait dengan posisi tertentu
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new VendorListFragment();
            case 1:
                return new YourOrderFragment();
            default:
                return null;
        }
    }

    //Mengembalikan jumlah tampilan yang tersedia.
    @Override
    public int getCount() {
        return number_tabs;
    }


}

