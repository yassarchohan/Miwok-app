package com.example.yassarchohan.mukeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void numberslistview(View view){
        Intent intent = new Intent(this,Number_Activity.class);
        startActivity(intent);
    }

    public void colorlistview(View view){
        Intent intent = new Intent(this,Color_activity.class);
        startActivity(intent);
    }

    public void familylistview(View view){
        Intent intent = new Intent(this,Family_activty.class);
        startActivity(intent);
    }
    public void phraseslistview(View view){
        Intent intent = new Intent(this,Phrases_Activity.class);
        startActivity(intent);
    }
}
