package com.example.lloyd.secondapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button Btn2;

    public void init()
    {
        Btn2= (Button) findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFirstActivity= new Intent(SecondActivity.this, MainActivity.class);
                startActivity(toFirstActivity);
                overridePendingTransition(R.anim.slide_out_right,R.anim.slide_out_left);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        init();
    }
}
