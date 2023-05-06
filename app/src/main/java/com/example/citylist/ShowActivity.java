package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        Intent ii=getIntent();
        String ss = ii.getStringExtra("cityname");

        TextView tv = findViewById(R.id.textViewS);
        tv.setText(ss);

        Button button_return =findViewById(R.id.buttonR);
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(ShowActivity.this,MainActivity.class);
                startActivity(it);
                finish();
            }
        });

    }
}

