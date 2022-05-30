package com.mishraji.animalfeed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class resultActivity extends AppCompatActivity {
    TextView output1;
    TextView output2;
    TextView output3;
    TextView remarks;

    Button calculateAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        output1 = (TextView) findViewById(R.id.output1);
        output2 = (TextView) findViewById(R.id.output2);
        output3 = (TextView) findViewById(R.id.output3);
        remarks = (TextView) findViewById(R.id.remarks);

        calculateAgain = (Button) findViewById(R.id.calculateAgainbtn);

        calculateAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(resultActivity.this, MainActivity.class);
                startActivity(main);
            }
        });
    }


}
