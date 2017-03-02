package com.wanosoft.dialogs;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alertDialog1(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoAlerta d1= new DialogoAlerta();
        d1.show(fragmentManager, "tagAlerta");
    }

    public void alertDialog2(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoConfirmacion d1= new DialogoConfirmacion();
        d1.show(fragmentManager, "tagAlerta");
    }

    public void alertDialog3(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoSeleccion d1= new DialogoSeleccion();
        d1.show(fragmentManager, "tagAlerta");
    }

    public void alerDialog4(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DialogoPersonalizado d1= new DialogoPersonalizado();
        d1.show(fragmentManager, "tagAlerta");
    }

    public void timePicker1(View view){
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

    public void datePicker1(View view){
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
}
