package com.example.andrewwhitehead.soundapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class approval_screen extends AppCompatActivity {

    Button Yah_play;
    Button Hooray_play;
    Button Squaa_play;
    Button aww_yeah_play;
    Button f_yeah_play;
    Button tadah_play;
    Button zelda_play;
    Button achievement_play;
    Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approval_screen);
        onClickListener();
    }

    public void onClickListener(){
        final Context context = this;
        final MediaPlayer Uzi_play = MediaPlayer.create(this, R.raw.yah_yah_yah);
        final MediaPlayer play_hooray = MediaPlayer.create(this, R.raw.hooray);
        final MediaPlayer play_squaa = MediaPlayer.create(this, R.raw.squaaaa);
        final MediaPlayer play_aww_yeah = MediaPlayer.create(this, R.raw.awww_yeah_approval);
        final MediaPlayer play_f_yeah = MediaPlayer.create(this, R.raw.f_yeah_approval);
        final MediaPlayer play_tadah = MediaPlayer.create(this, R.raw.tadah_approval);
        final MediaPlayer play_zelda = MediaPlayer.create(this, R.raw.zelda_approval);
        final MediaPlayer play_achievement = MediaPlayer.create(this, R.raw.achievement_approval);
        Yah_play = (Button) findViewById(R.id.Yah_Yahs);
        Hooray_play = (Button) findViewById(R.id.Hoorayy);
        Squaa_play = (Button) findViewById(R.id.fetty_wap);
        aww_yeah_play = (Button) findViewById(R.id.awww_yeah);
        f_yeah_play = (Button) findViewById(R.id.f_yeah);
        tadah_play = (Button) findViewById(R.id.tadah_button);
        zelda_play = (Button) findViewById(R.id.zelda_button);
        achievement_play = (Button) findViewById(R.id.achievement_button);
        Back = (Button) findViewById(R.id.back_button);



        Yah_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Uzi_play.start();
            }
        });

        Hooray_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_hooray.start();
            }
        });

        Squaa_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_squaa.start();
            }
        });
        aww_yeah_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_aww_yeah.start();
            }
        });
        f_yeah_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_f_yeah.start();
            }
        });
        tadah_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_tadah.start();
            }
        });

        zelda_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_zelda.start();
            }
        });

        achievement_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_achievement.start();
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
