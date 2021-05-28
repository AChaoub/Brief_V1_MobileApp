package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    EditText username, motdepasse;
    Button login,regis;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.luser);
        motdepasse = (EditText) findViewById(R.id.lpass);

        login = (Button) findViewById(R.id.bntClose);


        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("")|| motdepasse.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Username ou mot de passe ne doivent pas etre vides", Toast.LENGTH_LONG).show();
                    return;
                }
                else{
                   if(username.getText().toString().equals(getIntent().getExtras().getString("username"))&&(motdepasse.getText().toString().equals(getIntent().getExtras().getString("motdepasse")))) {
                       String nom = getIntent().getExtras().getString("nom");
                       String email = getIntent().getExtras().getString("email");


                       Intent intent = new Intent(Login.this, ResultatPage.class);

                       intent.putExtra("usernameLog", username.getText().toString());
                       intent.putExtra("nomLog", nom);
                       intent.putExtra("emailLog", email);

                       startActivity(intent);
                   }
                   else{
                       Toast.makeText(getApplicationContext(), "Informations pas correctes", Toast.LENGTH_LONG).show();
                       Intent intent = new Intent(Login.this, Login.class);
                       startActivity(intent);


                   }

                }
            }
        });

        /*regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });*/






    }
}