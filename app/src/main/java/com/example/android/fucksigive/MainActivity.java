package com.example.android.fucksigive;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void randomFucksGiven (View view) {
        TextView resultTest1 = (TextView) findViewById(R.id.resultTest1);
        TextView resultTest2 = (TextView) findViewById(R.id.resultTest2);
        Random rnd = new Random();
        int rndNumber = rnd.nextInt(9);
        int result = evaluateRandom(rndNumber);
        resultTest1.setText(Integer.toString(rndNumber));
        resultTest2.setText(Integer.toString(result));
    }

    public int evaluateRandom(int value) {
        if (value <= 2) return 0;
        if (value >= 3 && value <= 5) return 1;
        if (value >= 6 && value <= 8) return 2;
        if (value == 9) return 3;
        else return 4;
    }
}
