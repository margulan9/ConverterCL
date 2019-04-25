package com.example.projectmid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Alphabet extends AppCompatActivity {

    ImageView imageView;
    Button latin, cyrillic;
    TextView hideText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet);

        getSupportActionBar().setTitle("Alphabet");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.image_id);
        latin = findViewById(R.id.buttonLatin);
        cyrillic = findViewById(R.id.buttonCyrilic);
        hideText = findViewById(R.id.text_hide);

        latin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.latin);
                imageView.getLayoutParams().height = 1000;
                hideText.setText("Latin Version");
            }
        });

        cyrillic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.cyrillic);
                imageView.getLayoutParams().height = 1400;
                hideText.setText("Cyrillic Version");

            }
        });

    }
}
