package com.example.androidlab1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import java.util.Objects;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle data = getIntent().getExtras();
        String color = data.getString("color");

        if (Objects.equals(color, "red")) {
            this.getWindow().getDecorView().setBackgroundColor(Color.rgb(255, 0, 0));
        } else if (Objects.equals(color, "green")) {
            this.getWindow().getDecorView().setBackgroundColor(Color.rgb(0, 255, 0));
        } else if (Objects.equals(color, "blue")) {
            this.getWindow().getDecorView().setBackgroundColor(Color.rgb(0, 0, 255));
        }

        setContentView(R.layout.activity_second);
    }
}
