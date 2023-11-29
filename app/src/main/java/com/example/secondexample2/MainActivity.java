package com.example.secondexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
    }

    public void btnSubmitOnclick(View view) {
        String favoriteLanguage = spinner.getSelectedItem().toString();
        Toast.makeText(this, favoriteLanguage, Toast.LENGTH_SHORT).show();
    }
}