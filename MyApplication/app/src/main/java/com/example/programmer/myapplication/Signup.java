package com.example.programmer.myapplication;

/**
 * Created by programmer on 17/4/15.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by programmer on 17/4/15.
 */
public class Signup  extends Fragment{

    public Signup(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_main,container, false);
        return rootView;

    }


}
