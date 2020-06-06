package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Profile extends AppCompatActivity {
    FirebaseAuth mFirebaseauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mFirebaseauth = FirebaseAuth.getInstance();
        String Email;
            FirebaseUser user = mFirebaseauth.getCurrentUser();
        assert user != null;
        Email = user.getEmail();
        TextView mail = findViewById(R.id.textView);
        mail.setText(Email);
    }
}
