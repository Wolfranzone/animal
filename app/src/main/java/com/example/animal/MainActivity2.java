package com.example.animal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity2 extends AppCompatActivity {
    ImageView logo,letra,rino;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        logo=findViewById(R.id.logo);
        letra=findViewById(R.id.letra);
        rino=findViewById(R.id.rino);
        lottieAnimationView=findViewById(com.airbnb.lottie.R.id.lottie_layer_name);

    }
}