package com.example.genesissy.baskekball;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button reset;
    int scoreA = 0;
    int scoreB = 0;
    Spinner spinner;
    Spinner spinner1;
    ArrayAdapter<String> listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //casting the spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        spinner.getSelectedItem().toString();

        //findview for teamB spiner
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner2);
        spinner1.getSelectedItem().toString();

        //adapter for teamA spinner

        String Team_A[] = {"ATLANTA", "BOBCATS", "CAVALIERS", "PISTONS", "PACARS"};

        listAdapter = new ArrayAdapter<String>(this, R.layout.texview_teama, Team_A);
        spinner.setAdapter(listAdapter);
        //adapter for teamB spinner

        String Team_B[] = {"CLIPPERS", "WARRIORS", "BUCKS", "LAKERS", "NUGGETS"};

        listAdapter = new ArrayAdapter<String>(this, R.layout.texview_teamb, Team_B);
        spinner1.setAdapter(listAdapter);

    }

    public void display_TeamA(int score) {
        TextView scoreTextview = (TextView) findViewById(R.id.view_teamA);
        scoreTextview.setText(String.valueOf(score));
    }

    public void display_TeamB(int scoreB) {
        TextView scoreTextview = (TextView) findViewById(R.id.view_teamB);
        scoreTextview.setText(String.valueOf(scoreB));
    }

    //method for teamA button
    public void FreethrowA(View view) {
        scoreA = scoreA + 1;
        display_TeamA(scoreA);
        Toast.makeText(this,"You Add One Point For Team A",Toast.LENGTH_LONG).show();
    }

    public void twoplusA(View view) {
        scoreA = scoreA + 2;
        display_TeamA(scoreA);
        Toast.makeText(this,"You Add Tow Point",Toast.LENGTH_LONG).show();
    }

    public void threeplusA(View view) {
        scoreA = scoreA + 3;
        display_TeamA(scoreA);
        Toast.makeText(this,"You Add Three Point For Team A",Toast.LENGTH_LONG).show();
    }

    //method for teamB button
    public void FreethrowB(View view) {
        scoreB = scoreB + 1;
        display_TeamB(scoreB);
        Toast.makeText(this,"You Add One Point For Team B",Toast.LENGTH_LONG).show();
    }

    public void twoplusB(View view) {
        scoreB = scoreB + 2;
        display_TeamB(scoreB);
        Toast.makeText(this,"You Add Two Point For Team B",Toast.LENGTH_LONG).show();
    }

    public void threeplusB(View view) {
        scoreB = scoreB + 3;
        display_TeamB(scoreB);
        Toast.makeText(this,"you Add Three Point For Team B",Toast.LENGTH_LONG).show();
    }

    //method for reset button
    public void resert(View view) {
        scoreA = 0;
        scoreB = 0;
        display_TeamA(scoreA);
        display_TeamB(scoreB);
        Toast.makeText(this,"Point Reseted",Toast.LENGTH_LONG).show();
    }
    public void Results(View view){
        Intent Resuits = new Intent(this,Final_Result.class);
        //this print firt Team Name
        final Spinner ScoreA= (Spinner) findViewById(R.id.spinner1);
        String usermessage=ScoreA.getSelectedItem().toString();
        Resuits.putExtra("TeamA",usermessage);

        //this print second team Name
        final Spinner ScoreB= (Spinner) findViewById(R.id.spinner2);
        String usermesage=ScoreB.getSelectedItem().toString();
        Resuits.putExtra("TeamB",usermesage);

        //this display for score A
        final TextView ResultsA= (TextView)findViewById(R.id.view_teamA);
        String scoremassegeA= ResultsA.getText().toString();
        Resuits.putExtra("ScoreA",scoremassegeA);

        //this display for score B
        final TextView ResultsB= (TextView)findViewById(R.id.view_teamB);
        String scoremassegeB= ResultsB.getText().toString();
        Resuits.putExtra("ScoreB",scoremassegeB);
        startActivity(Resuits);
        Toast.makeText(this,"Results Are being Showed",Toast.LENGTH_SHORT).show();
        


    }
    public void Exit(View v){

        AlertDialog.Builder dialog = new AlertDialog.Builder(Main2Activity.this);
        dialog.setTitle("EXIT");
        dialog.setMessage("Do You Real Want To Exit This Application? ");


        dialog.setPositiveButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.setNegativeButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        dialog.show();
    }
}


