package com.example.menu;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class splachscreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intoher=new Intent(splachscreen.this,Main6Activity.class);
                intoher.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intoher.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intoher.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                intoher.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intoher);
            }},5000);


    } }

