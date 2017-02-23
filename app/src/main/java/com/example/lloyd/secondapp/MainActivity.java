package com.example.lloyd.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Btn1;

    public void init()
    {
     Btn1= (Button) findViewById(R.id.Btn1);
        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSecondActivity= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(toSecondActivity);
                overridePendingTransition(R.anim.slide_out_left,R.anim.slide_out_right);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
}
