package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_create = (Button)findViewById(R.id.m_button_1);

        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "To be finished", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_history = (Button)findViewById(R.id.m_button_2);

        btn_history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ItemListActivity.class);
                startActivity(intent);
            }
        });

        Button btn_guide = (Button)findViewById(R.id.m_button_3);

        btn_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "developed by Matthew", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
