package com.example.lol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
    ImageView im;
  Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        im=findViewById(R.id.imageView);
        animation= AnimationUtils.loadAnimation(this,R.anim.ani);
        im.startAnimation(animation);


    }
}