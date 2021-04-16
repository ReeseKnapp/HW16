package com.example.mergesort;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private EditText inputET;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.inputET = this.findViewById(R.id.inputET);
        this.answerTV = this.findViewById(R.id.answerTV);
    }

    private int factorialRec(int n)
    {
        int runningTotal = n;
        for(int i = n - 1; i > 0; i--)
        {
            runningTotal *= i;
        }
        return runningTotal;
    }

    public void onFactorialButtonClicked(View v)
    {
        String currValue = this.inputET.getText().toString();
        int currValueAsInt = Integer.parseInt(currValue);
        this.answerTV.setText("" + this.factorialRec(currValueAsInt));
    }
}