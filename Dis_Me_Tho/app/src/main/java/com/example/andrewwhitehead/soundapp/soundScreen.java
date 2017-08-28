package com.example.andrewwhitehead.soundapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class soundScreen extends AppCompatActivity {

    Button approval;
    Button anger;
    Button cartoon;
    Button disappointment;
    Button screams;
    Button shock;
    Button random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_screen);
        onClickListener();

    }
    public void onClickListener(){
        final Context context = this;
        approval = (Button) findViewById(R.id.approval_button);
        anger = (Button) findViewById(R.id.anger_button);
        disappointment = (Button) findViewById(R.id.disappointment_button);
        cartoon = (Button) findViewById(R.id.cartoon_button);
        screams = (Button) findViewById(R.id.scream_button);
        shock = (Button) findViewById(R.id.shock_button);
        random = (Button) findViewById(R.id.random_button);



        approval.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, approval_screen.class);
                startActivity(intent);
            }
        });

        anger.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, anger_screen.class);
                startActivity(intent);
            }
        });

        cartoon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, cartoon_screen.class);
                startActivity(intent);
            }
        });

        disappointment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, disappointment_screen.class);
                startActivity(intent);
            }
        });

        screams.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, screams_screen.class);
                startActivity(intent);
            }
        });

        shock.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, shock_screen.class);
                startActivity(intent);
            }
        });

        random.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View act){
                Intent intent = new Intent(context, random_screen.class);
                startActivity(intent);
            }
        });
    }
}
