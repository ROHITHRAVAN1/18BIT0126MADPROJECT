package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static android.widget.Toast.makeText;

public class Main6Activity extends AppCompatActivity {
    EditText emailid1,password1;
    Button btnsignin1;
    TextView tvsignup1;
    FirebaseAuth mFirebaseauth1;
    private FirebaseAuth.AuthStateListener mauthstatelisitner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        mFirebaseauth1=FirebaseAuth.getInstance();
        emailid1=findViewById(R.id.editText6);
        password1=findViewById(R.id.editText7);
        btnsignin1=findViewById(R.id.button3);
        tvsignup1=findViewById(R.id.textView3);
        mauthstatelisitner1=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mfirebaseuser= mFirebaseauth1.getCurrentUser();
                if (mfirebaseuser!=null) {
                    Intent i = new Intent(Main6Activity.this, MainActivity.class);

                    startActivity(i);
                    finish();
                }
            }
        };
        btnsignin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email1 =emailid1.getText().toString();
                final String pwd1;
                pwd1 = password1.getText().toString();
                if(email1.isEmpty()){
                    emailid1.setError("please enter email id");
                    emailid1.requestFocus();

                }
                else if (pwd1.isEmpty()){
                    password1.setError("please enter your passsword");
                    password1.requestFocus();
                }

                else{
                    mFirebaseauth1.signInWithEmailAndPassword(email1,pwd1).addOnCompleteListener(Main6Activity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                makeText(Main6Activity.this,"login error,Please Try Again",Toast.LENGTH_SHORT).show();
                            }
                            else{

                                Intent intohome=new Intent(Main6Activity.this,account.class);
                                intohome.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intohome);
                                finish();
                            }
                        }
                    });
                }

            }
        });
        tvsignup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intsignup=new Intent(Main6Activity.this,Main5Activity.class);
                intsignup.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intsignup);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mFirebaseauth1.addAuthStateListener(mauthstatelisitner1);
    }
}
