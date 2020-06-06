package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Aboutus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);
        TextView info =findViewById(R.id.textView5);
        info.setText("HI SIR, YOUR AT THE ONE OF THE WORLD FAMOUS HOTEL. WHICH WAS BUILT IN THE YEAR 2020.AND FEEL FREE TO CONTACT US FOR ANY ISSUES \n " +
                "CONTACT INFO \n " +
                "PH:+91 6303186334 \n" +
                "PH:+91 9912620067  \n " +
                "EMAIL:narurohith.reddy2018@vitstudent.ac.in \n" +
                "THANK YOU FOR CHOOSING US");
        Button bbtmail=findViewById(R.id.button20);
        bbtmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mailm="narurohith.reddy2018@vitstudent.ac.in";
                Intent intomail=new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:"+mailm));
                startActivity(intomail);
            }
        });


    }
}
