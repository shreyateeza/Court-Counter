package com.example.shreya.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        displayForTeamA(0);
        displayForTeamB(0);
        setContentView(R.layout.activity_main);
    }

    public void addThreeForTeamA(View v) {
        displayForTeamA(scoreA + 3);
    }

    public void addTwoForTeamA(View v) {
        displayForTeamA(scoreA + 2);
    }

    public void freeThrowForTeamA(View v) {
        displayForTeamA(scoreA + 1);
    }

    public void addThreeForTeamB(View v) {
        displayForTeamB(scoreB + 3);
    }

    public void addTwoForTeamB(View v) {
        displayForTeamB(scoreB + 2);
    }

    public void freeThrowForTeamB(View v) { displayForTeamB(scoreB + 1); }

    public void resetScore(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(scoreB));
    }
}

