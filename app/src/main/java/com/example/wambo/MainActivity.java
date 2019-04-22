package com.example.wambo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner dropDownMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropDownMenu = findViewById(R.id.dropDownMenu);
        Button newSoundboardButton = findViewById(R.id.createNewSoundboardButton);

        newSoundboardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNewSoundboard();
            }
        });
    }

    /**
     * onClick method for launch button
     * Takes user to desired soundboard
     */
    public void chooseSoundboard() {

    }

    /**
     * onClick method for 'Create new Soundboard' button
     * Directs user away from splash screen and makes new board
     */
    public void createNewSoundboard() {
        Intent intent = new Intent(MainActivity.this, soundboardPage.class);
        startActivity(intent);
    }



}
