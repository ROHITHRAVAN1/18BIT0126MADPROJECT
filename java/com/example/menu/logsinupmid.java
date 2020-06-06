package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class logsinupmid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logsinupmid);
        Button mid=findViewById(R.id.button4);
        mid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intoto=new Intent(logsinupmid.this,Main6Activity.class);
                intoto.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intoto.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intoto.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                intoto.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intoto);
                finish();
            }
        });
    }
}
