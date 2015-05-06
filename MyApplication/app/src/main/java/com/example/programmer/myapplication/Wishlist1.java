package com.example.programmer.myapplication;

/**
 * Created by programmer on 20/4/15.
 */

        import android.app.Fragment;
        import android.content.res.AssetManager;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.TextView;
        import android.graphics.Typeface;




/**
 * Created by programmer on 17/4/15.
 */
public class Wishlist1  extends Fragment{

    public Wishlist1(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View rootView = inflater.inflate(R.layout.fragment_wishlist,container, false);
        return rootView;
        //TextView myTextView=(TextView)findViewById(R.id.wishcoins);
        //Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/JennaSue.ttf");
        //myTextView.setTypeface(typeFace);

    }

}