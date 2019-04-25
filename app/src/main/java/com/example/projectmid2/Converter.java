package com.example.projectmid2;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class Converter extends AppCompatActivity implements View.OnClickListener {

    EditText entered_text, converted_text;
    Button cyrillic_btn, latin_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);

        getSupportActionBar().setTitle("Converter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        entered_text = findViewById(R.id.entered_text);
        converted_text = findViewById(R.id.converted_text);
        cyrillic_btn = findViewById(R.id.buttonCyrillic1);
        latin_btn = findViewById(R.id.buttonLatin1);



        latin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        String text = entered_text.getText().toString();
                        StringBuilder message = new StringBuilder(text.length());
                        for (int index = 0; index<text.length(); index++) {
                            String cont = text.substring(index, index+1);
                            if (latin.containsKey(cont)) {
                                message.append(latin.get(cont));
                            }
                            else {
                                message.append(cont);
                            }
                            //sets converted text to TextField
                            converted_text.setText(message.toString());
                        }



            }
        });

        cyrillic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        String text = entered_text.getText().toString();
                        StringBuilder message = new StringBuilder(text.length());
                        for (int index = 0; index<text.length(); index++) {
                            String cont = text.substring(index, index+1);
                            if (cyrillic.containsKey(cont)) {
                                message.append(cyrillic.get(cont));
                            }
                            else {
                                message.append(cont);
                            }
                            //sets converted text to TextField
                            converted_text.setText(message.toString());
                        }

            }
        });


    }



    public static final Map<String, String> latin = new HashMap<String, String>();
    static {
        latin.put("А", "A");
        latin.put("Á", "Ә");
        latin.put("B", "Б");
        latin.put("D", "Д");
        latin.put("Е", "Е");
        latin.put("F", "Ф");
        latin.put("G", "Г");
        latin.put("Ǵ", "Ғ");
        latin.put("Х", "X");
        latin.put("H", "Һ");
        latin.put("І", "I");
        latin.put("I", "И");
        latin.put("I", "Й");
        latin.put("J", "Ж");
        latin.put("К", "K");
        latin.put("L", "Л");
        latin.put("М", "M");
        latin.put("N", "H");
        latin.put("Ń", "Ң");
        latin.put("О", "O");
        latin.put("Ó", "Ө");
        latin.put("P", "П");
        latin.put("Q", "Қ");
        latin.put("R", "Р");
        latin.put("S", "С");
        latin.put("Ś", "Ш");
        latin.put("Т", "T");
        latin.put("Ć", "Ч");
        latin.put("U", "Ұ");
        latin.put("Ú", "Ү");
        latin.put("V", "В");
        latin.put("Y", "Ы");
        latin.put("Ý", "У");
        latin.put("Z", "З");
        latin.put("а", "a");
        latin.put("á", "ә");
        latin.put("b", "б");
        latin.put("d", "д");
        latin.put("e", "e");
        latin.put("f", "ф");
        latin.put("g", "г");
        latin.put("ǵ", "ғ");
        latin.put("х", "x");
        latin.put("h", "h");
        latin.put("і", "i");
        latin.put("ı", "и");
        latin.put("ı", "й");
        latin.put("j", "ж");
        latin.put("k", "к");
        latin.put("l", "л");
        latin.put("m", "м");
        latin.put("n", "н");
        latin.put("ń", "ң");
        latin.put("о", "o");
        latin.put("ó", "ө");
        latin.put("p", "п");
        latin.put("q", "қ");
        latin.put("r", "р");
        latin.put("s", "с");
        latin.put("ś", "щ");
        latin.put("t", "т");
        latin.put("ć", "ч");
        latin.put("u", "ұ");
        latin.put("ú", "ү");
        latin.put("v", "в");
        latin.put("y", "ы");
        latin.put("ý", "у");
        latin.put("z", "з");
        latin.put("w", "");
        latin.put("W", "");
        latin.put("'", "");
    }

    public static final Map<String, String> cyrillic = new HashMap<String, String>();
    static {
        cyrillic.put("А", "A");
        cyrillic.put("Ә", "Á");
        cyrillic.put("Б", "B");
        cyrillic.put("Е", "E");
        cyrillic.put("Д", "D");
        cyrillic.put("Ф", "F");
        cyrillic.put("Г", "G");
        cyrillic.put("Ғ", "Ǵ");
        cyrillic.put("Х", "X");
        cyrillic.put("Һ", "H");
        cyrillic.put("І", "I");
        cyrillic.put("Й", "I");
        cyrillic.put("И", "I");
        cyrillic.put("Ж", "J");
        cyrillic.put("К", "K");
        cyrillic.put("Л", "L");
        cyrillic.put("М", "M");
        cyrillic.put("Н", "N");
        cyrillic.put("Ң", "Ń");
        cyrillic.put("О", "O");
        cyrillic.put("Ө", "Ó");
        cyrillic.put("П", "P");
        cyrillic.put("Қ", "Q");
        cyrillic.put("Р", "R");
        cyrillic.put("С", "S");
        cyrillic.put("Ш", "Ś");
        cyrillic.put("Т", "T");
        cyrillic.put("Ч", "Ć");
        cyrillic.put("Ұ", "U");
        cyrillic.put("Ү", "Ú");
        cyrillic.put("В", "V");
        cyrillic.put("Ы", "Y");
        cyrillic.put("У", "Ý");
        cyrillic.put("З", "Z");
        cyrillic.put("а", "a");
        cyrillic.put("ә", "á");
        cyrillic.put("б", "b");
        cyrillic.put("д", "d");
        cyrillic.put("е", "e");
        cyrillic.put("ф", "f");
        cyrillic.put("г", "g");
        cyrillic.put("ғ", "ǵ");
        cyrillic.put("х", "x");
        cyrillic.put("Һ", "h");
        cyrillic.put("і", "i");
        cyrillic.put("й", "ı");
        cyrillic.put("и", "ı");
        cyrillic.put("ж", "j");
        cyrillic.put("к", "k");
        cyrillic.put("л", "l");
        cyrillic.put("м", "m");
        cyrillic.put("н", "n");
        cyrillic.put("ң", "ń");
        cyrillic.put("о", "o");
        cyrillic.put("ө", "ó");
        cyrillic.put("п", "p");
        cyrillic.put("қ", "q");
        cyrillic.put("р", "r");
        cyrillic.put("с", "s");
        cyrillic.put("ш", "ś");
        cyrillic.put("т", "t");
        cyrillic.put("ч", "ć");
        cyrillic.put("ұ", "u");
        cyrillic.put("ү", "ú");
        cyrillic.put("в", "v");
        cyrillic.put("ы", "y");
        cyrillic.put("у", "ý");
        cyrillic.put("з", "z");
        cyrillic.put("Ц", "");
        cyrillic.put("ц", "");
        cyrillic.put("Щ", "Ś");
        cyrillic.put("щ", "ś");
        cyrillic.put("Ь", "");
        cyrillic.put("ь", "'");
        cyrillic.put("я", "ya");
        cyrillic.put("Я", "Ya");
        cyrillic.put("ю", "yu");

    }


    @Override
    public void onClick(View v) {

    }
}

