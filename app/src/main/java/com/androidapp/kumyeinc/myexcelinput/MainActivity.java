package com.androidapp.kumyeinc.myexcelinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText edtNumber;
    private TextView viewNumber;
    private TextView viewNewNumber;
    private TextView viewNewestNumber;
    private int numberEntered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber = findViewById(R.id.edtNumber);
        viewNumber = findViewById(R.id.viewNumber);
        viewNewNumber = findViewById(R.id.viewNewNumber);
        viewNewestNumber = findViewById(R.id.viewNewestNumber);

    }

    public void clickedToDisplay (View numberViewToMeONly) {
        numberEntered = Integer.parseInt(edtNumber.getText().toString());

        viewNumber.setText("" + numberEntered);
        Log.i("MyTAG", "My Number: " + numberEntered);

        numberEntered = numberEntered * 5;

        viewNewNumber.setText("" + numberEntered);
        Log.i("MyTAG", "My new number is " + numberEntered);

        numberEntered = numberEntered * 5;

        viewNewestNumber.setText("" + numberEntered);
        Log.i("MyTAG", "My newest number is " + numberEntered);

        //Just to create a line to show how Github 'commit' works

        Log.i("MyTAG", "Just a message");

    }

}
