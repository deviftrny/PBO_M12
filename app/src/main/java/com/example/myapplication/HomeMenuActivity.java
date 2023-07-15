package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class HomeMenuActivity extends AppCompatActivity {
    Button linear;
    Button relative;
    Button listdata;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_menu);

        linear = (Button) findViewById(R.id.btnLinear);
        relative = (Button) findViewById(R.id.btnRelative);
        listdata = (Button) findViewById(R.id.btnListData);
        login = (Button) findViewById(R.id.btnLogin);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent linearlayout = new Intent(HomeMenuActivity.this, LinearLayoutActivity.class);
                startActivity(linearlayout);
            }
        });

        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent relativelayout = new Intent(HomeMenuActivity.this, RelativeLayoutActivity.class);
                startActivity(relativelayout);
            }
        });

        listdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listdata = new Intent(HomeMenuActivity.this, ListDataActivity.class);
                startActivity(listdata);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menulogin = new Intent(HomeMenuActivity.this, LoginActivity.class);
                startActivity(menulogin);
            }
        });
    }
}