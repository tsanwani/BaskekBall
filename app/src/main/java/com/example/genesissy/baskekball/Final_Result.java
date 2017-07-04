package com.example.genesissy.baskekball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Final_Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final__result);

        //this is for First Data
       Bundle FirstData =getIntent().getExtras();
        String FirstMassage=FirstData.getString("TeamA");
        final TextView Secondmessage=(TextView) findViewById(R.id.score_A);
       Secondmessage.setText(FirstMassage);

        //this for second Data
         Bundle SecondaData = getIntent().getExtras();
        String SecondMassage=SecondaData.getString("TeamB");
        final TextView ThirdMessage=(TextView)findViewById(R.id.score_B);
         ThirdMessage.setText(SecondMassage);

        // thisdisplay Score for Team A
        Bundle ScoreDataOne = getIntent().getExtras();
        String ThirdMassage=ScoreDataOne.getString("ScoreA");
        final TextView ScoreMassegeA=(TextView) findViewById(R.id.final_teamA);
        ScoreMassegeA.setText(ThirdMassage);

        // this display score forTeam B

        Bundle ScoreDataTwo = getIntent().getExtras();
        String FourthMassage=ScoreDataTwo.getString("ScoreB");
        final TextView ScoreMassegeB=(TextView)findViewById(R.id.final_teamB);
        ScoreMassegeB.setText(FourthMassage);

    }

    }