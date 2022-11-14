package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertCash(View view) {

        EditText cashEditText = findViewById(R.id.cashEditText);

        Log.i("Info", "Conversion...");

        String pln = cashEditText.getText().toString();

        double poundsDouble = Double.parseDouble(pln);
        double plnPoundDouble = poundsDouble * 4.69;

        String plnString = String.format("%.2f", plnPoundDouble);

        Log.i("Ile funtów z " + pln + " złotych?", plnString);

        Toast.makeText(this, pln + "£ " + " = " + plnString + "zł", Toast.LENGTH_LONG).show();




















    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}