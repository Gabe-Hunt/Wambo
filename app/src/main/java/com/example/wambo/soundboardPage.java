package com.example.wambo;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class soundboardPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundboard_page);
        final MediaPlayer brekfastSound = MediaPlayer.create(this, R.raw.brekfast);
        Button brekfastButton = findViewById(R.id.soundBoardButton1);
        brekfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brekfastSound.start();
            }
        });
    }

    public static Intent createIntent(Context context) {
        return new Intent(context, soundboardPage.class);
    }
}
