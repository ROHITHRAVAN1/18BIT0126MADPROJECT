package com.example.menu;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        GridView gridview = findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        final  Integer[] mThumbIds = {
                R.drawable.bell, R.drawable.samp_4,
                R.drawable.food, R.drawable.avatar,
        };
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mThumbIds[position].equals(mThumbIds[0])) {
                    Intent intent=new Intent(Main3Activity.this,Main4Activity.class);
                    startActivity(intent);
                }

                else if(mThumbIds[position].equals(mThumbIds[1])){
                    Intent intent=new Intent(Main3Activity.this,Roomser.class);
                    startActivity(intent);

                }
                else if(mThumbIds[position].equals(mThumbIds[2])){
                    Intent intent=new Intent(Main3Activity.this,foodorder.class);
                    startActivity(intent);

                }
                else{
                    Intent intopro=new Intent(Main3Activity.this,Profile.class);
                    startActivity(intopro);
                }

            }
        });
    }
}
