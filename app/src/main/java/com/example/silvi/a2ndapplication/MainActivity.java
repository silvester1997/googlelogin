package com.example.silvi.a2ndapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void doLogin(View view){
        EditText inputUsername = findViewById(R.id.user);

        String username = inputUsername.getText().toString();


        )
        Toast.makeText(context: this, resid: "Do the login for", Toast.:LENGTH_SHORT).show();
    }





}
