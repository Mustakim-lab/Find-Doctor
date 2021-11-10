package com.example.finddoctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class doctorList extends AppCompatActivity implements View.OnClickListener {
    private CardView korunaCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_list);

        korunaCard=findViewById(R.id.coruna_ID);
        korunaCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.coruna_ID){
            Intent intent=new Intent(doctorList.this,CorunaDoctor.class);
            startActivity(intent);
        }
    }
}