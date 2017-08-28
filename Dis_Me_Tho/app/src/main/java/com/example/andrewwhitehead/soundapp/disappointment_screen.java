package com.example.andrewwhitehead.soundapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class disappointment_screen extends AppCompatActivity {

    Button crowd_aww;
    Button im_disgusted;
    Button really_vine;
    Button failure;
    Button im_out;
    Button sit_the_f_down;
    Button time_to_stop;
    Button oh_my_god;
    Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disappointment_screen);
        onClickListener();
    }

    public void onClickListener(){
        final Context context = this;
        final MediaPlayer awww = MediaPlayer.create(this, R.raw.aww_disappointment);
        final MediaPlayer disgusted = MediaPlayer.create(this, R.raw.disgusted_disappointed);
        final MediaPlayer really = MediaPlayer.create(this, R.raw.really_disappointment);
        final MediaPlayer ss_failure = MediaPlayer.create(this, R.raw.ssbm_failure);
        final MediaPlayer FTSIO = MediaPlayer.create(this, R.raw.f_this_s_im_out);
        final MediaPlayer sitdown = MediaPlayer.create(this, R.raw.sit_the_fuck_down);
        final MediaPlayer TTS = MediaPlayer.create(this, R.raw.its_time_to_stop_disappointment);
        final MediaPlayer OMG = MediaPlayer.create(this, R.raw.oh_my_god_ak_disappointment);
        crowd_aww = (Button) findViewById(R.id.aww_disappointment);
        im_disgusted = (Button) findViewById(R.id.disgusted_button);
        really_vine = (Button) findViewById(R.id.really_n);
        failure = (Button) findViewById(R.id.failure_disappointment);
        im_out = (Button) findViewById(R.id.im_out_button);
        sit_the_f_down = (Button) findViewById(R.id.STFD);
        time_to_stop = (Button) findViewById(R.id.time_to_stop_button);
        oh_my_god = (Button) findViewById(R.id.oh_my_god_button);
        Back = (Button) findViewById(R.id.back_button);


        crowd_aww.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                awww.start();
            }
        });

        im_disgusted.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                disgusted.start();
            }
        });

        failure.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                ss_failure.start();
            }
        });

        really_vine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                really.start();
            }
        });

        im_out.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                FTSIO.start();
            }
        });

        sit_the_f_down.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                sitdown.start();
            }
        });

        time_to_stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                TTS.start();
            }
        });

        oh_my_god.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                OMG.start();
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


