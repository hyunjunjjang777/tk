package com.example.tklifeplus;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

ImageView one;
ImageView two;
ImageView three;
ImageView four;
ImageView five;
ImageView six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    one = (android.widget.ImageView) findViewById(R.id.one);
    two= (android.widget.ImageView) findViewById(R.id.two);
    three= (android.widget.ImageView) findViewById(R.id.three);
    four= (android.widget.ImageView) findViewById(R.id.four);
    five = (android.widget.ImageView) findViewById(R.id.five);
    six= (android.widget.ImageView) findViewById(R.id.six);

    one.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent_01 = new Intent(MainActivity.this, Folder.class);
            startActivity(intent_01);
            finish();
        }
    });

    two.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent_02 = new Intent(MainActivity.this, club.class);
            startActivity(intent_02);
            finish();
        }
    });

    three.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent_03 = new Intent(MainActivity.this, subjects.class);
            startActivity(intent_03);
            finish();
            }
        });

    four.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent_04 = new Intent(MainActivity.this, slaves.class);
            startActivity(intent_04);
            finish();
        }
    });

    five.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent_05 = new Intent(MainActivity.this, welfare.class);
            startActivity(intent_05);
            finish();
        }
    });

    six.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent_06 = new Intent(MainActivity.this, events.class);
            startActivity(intent_06);
            finish();
        }
    });
}};