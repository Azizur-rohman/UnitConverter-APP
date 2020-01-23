package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class WeActivity extends AppCompatActivity {

    EditText temp1;
    RadioButton rr1;
    RadioButton rr2;
    EditText temp2;
    RadioButton rr3;
    RadioButton rr4;
    EditText temp3;
    RadioButton rr5;
    RadioButton rr6;
    TextView t1;
    TextView t2;
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we);
        temp1 = (EditText) findViewById(R.id.edt1);
        rr1 = (RadioButton)findViewById(R.id.r1);
        rr2 = (RadioButton)findViewById(R.id.r2);
        t1 =(TextView)findViewById(R.id.view1);
        temp2 = (EditText) findViewById(R.id.edt2);
        rr3 = (RadioButton)findViewById(R.id.r3);
        rr4 = (RadioButton)findViewById(R.id.r4);
        t2 =(TextView)findViewById(R.id.view2);
        temp3 = (EditText) findViewById(R.id.edt3);
        rr5 = (RadioButton)findViewById(R.id.r5);
        rr6 = (RadioButton)findViewById(R.id.r6);
        t3 =(TextView)findViewById(R.id.view3);


    }


    public void KG(View view) {
        try { double value = new Double(temp1.getText().toString());
        if(rr1.isChecked())
            value = covertformula.weightg(value);
        else
            value= covertformula.weightg1(value);
        t1.setText(new Double(value).toString());
        } catch (Exception e){
            Toast.makeText(getApplicationContext(),"Please Enter Value",Toast.LENGTH_SHORT).show();
        }
    }

    public void Kp(View view) {
            try { double value = new Double(temp2.getText().toString());
        if(rr3.isChecked())
            value = covertformula.weightkg(value);
        else
            value= covertformula.weightkg1(value);
        t2.setText(new Double(value).toString());
            } catch (Exception e){
                Toast.makeText(getApplicationContext(),"Please Enter Value",Toast.LENGTH_SHORT).show();
            }
    }

    public void P(View view) {
                try { double value = new Double(temp3.getText().toString());
        if(rr5.isChecked())
            value = covertformula.weightp(value);
        else
            value= covertformula.weightp1(value);
        t3.setText(new Double(value).toString());
                } catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Please Enter Value",Toast.LENGTH_SHORT).show();
                }
    }

}
