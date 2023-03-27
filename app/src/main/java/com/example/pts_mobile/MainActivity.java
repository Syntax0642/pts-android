package com.example.pts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button register;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register = findViewById(R.id.register);
        login = findViewById(R.id.login);

        register.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.login){
            Intent intent = new Intent(MainActivity.this , Login.class);
            startActivity(intent);

        }else if(view.getId() == R.id.register){

            Intent intent1 = new Intent(MainActivity.this , Register.class);
            startActivity(intent1);
        }
    }
}