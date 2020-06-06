package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Accontrol extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accontrol);
        Button b1=findViewById(R.id.button9);
        Button b11=findViewById(R.id.button8);
        Button b12=findViewById(R.id.button7);
        Button b13=findViewById(R.id.button6);
        Button b2=findViewById(R.id.button10);
        Button b3=findViewById(R.id.button11);
        Button b4=findViewById(R.id.button12);
        Button b5=findViewById(R.id.button13);
        Button b6=findViewById(R.id.button14);
        Button b7=findViewById(R.id.button15);
        Button b8=findViewById(R.id.button16);
        Button b9=findViewById(R.id.button17);
        Button b0=findViewById(R.id.button18);
        b1.setOnClickListener(this);
        b13.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);}

            @Override
            public void onClick(View v) {
              switch (v.getId()){
                  case R.id.button7:
                      Toast.makeText(this,"Comfort Air",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button6:
                      Toast.makeText(this,"ON",Toast.LENGTH_SHORT).show();
                      TextView text=findViewById(R.id.textView4);
                      text.setText(R.string.ac);
                      break;
                  case R.id.button8:
                      Toast.makeText(this,"LIGHTS OFF",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button9:
                      Toast.makeText(this,"MODE CHANNGED",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button17:
                      Toast.makeText(this,"ROOM TEMPERATURE",Toast.LENGTH_SHORT).show();
                      TextView text2=findViewById(R.id.textView4);
                      text2.setText(R.string.n26);
                      break;
                  case R.id.button12:
                      Toast.makeText(this,"Energy Control",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button13:
                      Toast.makeText(this,"TEMPERATURE DECREASED BY 1C",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button10:
                      Toast.makeText(this,"TEMPERATURE INCREASED BY 1C",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button14:
                      Toast.makeText(this,"JET MODE ACTIVATED",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button15:
                      Toast.makeText(this,"FUNCTION STATUS ON AC DISPLAYED",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button16:
                      Toast.makeText(this,"TIMER SET",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button11:
                      Toast.makeText(this,"FAN SPPED ALTERED",Toast.LENGTH_SHORT).show();
                      break;
                  case R.id.button18:
                      Toast.makeText(this,"AC IS OFF",Toast.LENGTH_SHORT).show();
                      TextView text1=findViewById(R.id.textView4);
                      text1.setText(R.string.acof);
                      break;
              }
            }


}
