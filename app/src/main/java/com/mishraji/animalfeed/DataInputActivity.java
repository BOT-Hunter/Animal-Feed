package com.mishraji.animalfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class DataInputActivity extends AppCompatActivity {
    private EditText mWeightET;
    private EditText mAgeET;
    private Spinner mCattleTypeSpinner;
    private Spinner mCattleBreedSpinner;
    private Button mCalculate;
    private String[] cattleTypeList=new String[]{};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_input);
        mWeightET=(EditText) findViewById(R.id.cattle_weight);
        mAgeET=(EditText) findViewById(R.id.cattle_weight);
        mCattleBreedSpinner=(Spinner) findViewById(R.id.cattle_breed_spinner);
        mCattleTypeSpinner=(Spinner) findViewById(R.id.cattle_type_spinner);
        mCalculate=(Button) findViewById(R.id.calculate_button);

    }
}