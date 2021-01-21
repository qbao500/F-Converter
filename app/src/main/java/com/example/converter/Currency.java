package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class Currency extends AppCompatActivity {

    public void dollarConvert(View view) {
        EditText enterusd = (EditText) findViewById(R.id.usd);
        if (enterusd.getText().length() == 0) {
            enterusd.setText("0");
            enterusd.selectAll();
        }
        float dollars = Float.parseFloat(enterusd.getText().toString());
        float euro = 23/26f;
        float dong = 23000f;
        float result1 = Math.round(dollars * euro * 100f)/100f;
        int result2 = (int) (Math.ceil(dollars * dong /1000f)*1000f);

        TextView viewEuro = (TextView) findViewById(R.id.euro);
        viewEuro.setText(Float.toString(result1));
        TextView viewDong = (TextView) findViewById(R.id.dong);
        viewDong.setText(Integer.toString(result2));
    }

    public void euroConvert(View view){
        EditText entereuro = (EditText) findViewById(R.id.euro);
        if (entereuro.getText().length() == 0) {
            entereuro.setText("0");
            entereuro.selectAll();
        }
        float euro = Float.parseFloat(entereuro.getText().toString());
        float dollars = 26/23f;
        float dong = 26000f;
        float result1 = Math.round(euro * dollars * 100f)/100f;
        int result2 = (int) (Math.ceil(euro * dong /1000f)*1000f);

        TextView viewDollar = (TextView)findViewById(R.id.usd);
        viewDollar.setText(Float.toString(result1));
        TextView viewDong = (TextView) findViewById(R.id.dong);
        viewDong.setText(Integer.toString(result2));
    }

    public void dongConvert(View view){
        EditText enterdong = (EditText) findViewById(R.id.dong);
        if (enterdong.getText().length() == 0) {
            enterdong.setText("0");
            enterdong.selectAll();
        }
        float dong = Float.parseFloat(enterdong.getText().toString());
        float dollars = 1/23000f;
        float euro = 1/26000f;
        float result1 = Math.round(dollars * dong * 100f)/100f;
        float result2 = Math.round(euro * dong * 100f)/100f;

        TextView viewDollar = (TextView)findViewById(R.id.usd);
        viewDollar.setText(Float.toString(result1));
        TextView viewEuro = (TextView)findViewById(R.id.euro);
        viewEuro.setText(Float.toString(result2));
    }

    public void hideKeyboard(View view) {
        InputMethodManager hide = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        hide.hideSoftInputFromWindow(view.getWindowToken(), 0);

        EditText dollar = (EditText)findViewById(R.id.usd);
        dollar.clearFocus();
        EditText euro = (EditText)findViewById(R.id.euro);
        euro.clearFocus();
        EditText dong = (EditText)findViewById(R.id.dong);
        dong.clearFocus();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
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
