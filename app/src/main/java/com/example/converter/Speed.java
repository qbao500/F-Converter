package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class Speed extends AppCompatActivity {

    public void kmhConvert(View view) {
        EditText enterkmh = (EditText) findViewById(R.id.kmh);
        if (enterkmh.getText().length() == 0) {
            enterkmh.setText("0");
            enterkmh.selectAll();
        }

        float kmh = Float.parseFloat(enterkmh.getText().toString());
        float ms = 0.277778f;
        float mph = 0.621371f;
        float result1 = Math.round(kmh * ms * 1000f)/1000f;
        float result2 = Math.round(kmh * mph * 1000f)/1000f;

        TextView viewms = (TextView) findViewById(R.id.ms);
        viewms.setText(Float.toString(result1));
        TextView viewmph = (TextView) findViewById(R.id.mph);
        viewmph.setText(Float.toString(result2));
    }

    public void msConvert(View view){
        EditText enterms = (EditText) findViewById(R.id.ms);
        if (enterms.getText().length() == 0) {
            enterms.setText("0");
            enterms.selectAll();
        }
        float ms = Float.parseFloat(enterms.getText().toString());
        float kmh = 3.6f;
        float mph = 2.236936f;
        float result1 = Math.round(ms * kmh * 1000f)/1000f;
        float result2 = Math.round(ms * mph * 1000f)/1000f;

        TextView viewkmh = (TextView) findViewById(R.id.kmh);
        viewkmh.setText(Float.toString(result1));
        TextView viewmph = (TextView) findViewById(R.id.mph);
        viewmph.setText(Float.toString(result2));
    }

    public void mphConvert(View view){
        EditText entermph = (EditText) findViewById(R.id.mph);
        if (entermph.getText().length() == 0) {
            entermph.setText("0");
            entermph.selectAll();
        }
        float mph = Float.parseFloat(entermph.getText().toString());
        float kmh = 1.609344f;
        float ms = 0.44704f;
        float result1 = Math.round(mph * kmh * 1000f)/1000f;
        float result2 = Math.round(mph * ms * 1000f)/1000f;

        TextView viewkmh = (TextView) findViewById(R.id.kmh);
        viewkmh.setText(Float.toString(result1));
        TextView viewms = (TextView) findViewById(R.id.ms);
        viewms.setText(Float.toString(result2));
    }

    public void hideKeyboard(View view) {
        InputMethodManager hide = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        hide.hideSoftInputFromWindow(view.getWindowToken(), 0);

        EditText kmh = (EditText)findViewById(R.id.kmh);
        kmh.clearFocus();
        EditText ms = (EditText)findViewById(R.id.ms);
        ms.clearFocus();
        EditText mph = (EditText)findViewById(R.id.mph);
        mph.clearFocus();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
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
