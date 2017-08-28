package com.example.andrewwhitehead.soundapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screams_screen extends AppCompatActivity {

    Button goat_play;
    Button little_girl_play;
    Button man_play;
    Button spongebob_play;
    Button bugs_play;
    Button gummy_bear_play;
    Button mj_play;
    Button wilhelm_play;
    Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screams_screen);
        onClickListener();
    }

    public void onClickListener(){
        goat_play = (Button) findViewById(R.id.goat_screams);
        little_girl_play = (Button) findViewById(R.id.little_girl_screams);
        man_play = (Button) findViewById(R.id.man_screams);
        spongebob_play = (Button) findViewById(R.id.spongebob_screams);
        bugs_play = (Button) findViewById(R.id.bugs_bunny_scream_button);
        gummy_bear_play = (Button) findViewById(R.id.gummy_bear_button);
        mj_play = (Button) findViewById(R.id.MJ_scream);
        wilhelm_play = (Button) findViewById(R.id.iconic_button);
        Back = (Button) findViewById(R.id.back_button);
        final MediaPlayer play_goat = MediaPlayer.create(this, R.raw.scream_goat);
        final MediaPlayer play_little_girl = MediaPlayer.create(this, R.raw.scream_girl);
        final MediaPlayer play_man = MediaPlayer.create(this, R.raw.scream_man);
        final MediaPlayer play_spongebob = MediaPlayer.create(this, R.raw.spongebob_screaming);
        final MediaPlayer play_bugs = MediaPlayer.create(this, R.raw.bugs_bunny_screams);
        final MediaPlayer play_gummy = MediaPlayer.create(this, R.raw.gummy_bear_screaming);
        final MediaPlayer play_MJ = MediaPlayer.create(this, R.raw.mj_screaming);
        final MediaPlayer play_wilhelm = MediaPlayer.create(this, R.raw.iconic_screaming);
        final Context context = this;



        goat_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_goat.start();
            }
        });

        little_girl_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_little_girl.start();
            }
        });

        man_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_man.start();
            }
        });

        spongebob_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_spongebob.start();
            }
        });

        bugs_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_bugs.start();
            }
        });

        gummy_bear_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_gummy.start();
            }
        });

        mj_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_MJ.start();
            }
        });

        wilhelm_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_wilhelm.start();
            }
        });
        Back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, soundScreen.class);
                startActivity(intent);
            }
        });

    }
}
