package com.example.chemistry;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.ChoiceFormat;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FlamesLevelOne.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FlamesLevelOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FlamesLevelOne extends Fragment implements View.OnTouchListener, View.OnDragListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    Button menu;
    NavController navController;
    ImageView copper, calcium, lithium, potassium, radium, lead, petri;
    TextView score;


    public FlamesLevelOne() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FlamesLevelOne.
     */
    // TODO: Rename and change types and number of parameters
    public static FlamesLevelOne newInstance(String param1, String param2) {
        FlamesLevelOne fragment = new FlamesLevelOne();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_flames_level_one, container, false);
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
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    //work on this method

    @Override
    public boolean onDrag(View v, DragEvent event) {
        int action = event.getAction();
        switch (event.getAction()) {
            case DragEvent.ACTION_DRAG_STARTED:

                break;
            case DragEvent.ACTION_DRAG_ENTERED:

                break;
            case DragEvent.ACTION_DRAG_EXITED:

                break;
            case DragEvent.ACTION_DROP:
                ImageView copper = (ImageView) event.getLocalState();
                ((ImageView)v).setImageDrawable(getResources().getDrawable(R.drawable.coppertile));
                ((ImageView)copper).setImageDrawable(null);
                break;
            case DragEvent.ACTION_DRAG_ENDED:
                break;
            default:
                break;
        }
        return true;
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(null, shadowBuilder, v, 0);
            //v.setVisibility(View.INVISIBLE);
            return true;
        } else {
            return false;
        }
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
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        copper = view.findViewById(R.id.CopperImage);
        copper.setOnTouchListener(this);
        copper.setOnDragListener(this);

        calcium = view.findViewById(R.id.calciumImage);
        calcium.setOnDragListener(this);

        lithium = view.findViewById(R.id.LithiumImage);
        lithium.setOnDragListener(this);

        potassium = view.findViewById(R.id.PotassiumImage);
        potassium.setOnDragListener(this);

        lead = view.findViewById(R.id.LeadImage);
        lead.setOnDragListener(this);

        radium = view.findViewById(R.id.RadiumImage);
        radium.setOnDragListener(this);

        score = view.findViewById(R.id.score);

        //float x = radium.getX();
        //System.out.println(x);
        //String str = String.valueOf(x);
        //score.setText(str);

        menu = view.findViewById(R.id.menuFlameOne);
        navController = Navigation.findNavController(view);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.action_flamesLevelOne_to_start3);
            }
        });
    }

}
