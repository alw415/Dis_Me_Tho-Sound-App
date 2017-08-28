package com.example.andrewwhitehead.soundapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class shock_screen extends AppCompatActivity {

    Button No_play;
    Button Hell_Naw_play;
    Button Jon_Tron_play;
    Button Supa_Hot_play;
    Button Oh_Shh_play;
    Button Record_Scratch_play;
    Button Chief_Keef_play;
    Button Triggered_play;
    Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shock_screen);
        onClickListener();
    }

    public void onClickListener(){
        No_play = (Button) findViewById(R.id.no);
        Hell_Naw_play = (Button) findViewById(R.id.hell_naw);
        Jon_Tron_play = (Button) findViewById(R.id.jon_tron_button);
        Supa_Hot_play = (Button) findViewById(R.id.supa_hot_button);
        Oh_Shh_play = (Button) findViewById(R.id.oh_shit_button);
        Record_Scratch_play = (Button) findViewById(R.id.record_scratch_button);
        Chief_Keef_play = (Button) findViewById(R.id.chief_keef_button);
        Triggered_play = (Button) findViewById(R.id.triggered_button);
        Back = (Button) findViewById(R.id.back_button);
        final MediaPlayer play_no = MediaPlayer.create(this, R.raw.no_shock);
        final MediaPlayer play_hell_naw = MediaPlayer.create(this, R.raw.hell_naw_shock);
        final MediaPlayer play_JonTron = MediaPlayer.create(this, R.raw.jon_tron_shock);
        final MediaPlayer play_supa_hot = MediaPlayer.create(this, R.raw.ohhhhh_supa_shock);
        final MediaPlayer play_oh_shit = MediaPlayer.create(this, R.raw.oh_shit_shock);
        final MediaPlayer play_record_scratch = MediaPlayer.create(this, R.raw.record_scratch_shock);
        final MediaPlayer play_chief_keef = MediaPlayer.create(this, R.raw.the_beat_go_off_shock);
        final MediaPlayer play_triggered = MediaPlayer.create(this, R.raw.trigged_shock);
        final Context context = this;


        No_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_no.start();
            }
        });

        Hell_Naw_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_hell_naw.start();
            }
        });

        Jon_Tron_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_JonTron.start();
            }
        });

        Supa_Hot_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_supa_hot.start();
            }
        });

        Oh_Shh_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_oh_shit.start();
            }
        });

        Record_Scratch_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_record_scratch.start();
            }
        });

        Chief_Keef_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_chief_keef.start();
            }
        });

        Triggered_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_triggered.start();
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
