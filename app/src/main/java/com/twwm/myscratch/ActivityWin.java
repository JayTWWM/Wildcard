package com.twwm.myscratch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.cooltechworks.views.ScratchImageView;

public class ActivityWin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        ScratchImageView sc = (ScratchImageView) findViewById(R.id.image1);
        sc.setRevealListener(new ScratchImageView.IRevealListener() {
            @Override
            public void onRevealed(ScratchImageView iv) {
                Toast.makeText(ActivityWin.this, "You won the WILDCARD.", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRevealPercentChangedListener(ScratchImageView siv, float percent) {
                Toast.makeText(ActivityWin.this, "You have won the WILDCARD.", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
