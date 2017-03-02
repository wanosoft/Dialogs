package com.wanosoft.dialogs;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.Log;

/**
 * Created by upam on 02/03/17.
 */

public class DialogoSeleccion extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] items = {"Español", "Inglés", "Francés"};

        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());

        builder.setTitle("Selección")
              /*
                .setItems(items, new DialogInterface.OnClickListener() { //Selección como Spinner
                    public void onClick(DialogInterface dialog, int item) {
                        Log.i("Dialogos", "Opción elegida: " + items[item]);
                    }
                });

                .setSingleChoiceItems(items, -1,
                        new DialogInterface.OnClickListener() { //Selección como RadioButton
                            public void onClick(DialogInterface dialog, int item) {
                                Log.i("Dialogos", "Opción elegida: " + items[item]);
                            }
                        });
                        */
                .setMultiChoiceItems(items, null,
                        new DialogInterface.OnMultiChoiceClickListener() { //Selección como Checkbox
                            public void onClick(DialogInterface dialog, int item, boolean isChecked) {
                                Log.i("Dialogos", "Opción elegida: " + items[item]);
                            }
                        });

        return builder.create();
    }
}