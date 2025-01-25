package com.example.ex0607;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton imageBtn;
    int randomNum;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageBtn = findViewById(R.id.imageBtn);
    }

    public void clicked(View view)
    {
        randomNum = rnd.nextInt(3+1-1)+1;
        switch (randomNum)
        {
            case 1:
                imageBtn.setImageResource(R.drawable.image1);
                break;
            case 2:
                imageBtn.setImageResource(R.drawable.image2);
                break;
            case 3:
                imageBtn.setImageResource(R.drawable.image3);
                break;
        }
    }
}