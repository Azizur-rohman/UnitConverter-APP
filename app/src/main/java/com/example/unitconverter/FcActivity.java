package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class FcActivity extends AppCompatActivity {

     EditText temp;
     RadioButton toC;
     RadioButton toF;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fc);
        temp = (EditText)findViewById(R.id.editText);
        toC =(RadioButton)findViewById(R.id.radioButtonc);
        toF = (RadioButton)findViewById(R.id.radioButtonf);

    }

    public void convert(View view) {
        try {double value = new Double(temp.getText().toString());
        if(toC.isChecked())
            value = covertformula.farenheit2celsius(value);
        else
            value= covertformula.celsius2farenheit(value);
        temp.setText(new Double(value).toString());
        } catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please Enter Value",Toast.LENGTH_SHORT).show();
        }
    }

}
