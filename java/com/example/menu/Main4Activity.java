package com.example.menu;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        TextView tt= findViewById(R.id.tv2);
        Button contac=findViewById(R.id.button23);
        tt.setText("HI SIR IF YOU HAVE ANY ISSUE PLEASE CONTACT OUR MANAGER \n TO CONTACT PLEASE CLICK THE BELOW BUTTON" );
        contac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobilenumber="9010376473";
                String msg="Attend for the Room Servicing Immediately";
                Intent intowa=new Intent(Intent.ACTION_VIEW);
                intowa.setData(Uri.parse("https://api.whatsapp.com/send?phone="+"+91"+mobilenumber));
                startActivity(intowa);
            }
        });
    }
}
