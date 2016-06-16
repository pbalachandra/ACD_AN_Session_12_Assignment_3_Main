package com.acadgild.balu.acd_an_session_12_assignment_3_main;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonsFragment extends Fragment {

    LayoutInfo  layoutInfo;
    public ButtonsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_buttons, container, false);

        Button button_layout1 = (Button) view.findViewById(R.id.button_layout1);
        Button button_layout2 = (Button) view.findViewById(R.id.button_layout2);
        Button button_layout3 = (Button) view.findViewById(R.id.button_layout3);
        Button button_layout4 = (Button) view.findViewById(R.id.button_layout4);

        button_layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                layoutInfo.Display_Layout(1);
            }
        });

        button_layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                layoutInfo.Display_Layout(2);
            }
        });

        button_layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                layoutInfo.Display_Layout(3);
            }
        });

        button_layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                layoutInfo.Display_Layout(4);
            }

        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        layoutInfo = (LayoutInfo) getActivity();
    }
}
