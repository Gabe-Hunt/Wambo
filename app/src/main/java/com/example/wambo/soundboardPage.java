package com.example.wambo;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

        MediaPlayer sound1 = MediaPlayer.create(this, R.raw.brekfast);
        MediaPlayer sound2 = MediaPlayer.create(this, R.raw.bruh);
        MediaPlayer sound3 = MediaPlayer.create(this, R.raw.chickens);
        MediaPlayer sound4 = MediaPlayer.create(this, R.raw.im_fine);
        MediaPlayer sound5 = MediaPlayer.create(this, R.raw.raw);
        MediaPlayer sound6 = MediaPlayer.create(this, R.raw.run);
        MediaPlayer sound7 = MediaPlayer.create(this, R.raw.twentyone);
        MediaPlayer sound8 = MediaPlayer.create(this, R.raw.vodka);
        MediaPlayer sound9 = MediaPlayer.create(this, R.raw.wam);
        MediaPlayer sound10 = MediaPlayer.create(this, R.raw.wednesday);


        soundsList = new ArrayList<>();
        soundsList.add(sound1);
        soundsList.add(sound2);
        soundsList.add(sound3);
        soundsList.add(sound4);
        soundsList.add(sound5);
        soundsList.add(sound6);
        soundsList.add(sound7);
        soundsList.add(sound8);
        soundsList.add(sound9);
        soundsList.add(sound10);

        int[] buttonID = {R.id.soundBoardButton1, R.id.soundBoardButton2, R.id.soundBoardButton3 ,R.id.soundBoardButton4, R.id.soundBoardButton5, R.id.soundBoardButton6, R.id.soundBoardButton7, R.id.soundBoardButton8, R.id.soundBoardButton9, R.id.soundBoardButton10 };

        Button b1 = findViewById(R.id.soundBoardButton1);

        b1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
//                Intent intent = new Intent(soundboardPage.this, PopupWindow.class );
//                startActivity(intent);
                AlertDialog.Builder builder = new AlertDialog.Builder(soundboardPage.this);


                return true;
            }
        });

        /*
        Button brekfastButton = findViewById(R.id.soundBoardButton1);
        brekfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                brekfastSound.start();
            }
        });
        */

    }

    public static Intent createIntent(Context context) {
        return new Intent(context, soundboardPage.class);
    }

    public void addSound(Button button) {

    }


    public void playSound(View view) {
//        This will be the onClick method
//        Using if statements
        switch(view.getId()) {
            case R.id.soundBoardButton1:
                soundsList.get(0).start();
                break;

            case R.id.soundBoardButton2:
                soundsList.get(1).start();
                break;
            case R.id.soundBoardButton3:
                soundsList.get(2).start();
                break;
            case R.id.soundBoardButton4:
                soundsList.get(3).start();
                break;
            case R.id.soundBoardButton5:
                soundsList.get(4).start();
                break;
            case R.id.soundBoardButton6:
                soundsList.get(5).start();
                break;
            case R.id.soundBoardButton7:
                soundsList.get(6).start();
                break;
            case R.id.soundBoardButton8:
                soundsList.get(7).start();
                break;
            case R.id.soundBoardButton9:
                soundsList.get(8).start();
                break;
            case R.id.soundBoardButton10:
                soundsList.get(9).start();
                break;
            default:
                break;
        }


    }
}
