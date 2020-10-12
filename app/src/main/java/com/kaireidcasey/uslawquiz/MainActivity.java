package com.kaireidcasey.uslawquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        When user presses the start quiz button, they should receive a message
//        that quizzes have not been implemented yet.
        final Button startBtn = findViewById(R.id.btnStart);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String strQuizNotCreated = getString(R.string.quiz_not_created);
                TextView txtWelcome=(TextView)findViewById(R.id.txtWelcome);
                txtWelcome.setText(strQuizNotCreated);
            }
        });
    }
}