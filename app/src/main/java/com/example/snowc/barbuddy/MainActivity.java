package com.example.snowc.barbuddy;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    public int weight;
    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            Button d = (Button) v;
            d.setBackgroundColor(Color.RED);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(listener);
    }
    public void onClick(View v) {
        Button button = (Button) v;
        ((Button) v).setText("Clicked");
    }
    public void subtract(View v) {
        Button button = (Button) v;
        ((Button) v).setText("Subtract Button");
    }

    public void weight(View v) {
        Button button = (Button) v;
        ((Button) v).setText("Clicked");
        EditText simpleEditText = (EditText) findViewById(R.id.editText);
        String editTextValue = simpleEditText.getText().toString();
        int value = Integer.getInteger(editTextValue.toString());
        weight = value;

    }
    public void time() {
        //System.Clock.elapsedRealtime();
    }
    /**public static double drinkScore(View v) {
        double drink;

        String gender;
        double genderNum;
        boolean hasEaten;
        if (gender.equals("male")) {
            genderNum = .1;
        } else if (gender.equals("female")) {
            genderNum = .2;
        }
        if (hasEaten) {
            double eaten = 0.0;
        } else {
            double eaten = .2;
        }
        double lvl = genderNum + (weight * .001) + .05*drink + eaten;
        return lvl;
    }**/
}
