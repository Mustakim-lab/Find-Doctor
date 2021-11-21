package com.example.finddoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        button1=findViewById(R.id.signIn_ID);
        button1.setOnClickListener(this);
        button2=findViewById(R.id.signUpIn_ID);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.signIn_ID){
            Intent intent=new Intent(StartActivity.this,SignInActivity.class);
            startActivity(intent);
        }else if (v.getId()==R.id.signUpIn_ID){
            Intent intent=new Intent(StartActivity.this,RegistrationActivity.class);
            startActivity(intent);
        }
    }
}