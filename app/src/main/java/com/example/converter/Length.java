package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class Length extends AppCompatActivity {

    public void metConvert(View view) {
        EditText entermet = (EditText) findViewById(R.id.met);
        if (entermet.getText().length() == 0) {
            entermet.setText("0");
            entermet.selectAll();
        }
        float met = Float.parseFloat(entermet.getText().toString());
        float ft = 3.28084f;
        float in = 39.37008f;
        float result1 = Math.round(met * ft * 1000f)/1000f;
        float result2 = Math.round(met * in * 1000f)/1000f;

        TextView viewft = (TextView) findViewById(R.id.ft);
        viewft.setText(Float.toString(result1));
        TextView viewin = (TextView) findViewById(R.id.in);
        viewin.setText(Float.toString(result2));
    }

    public void ftConvert(View view){
        EditText enterft = (EditText) findViewById(R.id.ft);
        if (enterft.getText().length() == 0) {
            enterft.setText("0");
            enterft.selectAll();
        }
        float ft = Float.parseFloat(enterft.getText().toString());
        float met = 0.3048f;
        float in = 12f;
        float result1 = Math.round(ft * met * 1000f)/1000f;
        float result2 = Math.round(ft * in * 1000f)/1000f;

        TextView viewmet = (TextView) findViewById(R.id.met);
        viewmet.setText(Float.toString(result1));
        TextView viewin = (TextView) findViewById(R.id.in);
        viewin.setText(Float.toString(result2));
    }

    public void inConvert(View view){
        EditText enterin = (EditText) findViewById(R.id.in);
        if (enterin.getText().length() == 0) {
            enterin.setText("0");
            enterin.selectAll();
        }
        float in = Float.parseFloat(enterin.getText().toString());
        float met = 0.0254f;
        float ft = 0.083333f;
        float result1 = Math.round(in * met * 1000f)/1000f;
        float result2 = Math.round(in * ft * 1000f)/1000f;

        TextView viewmet = (TextView) findViewById(R.id.met);
        viewmet.setText(Float.toString(result1));
        TextView viewft = (TextView) findViewById(R.id.ft);
        viewft.setText(Float.toString(result2));
    }

    public void hideKeyboard(View view) {
        InputMethodManager hide = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        hide.hideSoftInputFromWindow(view.getWindowToken(), 0);

        EditText met = (EditText)findViewById(R.id.met);
        met.clearFocus();
        EditText ft = (EditText)findViewById(R.id.ft);
        ft.clearFocus();
        EditText in = (EditText)findViewById(R.id.in);
        in.clearFocus();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if (id == android.R.id.home)
        {
            onBackPressed();
            return true;
        }
        else
        {
            return super.onOptionsItemSelected(item);
        }
    }
}
