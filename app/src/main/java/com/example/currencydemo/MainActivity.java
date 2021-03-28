package com.example.currencydemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNumber = findViewById(R.id.editNumber);
    }

    public void przelicz(View view) {
        if (editNumber.getText().toString().equals("")|| editNumber.getText().toString().matches(".*[^a-z].*")){
            Toast.makeText(this, "wpisz liczbę", Toast.LENGTH_SHORT).show();
        }
        else
        {
            double eur = (double) (Double.parseDouble(editNumber.getText().toString()) * 0.21);
            Toast.makeText(this, eur + " euro", Toast.LENGTH_LONG).show();
        }

    }
}
