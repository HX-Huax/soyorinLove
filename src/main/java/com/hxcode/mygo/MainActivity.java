package com.hxcode.mygo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView soyorin;
    MediaPlayer mediaPlayer;
    MediaPlayer mediaPlayer2;
    int soyorinState = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        soyorin = findViewById(R.id.soyorinImg);
        mediaPlayer = MediaPlayer.create(this,R.raw.shichaopan);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.soyorin_endband);
        mediaPlayer2.seekTo(16000);
        mediaPlayer2.start();
        soyorin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(soyorinState == 0) {
                   soyorin.setImageResource(R.drawable.soyorin_2);
                   mediaPlayer.seekTo(114500);
                   mediaPlayer.start();
                   mediaPlayer2.seekTo(16000);
                   soyorinState = 1;
               }else{
                     soyorin.setImageResource(R.drawable.soyorin_1);
                     soyorinState = 0;
                     mediaPlayer2.start();
                     mediaPlayer.pause();
               }
            }
        });

    }
}