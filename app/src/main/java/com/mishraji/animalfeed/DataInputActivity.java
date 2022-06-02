package com.mishraji.animalfeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class DataInputActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private EditText mWeightET;
    private EditText mAgeET;
    private Spinner mCattleTypeSpinner;
    private Spinner mCattleBreedSpinner;
    private Button mCalculate;
    private String[] cattleTypeList;
    private String selectedCattleType;
    private  String selectedBreedType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_input);
        cattleTypeList=getResources().getStringArray(R.array.cattle_type);
        mWeightET=(EditText) findViewById(R.id.cattle_weight);
        mAgeET=(EditText) findViewById(R.id.cattle_weight);
        mCattleBreedSpinner=(Spinner) findViewById(R.id.cattle_breed_spinner);
        mCattleTypeSpinner=(Spinner) findViewById(R.id.cattle_type_spinner);
        mCalculate=(Button) findViewById(R.id.calculate_button);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.cattle_type,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        mCattleTypeSpinner.setAdapter(adapter);
       mCattleTypeSpinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        mCalculate.setOnClickListener(click->{

            startActivity(new Intent(DataInputActivity.this,resultActivity.class));

        });
}

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selectedBreedType=cattleTypeList[position];
        ArrayAdapter<CharSequence> breedAdapter;
        if(selectedBreedType.equals(R.string.goat))
        {
            breedAdapter=ArrayAdapter.createFromResource(DataInputActivity.this,R.array.goat_breeds, android.R.layout.simple_spinner_item);
            breedAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
            mCattleBreedSpinner.setAdapter(breedAdapter);
        }else if(selectedBreedType.equals(R.string.sheep))
        {
            breedAdapter=ArrayAdapter.createFromResource(DataInputActivity.this,R.array.sheep_breeds, android.R.layout.simple_spinner_item);
            breedAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
            mCattleBreedSpinner.setAdapter(breedAdapter);
        }else if(selectedBreedType.equals(R.string.cow))
        {
            breedAdapter=ArrayAdapter.createFromResource(DataInputActivity.this,R.array.cow_breeds, android.R.layout.simple_spinner_item);
            breedAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
            mCattleBreedSpinner.setAdapter(breedAdapter);
        }else if(selectedBreedType.equals(R.string.buffalo))
        {
            breedAdapter=ArrayAdapter.createFromResource(DataInputActivity.this,R.array.buffalo_breeds, android.R.layout.simple_spinner_item);
            breedAdapter.setDropDownViewResource(androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
            mCattleBreedSpinner.setAdapter(breedAdapter);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}




