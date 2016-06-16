package com.acadgild.balu.acd_an_session_12_assignment_3_main;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements LayoutInfo
{
    Layout1 fragmentLayout1;
    Layout2 fragmentLayout2;
    Layout3 fragmentLayout3;
    Layout4 fragmentLayout4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void Display_Layout(int layout_number)
    {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (layout_number)
        {
            case 1: {
                fragmentLayout1 = new Layout1();
                fragmentTransaction.replace(R.id.fragmentFrame, fragmentLayout1);
                fragmentTransaction.commit();
                break;
            }
            case 2: {
                fragmentLayout2 = new Layout2();
                fragmentTransaction.replace(R.id.fragmentFrame, fragmentLayout2);
                fragmentTransaction.commit();
                break;
            }
            case 3: {
                fragmentLayout3 = new Layout3();
                fragmentTransaction.replace(R.id.fragmentFrame, fragmentLayout3);
                fragmentTransaction.commit();
                break;
            }
            case 4: {
                fragmentLayout4 = new Layout4();
                fragmentTransaction.replace(R.id.fragmentFrame, fragmentLayout4);
                fragmentTransaction.commit();
                break;
            }
        }
    }
}
