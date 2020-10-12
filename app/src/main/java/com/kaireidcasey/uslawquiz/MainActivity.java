package com.kaireidcasey.uslawquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button startBtn = findViewById(R.id.btnStart);
//        startBtn.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                // Code here executes on main thread after user presses button
//                //view.addthings
//            }
//        });
    }
}