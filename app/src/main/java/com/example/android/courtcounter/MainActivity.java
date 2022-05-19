package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Team_A=0;
    int Team_B=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    /*     FOR TEAM A      */

    public void Score_increment_3_TeamA(View view){
        Team_A=Team_A+3;
        Display_TeamA_Score(Team_A);
    }
    public void Score_increment_2_TeamA(View view){
        Team_A=Team_A+2;
        Display_TeamA_Score(Team_A);
    }
    public void Score_increment_1_TeamA(View view){
        Team_A=Team_A+1;
        Display_TeamA_Score(Team_A);
    }
    public void Display_TeamA_Score(int Team_A_Score){
        TextView Score_TeamA = (TextView) findViewById(R.id.Score_TeamA);
        Score_TeamA.setText(String.valueOf(Team_A));
    }
    /*     FOR TEAM A ENDS     */

    /*     FOR TEAM B      */

    public void Score_increment_3_TeamB(View view){
        Team_B=Team_B+3;
        Display_TeamB_Score(Team_B);
    }
    public void Score_increment_2_TeamB(View view){
        Team_B=Team_B+2;
        Display_TeamB_Score(Team_B);
    }
    public void Score_increment_1_TeamB(View view){
        Team_B=Team_B+1;
        Display_TeamB_Score(Team_B);
    }
    public void Display_TeamB_Score(int Team_B_Score){
        TextView Score_TeamB = (TextView) findViewById(R.id.Score_TeamB);
        Score_TeamB.setText(String.valueOf(Team_B));
    }

    /*    FOR TEAM B ENDS     */

    /*    RESET    */

    public void Reset_Score_Teams(View view){
        Team_A=0;
        Team_B=0;
        Display_TeamA_Score(Team_A);
        Display_TeamB_Score(Team_B);
    }

}