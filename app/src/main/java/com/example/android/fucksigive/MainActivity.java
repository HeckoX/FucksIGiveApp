package com.example.android.fucksigive;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void generateFucks(View view){
        Random rn = new Random();
        int answer = rn.nextInt(10);

        ImageView imageBox = (ImageView) findViewById(R.id.fucks_given_image_view);
        TextView textBox = (TextView) findViewById(R.id.fucks_given_text_view);

        if(answer <= 2){
            imageBox.setImageResource(R.drawable.olddude);
            textBox.setText(R.string.zero_fucks_old_dude);
        }
        else if(answer <= 5){
            imageBox.setImageResource(R.drawable.nicholson);
            textBox.setText(R.string.zero_fucks_nicholson);
        }
        else if(answer <= 8){
            imageBox.setImageResource(R.drawable.soundofmusic);
            textBox.setText(R.string.zero_fucks_sound_of_music);
        }
        else if(answer == 9){
            imageBox.setImageResource(R.drawable.dicaprio);
            textBox.setText(R.string.one_fuck_given);
        }

    }
}
