package com.example.projectmid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView converterCard, alphabetCard, khanateCard, qwertyCard, gameCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        converterCard = findViewById(R.id.conveerter);
        alphabetCard = findViewById(R.id.alphabet);
        khanateCard = findViewById(R.id.khanate);
        qwertyCard = findViewById(R.id.qwerty);
        gameCard = findViewById(R.id.game);


        converterCard.setOnClickListener(this);
        alphabetCard.setOnClickListener(this);
        khanateCard.setOnClickListener(this);
        qwertyCard.setOnClickListener(this);
        gameCard.setOnClickListener(this);





    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.conveerter : i = new Intent(this, Converter.class); startActivity(i);
                break;
            case R.id.alphabet : i = new Intent(this, Alphabet.class); startActivity(i);
                break;
            case R.id.khanate : i = new Intent(this, Khanate.class); startActivity(i);
                break;
            case R.id.qwerty : i = new Intent(this, Qwerty.class); startActivity(i);
                break;
            case R.id.game : i = new Intent(this, Game.class); startActivity(i);
                break;

            default:break;


        }


    }
}
