package com.example.andrewwhitehead.soundapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class anger_screen extends AppCompatActivity {

    Button Bruh;
    Button Shut_Yo;
    Button Do_you_speak_it;
    Button IDGAF;
    Button play_despicable;
    Button play_when;
    Button play_dumb;
    Button play_boi;
    Button Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anger_screen);
        onClickListener();
    }

    public void onClickListener(){
        final Context context = this;
        final MediaPlayer bruhhh = MediaPlayer.create(this, R.raw.buhh);
        final MediaPlayer shut_up = MediaPlayer.create(this, R.raw.shut_yo_anger);
        final MediaPlayer english_MF = MediaPlayer.create(this, R.raw.english_mutha);
        final MediaPlayer idgaf = MediaPlayer.create(this, R.raw.i_dont_gaf);
        final MediaPlayer despicable_play = MediaPlayer.create(this, R.raw.youre_despicable_anger);
        final MediaPlayer when_play = MediaPlayer.create(this, R.raw.wwyl);
        final MediaPlayer dumb_play = MediaPlayer.create(this, R.raw.you_are_so_dumb_anger);
        final MediaPlayer boi_play = MediaPlayer.create(this, R.raw.boi_if_you_dont_anger);
        Bruh = (Button) findViewById(R.id.Bruh_anger);
        Shut_Yo = (Button) findViewById(R.id.SYBAU);
        Do_you_speak_it = (Button) findViewById(R.id.Sam_L);
        IDGAF = (Button) findViewById(R.id.idgaf_button);
        play_despicable = (Button) findViewById(R.id.daffy_button);
        play_when = (Button) findViewById(R.id.when_will_button);
        play_dumb = (Button) findViewById(R.id.dumb_button);
        play_boi = (Button) findViewById(R.id.boi_button);
        Back = (Button) findViewById(R.id.back_button);

        Bruh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                bruhhh.start();
            }
        });

        Shut_Yo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                shut_up.start();
            }
        });

        Do_you_speak_it.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                english_MF.start();
            }
        });

        IDGAF.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                idgaf.start();
            }
        });

        play_despicable.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                despicable_play.start();
            }
        });

        play_when.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                when_play.start();
            }
        });

        play_dumb.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                dumb_play.start();
            }
        });

        play_boi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                boi_play.start();
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
