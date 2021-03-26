package com.geek.dop1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     ImageView imageView;
     int idImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        imageView = findViewById(R.id.imageView);
    }

    public void changeImage(View view) {
        switch (view.getId())
        {
            case R.id.first_image: idImage = R.drawable.cat; imageView.setImageResource(idImage);  break;
            case R.id.second_image: idImage = R.drawable.dog; imageView.setImageResource(idImage); break;
            case R.id.third_image: idImage = R.drawable.squirrel; imageView.setImageResource(idImage); break;
        }
    }


    public void recognizeAnimal(View view) {

        switch (view.getId())
        {
            case R.id.first_animal:    soutToast(idImage == R.drawable.cat);break;
            case R.id.second_animal:   soutToast(idImage == R.drawable.dog); break;
            case R.id.third_animal:    soutToast(idImage == R.drawable.squirrel);  break;
        }
    }

    private void soutToast(boolean isTrue) {
        if (isTrue){ Toast.makeText(MainActivity.this,"Правильно",Toast.LENGTH_LONG).show(); }
        else  Toast.makeText(MainActivity.this,"Неправильно",Toast.LENGTH_LONG).show();
    }
}