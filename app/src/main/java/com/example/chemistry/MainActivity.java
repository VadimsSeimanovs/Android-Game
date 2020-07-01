package com.example.chemistry;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity implements Start.OnFragmentInteractionListener, Topics.OnFragmentInteractionListener, Score.OnFragmentInteractionListener, Achievements.OnFragmentInteractionListener, Settings.OnFragmentInteractionListener, Compounds.OnFragmentInteractionListener,
Flames.OnFragmentInteractionListener, FlamesLevelOne.OnFragmentInteractionListener, FlamesLevelTwo.OnFragmentInteractionListener, FlamesLevelThree.OnFragmentInteractionListener, FlamesLevelFour.OnFragmentInteractionListener, FlamesLevelFive.OnFragmentInteractionListener,
CompoundLevelOne.OnFragmentInteractionListener, CompoundLevelTwo.OnFragmentInteractionListener, CompoundLevelThree.OnFragmentInteractionListener, CompoundLevelFour.OnFragmentInteractionListener, CompoundLevelFive.OnFragmentInteractionListener{




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void changeBackground(){


    }
}
