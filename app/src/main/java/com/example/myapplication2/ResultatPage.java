package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ResultatPage extends AppCompatActivity {

    TextView nomRes,emailRes,usernameRes;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat_page);


        usernameRes = (TextView) findViewById(R.id.RecupUsername);
        nomRes = (TextView) findViewById(R.id.RecupNom);
        emailRes = (TextView) findViewById(R.id.RecupEmail);


        usernameRes.setText(getIntent().getExtras().getString("usernameLog"));
        nomRes.setText(getIntent().getExtras().getString("nomLog"));
        emailRes.setText(getIntent().getExtras().getString("emailLog"));





    }

}