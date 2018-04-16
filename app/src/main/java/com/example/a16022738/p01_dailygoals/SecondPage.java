package com.example.a16022738.p01_dailygoals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);

        Intent i = getIntent();

        String[] info = i.getStringArrayExtra("info");
        TextView tvSummary = (TextView) findViewById(R.id.textView);
        tvSummary.setText("Read up on materials before class: "+ info[0] + "\nArrive on time so as not to miss important part of the lesson:" + info[1] + "\nAttempt the problem myself:" + info[2] + "\nMy personal reflection today:" + info[3]);

        Button ok = (Button)findViewById(R.id.button2);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondPage.this, MainActivity.class);
                startActivity(i);
            }
        });



    }
}