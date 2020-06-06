package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class foodorder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodorder);
        Button men,ordn;
        men=findViewById(R.id.button21);
        ordn=findViewById(R.id.button22);
        TextView orders=findViewById(R.id.textView10);
        orders.setText("HI SIR, FEEL FREE TO ORDER FOOD \n" +
                "PUSH MENU BUTTON TO BROWSE ITEMS \n" +
                "PUSH ORDER BUTTON INORDER TO ORDER VIA  WATSAPP \n");
        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intofoo=new Intent(foodorder.this,Food.class);
                startActivity(intofoo);
            }
        });
        ordn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobilenumber="9010376473";
                boolean installed=appinstalledornot("com.whatsapp");
                if(installed){
                    Intent intowa=new Intent(Intent.ACTION_VIEW);
                    intowa.setData(Uri.parse("https://api.whatsapp.com/send?phone="+"+91"+mobilenumber));
                    startActivity(intowa);
                }
            }
        });



    }
    private boolean appinstalledornot(String url){
       return true;
        }
    }

