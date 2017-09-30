package com.example.rohit.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

class Score{
    private int score;
    Score()
    {
        score = 0;
    }
    void increaseScore( int num )
    {
        score += num;
    }
    void setZero(){ score = 0; }
    int getScore(){ return score; }
}


public class MainActivity extends AppCompatActivity {

    Score A;
    Score B;

    public MainActivity()
    {
        A = new Score();
        B = new Score();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void incrementSixA(View view)
    {
        A.increaseScore(6);
        displayA();
    }

    void incrementSixB(View view)
    {
        B.increaseScore(6);
        displayB();
    }

    void incrementFourA(View view)
    {
        A.increaseScore(4);
        displayA();
    }

    void incrementFourB(View view)
    {
        B.increaseScore(4);
        displayB();
    }


    void incrementThreeA(View view)
    {
        A.increaseScore(3);
        displayA();
    }

    void incrementThreeB(View view)
    {
        B.increaseScore(3);
        displayB();
    }

    void incrementTwoA(View view)
    {
        A.increaseScore(2);
        displayA();
    }

    void incrementTwoB(View view)
    {
        B.increaseScore(2);
        displayB();
    }

    void incrementOneA(View view)
    {
        A.increaseScore(1);
        displayA();
    }

    void incrementOneB(View view)
    {
        B.increaseScore(1);
        displayB();
    }


    void reset( View view)
    {
        A.setZero();
        B.setZero();
        displayA();
        displayB();
    }

    void displayA()
    {
        TextView teamA = (TextView) findViewById(R.id.teamAscore);
        teamA.setText(String.valueOf(A.getScore()));
    }

    void displayB()
    {
        TextView teamA = (TextView) findViewById(R.id.teamBscore);
        teamA.setText(String.valueOf(B.getScore()));
    }


}
