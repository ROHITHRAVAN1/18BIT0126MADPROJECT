package com.example.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;
public class MainActivity extends AppCompatActivity {
   //list view
    ListView lv;
    private long backpressedtime;
    private Toast backtoast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv= findViewById(R.id.proglist);
         final String[] values ={"SERVICES OFFERED","AC CONTROL","ABOUT US"};
        android.widget.ArrayAdapter arrayadapter= new android.widget.ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, Arrays.asList(values));
        lv.setAdapter(arrayadapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (values[position].equals(values[0])){
                    Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                    startActivity(intent);
            }
                else if(values[position].equals(values[1])){
                    Intent intent=new Intent(MainActivity.this,Accontrol.class);
                    startActivity(intent);

                }
                else if(values[position].equals(values[2])){
                    Intent intent=new Intent(MainActivity.this,Aboutus.class);
                    startActivity(intent);

                }
        }});
        Button b1;
        b1= findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intosignup=new Intent(MainActivity.this,Main6Activity.class);
                intosignup.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intosignup.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                intosignup.addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                intosignup.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                intosignup.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intosignup);
                finishAffinity();

            }
        });
    }

    //menues
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(this,"now u are in settings",Toast.LENGTH_LONG).show();
                return true;
            case R.id.cutter :
                Toast.makeText(this,"now u clicked aboutus",Toast.LENGTH_LONG).show();
                return true;
            case R.id.header:
                Toast.makeText(this,"now u clicked contactus",Toast.LENGTH_LONG).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onBackPressed() {
        if(backpressedtime+3000>System.currentTimeMillis()){
            backtoast.cancel();
            super.onBackPressed();
            return;
        }
        else {
            backtoast=Toast.makeText(this, "press back again", Toast.LENGTH_SHORT);
            backtoast.show();
        }
        backpressedtime=System.currentTimeMillis();
    }

}

