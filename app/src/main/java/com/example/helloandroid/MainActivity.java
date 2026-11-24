package com.example.helloandroid;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView message = new TextView(this);
        message.setText("Hello Android！");
        message.setTextSize(28);
        message.setTextColor(Color.BLACK);
        message.setGravity(Gravity.CENTER);
        message.setBackgroundColor(Color.WHITE);
        setContentView(message);
    }
}
