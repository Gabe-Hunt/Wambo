package com.example.wambo;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class soundboardPage extends AppCompatActivity {
    ArrayList<Button> buttonList;
    ArrayList<MediaPlayer> soundsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soundboard_page);

        buttonList = new ArrayList<>();

        final MediaPlayer brekfastSound = MediaPlayer.create(this, R.raw.brekfast);
        final MediaPlayer bruhSound = MediaPlayer.create(this, R.raw.bruh);
        final MediaPlayer chickensSound = MediaPlayer.create(this, R.raw.chickens);
        final MediaPlayer imFineSound = MediaPlayer.create(this, R.raw.im_fine);
        final MediaPlayer rawSound = MediaPlayer.create(this, R.raw.raw);
        final MediaPlayer runSound = MediaPlayer.create(this, R.raw.run);
        final MediaPlayer twentyOneSound = MediaPlayer.create(this, R.raw.twentyone);
        final MediaPlayer vodkaSound = MediaPlayer.create(this, R.raw.vodka);
        final MediaPlayer wamSound = MediaPlayer.create(this, R.raw.wam);
        final MediaPlayer wednesdaySound = MediaPlayer.create(this, R.raw.wednesday);

        soundsList = new ArrayList<>();
        soundsList.add(brekfastSound);
        soundsList.add(bruhSound);
        soundsList.add(chickensSound);
        soundsList.add(imFineSound);
        soundsList.add(rawSound);
        soundsList.add(runSound);
        soundsList.add(twentyOneSound);
        soundsList.add(vodkaSound);
        soundsList.add(wamSound);
        soundsList.add(wednesdaySound);

        int[] buttonID = {R.id.soundBoardButton1, R.id.soundBoardButton2, R.id.soundBoardButton3 ,R.id.soundBoardButton4, R.id.soundBoardButton5, R.id.soundBoardButton6, R.id.soundBoardButton7, R.id.soundBoardButton8, R.id.soundBoardButton9, R.id.soundBoardButton10 };




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

    public void addSound(int buttonID) {

    }

    public void createButtons() {
        for(int i = 0; i < 16; i++) {
            Button button = new Button(this);
            buttonList.add(button);

        }
    }

    public void playSound(View view) {
//        This will be the onClick method
//        Using if statements
    }
}
