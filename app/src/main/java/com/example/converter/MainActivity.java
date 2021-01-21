package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goCurrency(View view) {
        Intent intent = new Intent(this, Currency.class);
        startActivity(intent);
    }

    public void goSpeed(View view) {
        Intent intent = new Intent(this, Speed.class);
        startActivity(intent);
    }

    public void goLength(View view) {
        Intent intent = new Intent(this, Length.class);
        startActivity(intent);
    }
}
