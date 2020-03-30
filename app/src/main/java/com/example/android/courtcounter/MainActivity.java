package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score = 0;
    int scoreb=0;
    public void IncPointThree(View view){
        score = score+3;
        display(score);
    }

    public void setScoreb3(View view) {
        this.scoreb = scoreb + 3;
        displayForTeamB(scoreb);
    }

    public void IncPointTwo(View view){
       score = score+2;
        display(score);
    }
    public void setScoreb2(View view) {
        this.scoreb = scoreb + 2;
        displayForTeamB(scoreb);
    }
    public void freeThrow(View view){
       score = score+5;
        display(score);
    }
    public void setScorebfree(View view) {
        this.scoreb = scoreb + 5;
        displayForTeamB(scoreb);
    }
    public void Reset(View view){
        int reset_score = 0;
        displayForTeamB(reset_score);
        display(reset_score);
    }
    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.score_view);
        quantityTextView.setText("" + number);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreb_view);
        scoreView.setText(String.valueOf(score));
    }
}
