package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private String name;
    CheckBox cb;
    View layout;
    ToggleButton tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.text_layout);

        layout = findViewById(R.id.layout);
        Button button = findViewById(R.id.button2);
        final EditText text = findViewById(R.id.editTextTextPersonName);
        TextView greetingsField = findViewById(R.id.testField);
        Switch aSwitch = findViewById (R.id.switch2);
        cb = findViewById(R.id.checkBox2);
        tb = findViewById(R.id.toggleButton2);

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
                if (aSwitch.isChecked()) {
                    greetingsField.setBackgroundColor(Color.RED);
                } else {
                    greetingsField.setBackgroundColor(Color.GREEN);
                }
            }
        });
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

    public void checkBoxListener (View v) {
        if (cb.isChecked()) {
            layout.setBackgroundColor(Color.BLACK);
        } else layout.setBackgroundColor(Color.WHITE);
    }

    public void toggleButtonListener (View v) {
        if (tb.isChecked()) {
            Toast.makeText(this, "Мы что-то включили", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Мы что-то выключили", Toast.LENGTH_SHORT).show();
        }
    }

}