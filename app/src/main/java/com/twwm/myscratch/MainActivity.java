package com.twwm.myscratch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cooltechworks.views.ScratchImageView;

public class MainActivity extends AppCompatActivity {


    private Button button_win;
    private Button button_lose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_win = (Button) findViewById(R.id.button1);
        button_win.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityWin.class);
                startActivity(intent);
            }
        });

        button_lose = (Button) findViewById(R.id.button2);
        button_lose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityLose.class);
                startActivity(intent);
            }
        });

    }
}