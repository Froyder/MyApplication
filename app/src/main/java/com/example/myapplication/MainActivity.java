package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.text_layout);

        Button button = findViewById(R.id.button2);
        final EditText text = findViewById(R.id.editTextTextPersonName);
        TextView greetingsField = findViewById(R.id.testField);
        Switch aSwitch = findViewById (R.id.switch2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = String.valueOf(text.getText().toString());
                if (name.equals("")) {
                    greetingsField.setText("Введите ваше имя");
                } else {
                    greetingsField.setText("Ваше имя - " + name);
                }
            }
        });

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  finalText.setBackgroundColor(534378);
                greetingsField.setBackgroundColor(Color.RED);
            }
        });

    }
}