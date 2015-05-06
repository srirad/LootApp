package com.example.programmer.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by programmer on 22/4/15.
 */


public class Detail1  extends Fragment {

    public Detail1(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_details1,container, false);
        return rootView;

    }


}