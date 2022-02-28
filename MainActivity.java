package com.example.footboll;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer countOne = 0;
    private Integer countTwo = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        countOne = savedInstanceState.getInt("btnR");
        countTwo = savedInstanceState.getInt("btnG");
        Log.d(TAG, "onRestoreInstanceState");
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("btnR", countOne);
        outState.putInt("btnG", countTwo);
        Log.d(TAG, "onSaveInstanceState");
    }
    public void clickGol(View view) {
        countOne++;
        TextView countView = (TextView)findViewById(R.id.txtR);
        countView.setText(countOne.toString());
    }
    public void clickGolTwo(View view) {
        countTwo++;
        TextView countViewTwo = (TextView)findViewById(R.id.txtG);
        countViewTwo.setText(countTwo.toString());
    }
    public void reset (View view){
        countOne = 0;
        countTwo = 0;
        TextView countView = (TextView)findViewById(R.id.txtR);
        countView.setText(countOne.toString());
        TextView countViewTwo = (TextView)findViewById(R.id.txtG);
        countViewTwo.setText(countTwo.toString());
    }
}