package com.example.andrewwhitehead.soundapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class random_screen extends AppCompatActivity {

    Button wrong_play;
    Button dab_of_ranch_play;
    Button sike_play;
    Button rewind_play;
    Button skkrt_play;
    Button sexy_sax_play;
    Button dun_dun_play;
    Button evil_laugh_play;
    Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_screen);
        onClickListener();
    }

    public void onClickListener (){
        wrong_play = (Button) findViewById(R.id.wrong_button);
        dab_of_ranch_play = (Button) findViewById(R.id.DoR);
        sike_play = (Button) findViewById(R.id.sike_button);
        rewind_play = (Button) findViewById(R.id.reverse_button);
        skkrt_play = (Button) findViewById(R.id.skkrt_button);
        sexy_sax_play = (Button) findViewById(R.id.sax_button);
        dun_dun_play = (Button) findViewById(R.id.dramatic_button);
        evil_laugh_play = (Button) findViewById(R.id.joker_laugh);
        Back = (Button) findViewById(R.id.back_button);
        final MediaPlayer play_sike = MediaPlayer.create(this, R.raw.sike);
        final MediaPlayer play_dab_of_ranch = MediaPlayer.create(this, R.raw.dab_of_ranch);
        final MediaPlayer play_wrong = MediaPlayer.create(this, R.raw.wrong);
        final MediaPlayer play_rewind = MediaPlayer.create(this, R.raw.rewind);
        final MediaPlayer play_skkrt = MediaPlayer.create(this, R.raw.skkrt_random);
        final MediaPlayer play_sexy_sax = MediaPlayer.create(this, R.raw.sexy_sax_random);
        final MediaPlayer play_dun_dun = MediaPlayer.create(this, R.raw.dun_dun_dunnnn_random);
        final MediaPlayer play_evil_laugh = MediaPlayer.create(this, R.raw.evil_laugh);
        final Context context = this;


        wrong_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_wrong.start();
            }
        });

        dab_of_ranch_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_dab_of_ranch.start();
            }
        });

        sike_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_sike.start();
            }
        });

        rewind_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_rewind.start();
            }
        });

        skkrt_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_skkrt.start();
            }
        });

        sexy_sax_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_sexy_sax.start();
            }
        });

        dun_dun_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_dun_dun.start();
            }
        });

        evil_laugh_play.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                play_evil_laugh.start();
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
