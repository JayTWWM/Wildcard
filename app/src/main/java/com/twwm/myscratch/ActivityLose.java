package com.twwm.myscratch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.cooltechworks.views.ScratchImageView;

public class ActivityLose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose);
        ScratchImageView sr = (ScratchImageView) findViewById(R.id.image2);
        sr.setRevealListener(new ScratchImageView.IRevealListener() {
            @Override
            public void onRevealed(ScratchImageView iv) {
                Toast.makeText(ActivityLose.this, "You have lost the WILDCARD.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRevealPercentChangedListener(ScratchImageView siv, float percent) {
                Toast.makeText(ActivityLose.this, "You have lost the WILDCARD.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
