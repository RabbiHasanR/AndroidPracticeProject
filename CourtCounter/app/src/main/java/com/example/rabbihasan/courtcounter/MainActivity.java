package com.example.rabbihasan.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This is a displayTeamA method
     */
    public void displayTeamA(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *this method is increment scoreTeamA by 3
     */
    public void teamA3Point(View view){
        scoreTeamA+=3;
        displayTeamA(scoreTeamA);
    }
    /**
     *this method is increment scoreTeamA by 2
     */
    public void teamA2Point(View view){
        scoreTeamA+=2;
        displayTeamA(scoreTeamA);
    }
    /**
     *this method is increment scoreTeamA by 1
     */
    public void teamA1Point(View view){
        scoreTeamA+=1;
        displayTeamA(scoreTeamA);
    }


    /**
     * This is a displayTeamB method
     */
    public void displayTeamB(int score){
        TextView scoreView=(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *this method is increment scoreTeamB by 3
     */
    public void teamB3Point(View view){
        scoreTeamB+=3;
        displayTeamB(scoreTeamB);
    }
    /**
     *this method is increment scoreTeamB by 2
     */
    public void teamB2Point(View view){
        scoreTeamB+=2;
        displayTeamB(scoreTeamB);
    }
    /**
     *this method is increment scoreTeamB by 1
     */
    public void teamB1Point(View view){
        scoreTeamB+=1;
        displayTeamB(scoreTeamB);
    }

    /**
     *this is reset method
     */
    public void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);
    }

}
