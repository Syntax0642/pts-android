package com.example.pts_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

public class Login extends AppCompatActivity {

    public String EXTRA_EMAIL = "EXTRA_EMAIL";
    public String EXTRA_PASSWORD = "EXTRA_PASSWORD";
    public String EXTRA_USERNAME = "EXTRA_USERNAME";

    public String name;
    public String user;
    public String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private ArrayList<String> arrayList = new ArrayList<String>();


    private EditText editText;
    private EditText editText1;
    private ImageView button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final boolean[] log = {true};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText = findViewById(R.id.username);
        editText1 = findViewById(R.id.password);

        String email = getIntent().getStringExtra(EXTRA_EMAIL);
        String password = getIntent().getStringExtra(EXTRA_PASSWORD);
        String user = getIntent().getStringExtra(EXTRA_USERNAME);
        setName(email);
        setPass(password);
        setUser(user);
        arrayList.add(getName());
        arrayList.add(getPass());
        arrayList.add(getUser());


        button = findViewById(R.id.login_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < arrayList.size();i++){

                    System.out.println(arrayList);
                        if(arrayList.get(i).equals(editText.getText().toString())){
                            log[0] = false;
                        }

                }

                if(!log[0]){
                    Intent intent = new Intent(Login.this, Home.class);
                        startActivity(intent);
                }
            }
        });






    }
}