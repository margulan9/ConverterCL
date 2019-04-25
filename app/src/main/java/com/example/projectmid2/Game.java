package com.example.projectmid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Game extends AppCompatActivity {


    TextView questionLabel, questionCountLabel, scoreLabel;
    EditText answerEdt;
    Button submitBtn;
    ProgressBar progressBar;
    ArrayList<QuestionModel> questionModels;
    int currentPosition = 0;
    int numberOfCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        getSupportActionBar().setTitle("Quiz");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        questionLabel = findViewById(R.id.question);
        questionCountLabel = findViewById(R.id.noQuestion);
        scoreLabel = findViewById(R.id.score);
        answerEdt = findViewById(R.id.answers);
        submitBtn = findViewById(R.id.submitBtn);
        progressBar = findViewById(R.id.progress);

        questionModels = new ArrayList<>();

        setUpQuestion();
        setData();

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer();

            }
        });
    }

    public void checkAnswer(){
        String answerString  = answerEdt.getText().toString().trim();




        if(answerString.equalsIgnoreCase(questionModels.get(currentPosition).getAnswer())){
            numberOfCorrect ++;



            new SweetAlertDialog(Game.this, SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("Good job!")
                    .setContentText("Right Asswer")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                            currentPosition ++;

                            setData();
                            answerEdt.setText("");
                            sweetAlertDialog.dismiss();
                        }
                    })
                    .show();


        }else {

            new SweetAlertDialog(Game.this, SweetAlertDialog.ERROR_TYPE)
                    .setTitleText("Wrong Answer")
                    .setContentText("The right answer is : "+questionModels.get(currentPosition).getAnswer())
                    .setConfirmText("OK")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {
                            sDialog.dismiss();

                            currentPosition ++;

                            setData();
                            answerEdt.setText("");
                        }
                    })
                    .show();
        }





        int x = ((currentPosition+1) * 100) / questionModels.size();

        progressBar.setProgress(x);



    }

    public void setUpQuestion(){
        questionModels.add(new QuestionModel("1+1=?", "2"));
        questionModels.add(new QuestionModel("1+2=?", "3"));
        questionModels.add(new QuestionModel("1+3=?", "4"));
        questionModels.add(new QuestionModel("1+4=?", "5"));
    }
    public void setData(){


        if(questionModels.size()>currentPosition) {

            questionLabel.setText(questionModels.get(currentPosition).getQuestionString());

            scoreLabel.setText("Score :" + numberOfCorrect + "/" + questionModels.size());
            questionCountLabel.setText("Question No : " + (currentPosition + 1));


        }else{


            new SweetAlertDialog(Game.this, SweetAlertDialog.SUCCESS_TYPE)
                    .setTitleText("You have successfully completed the quiz")
                    .setContentText("Your score is : "+ numberOfCorrect + "/" + questionModels.size())
                    .setConfirmText("Restart")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {

                            sDialog.dismissWithAnimation();
                            currentPosition = 0;
                            numberOfCorrect = 0;
                            progressBar.setProgress(0);
                            setData();
                        }
                    })
                    .setCancelText("Close")
                    .setCancelClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {

                            sDialog.dismissWithAnimation();
                            finish();
                        }
                    })
                    .show();

        }

    }
}
