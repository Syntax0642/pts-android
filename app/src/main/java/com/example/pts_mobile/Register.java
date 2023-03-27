package com.example.pts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class Register extends AppCompatActivity {
    private ArrayList<String> arrayList;
    private EditText editText;
    private EditText editText1;
    private EditText editText2;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editText = findViewById(R.id.emailsignup);
        editText1 = findViewById(R.id.usernamesignup);
        editText2 = findViewById(R.id.passwordsignup);

        imageView = findViewById(R.id.button_signup);

        imageView.setOnClickListener(view -> {
            String email = editText.getText().toString();
            String username = editText1.getText().toString();
            String password = editText2.getText().toString();

            Login login = new Login();



            Intent intent = new Intent(Register.this , Login.class);
            intent.putExtra(login.EXTRA_EMAIL,email);
            intent.putExtra(login.EXTRA_USERNAME,username);
            intent.putExtra(login.EXTRA_PASSWORD,password);


            editText.setText("");
            editText1.setText("");
            editText2.setText("");

            startActivity(intent);


        });



    }
}