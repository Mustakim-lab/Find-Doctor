package com.example.finddoctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.finddoctor.Adapter.HelthAdapter;

public class HelthActivity extends AppCompatActivity {

    private ListView listView;
    String[] name;
    String[] child;
    int[] icon={R.drawable.protin};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helth);

        name=getResources().getStringArray(R.array.khabarer_name);
        child=getResources().getStringArray((R.array.biboron));

        listView=findViewById(R.id.listView_ID);

        HelthAdapter helthAdapter=new HelthAdapter(HelthActivity.this,name,icon);
        listView.setAdapter(helthAdapter);
    }
}