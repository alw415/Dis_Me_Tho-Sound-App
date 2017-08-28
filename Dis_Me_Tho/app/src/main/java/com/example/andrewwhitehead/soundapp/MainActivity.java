package com.example.andrewwhitehead.soundapp;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListener();

    }
    public void onClickListener(){
        final Context context = this;
        Start = (Button) findViewById(R.id.Enter_app);

        Start.setOnClickListener(new View.OnClickListener(){
            public void onClick(View act){
                Intent intent = new Intent(context, soundScreen.class);
                startActivity(intent);
            }
        });
    }
}
