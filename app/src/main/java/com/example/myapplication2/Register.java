package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    EditText usernameReg ,  motdepasseReg ,emailReg ,nomReg;
    Button btnReg;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nomReg = (EditText) findViewById(R.id.name);
        usernameReg = (EditText) findViewById(R.id.user);
        motdepasseReg = (EditText) findViewById(R.id.password);
        emailReg =(EditText) findViewById(R.id.email);
        btnReg = (Button) findViewById(R.id.btnReg);




        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nomReg.getText().toString().equals("")|| motdepasseReg.getText().toString().equals("")||emailReg .getText().toString().equals("")||usernameReg .getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Tous les champs doivent etre remplis", Toast.LENGTH_LONG).show();
                    return;
                }
                else{
                    Intent intent = new Intent(Register.this, Login.class);
                    intent.putExtra("username", usernameReg.getText().toString());
                    intent.putExtra("nom", nomReg.getText().toString());
                    intent.putExtra("email", emailReg.getText().toString());
                    intent.putExtra("motdepasse", motdepasseReg.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}