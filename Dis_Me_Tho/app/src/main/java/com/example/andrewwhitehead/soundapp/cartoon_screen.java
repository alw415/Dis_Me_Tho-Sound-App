package com.example.andrewwhitehead.soundapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cartoon_screen extends AppCompatActivity {

    Button Tv_turn_off;
    Button Wah_Wah;
    Button If_I_Had_One;
    Button Goofy_Fall;
    Button ooo_puss_in_boots;
    Button Genie;
    Button Ed_Edd_Eddy;
    Button Doodlebob;
    Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartoon_screen);
        onClickListener();
    }

    public void onClickListener(){
        final Context context = this;
        final MediaPlayer turnoff = MediaPlayer.create(this, R.raw.tv_turn_off);
        final MediaPlayer wahwah = MediaPlayer.create(this, R.raw.wah_wah_wah);
        final MediaPlayer fairyoddparents = MediaPlayer.create(this, R.raw.if_i_had_one);
        final MediaPlayer Goofy_yell_play = MediaPlayer.create(this, R.raw.goofy_yell_cartoon);
        final MediaPlayer puss_in_boots_play = MediaPlayer.create(this, R.raw.ohhh_puss_in_boots_cartoon);
        final MediaPlayer genie_play = MediaPlayer.create(this, R.raw.genie_celebrate_cartoon);
        final MediaPlayer ed_play = MediaPlayer.create(this, R.raw.ed_edd_eddy_cartoon);
        final MediaPlayer doodlebob_play = MediaPlayer.create(this, R.raw.doodlebob_cartoon);
        Tv_turn_off = (Button) findViewById(R.id.tv_off);
        Wah_Wah = (Button) findViewById(R.id.wah_button);
        If_I_Had_One = (Button) findViewById(R.id.mr_turner);
        Goofy_Fall = (Button) findViewById(R.id.goofy_yell);
        ooo_puss_in_boots = (Button) findViewById(R.id.puss_in_boots_button);
        Genie = (Button) findViewById(R.id.genie_button);
        Ed_Edd_Eddy = (Button) findViewById(R.id.subaluwa_button);
        Doodlebob = (Button) findViewById(R.id.doodlebob_button);
        Back = (Button) findViewById(R.id.back_button);


        Tv_turn_off.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                turnoff.start();
            }
        });

        Wah_Wah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                wahwah.start();
            }
        });

        If_I_Had_One.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                fairyoddparents.start();
            }
        });

        Goofy_Fall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Goofy_yell_play.start();
            }
        });

        ooo_puss_in_boots.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                puss_in_boots_play.start();
            }
        });

        Genie.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                genie_play.start();
            }
        });

        Ed_Edd_Eddy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                ed_play.start();
            }
        });

        Doodlebob.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                doodlebob_play.start();
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
