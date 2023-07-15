package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText username, password, email, phone;
    Button register, login;
    RadioButton perempuan, lakilaki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.txt_username);
        password = (EditText) findViewById(R.id.txt_password);
        email = (EditText) findViewById(R.id.txt_email);
        phone = (EditText) findViewById(R.id.txt_phone);
        register = (Button) findViewById(R.id.button);
        login = (Button) findViewById(R.id.button2);
        lakilaki = (RadioButton) findViewById(R.id.radioButton);
        perempuan = (RadioButton) findViewById(R.id.radioButton2);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username.getText().toString();
                String pw = password.getText().toString();
                String mail = email.getText().toString();
                String tlp = phone.getText().toString();

                if (name.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Username tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (pw.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (mail.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Email tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else if (tlp.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "Telepon tidak boleh kosong", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(RegisterActivity.this, "Berhasil Mendaftar!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuLogin = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(menuLogin);
            }
        });
    }
}