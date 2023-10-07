package com.example.androidlab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    Button b0k;
    EditText textColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0k = findViewById(R.id.b0k);
        textColor = findViewById(R.id.in_color);

        b0k.setOnClickListener(v -> {
            String color = textColor.getText().toString();
            Bundle data = new Bundle();
            data.putString("color", color);
            Intent eIntent = new Intent(MainActivity.this, SecondActivity.class);
            eIntent.putExtras(data);
            startActivity(eIntent);
        });
    }
}