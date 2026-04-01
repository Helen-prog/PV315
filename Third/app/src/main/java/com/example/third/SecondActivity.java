package com.example.third;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    private MediaPlayer sound1, sound2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        ImageButton img1 = findViewById(R.id.buttonImg1);
//        ImageButton img2 = findViewById(R.id.buttonImg2);
        Button btn = findViewById(R.id.buttonStop);
        ImageView image = findViewById(R.id.boy_image);

        sound1 = MediaPlayer.create(this, R.raw.sound_1);
        sound2 = MediaPlayer.create(this, R.raw.sound_2);

        Button button = findViewById(R.id.button);

        Animation scaleButton = AnimationUtils.loadAnimation(this, R.anim.shrink);
        button.startAnimation(scaleButton);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ((AnimationDrawable)image.getDrawable()).start();

//                Animation out = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.anim_alpha);
//                image.startAnimation(out);
                Animation translate = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.anim_translate);
                image.startAnimation(translate);
            }
        });

        ImageView myImageView = findViewById(R.id.boy_image_0);
        Button buttonRotateCenter = findViewById(R.id.rotateCenter);
        Button buttonRotateCorner = findViewById(R.id.rotateCorner);

        Animation animationRotateCenter = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.rotate_center);
        Animation animationRotateCorner = AnimationUtils.loadAnimation(SecondActivity.this, R.anim.rotate_corners);

        buttonRotateCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImageView.startAnimation(animationRotateCenter);
            }
        });

        buttonRotateCorner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myImageView.startAnimation(animationRotateCorner);
            }
        });

//        img1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                soundPlayButton(sound1, sound2);
//            }
//        });
//
//        img2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                soundPlayButton(sound2, sound1);
//            }
//        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound1.pause();
                sound1.seekTo(0);
                sound2.pause();
                sound2.seekTo(0);
            }
        });
    }

    private void soundPlayButton(MediaPlayer sound1, MediaPlayer sound2) {
        if(sound1.isPlaying()){
            sound1.pause();
            sound1.seekTo(0);
            sound1.setLooping(false);
        }
        if(sound2.isPlaying()){
            sound2.pause();
            sound2.seekTo(0);
            sound2.setLooping(false);
        }

        sound1.start();
        sound1.setLooping(true);
    }

    public void goBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}