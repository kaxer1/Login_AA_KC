package com.example.login_aa_kc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtUsu;
    private EditText txtPass;
    private TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View v){

        txtUsu = (EditText)findViewById(R.id.txtUsuario);
        txtPass = (EditText) findViewById(R.id.txtPassword);


        if(txtUsu.getText().toString().equals("admin") && txtPass.getText().toString().equals("admin")){

            login = (TextView) findViewById(R.id.txt);
            login.setText("Ingreso Correcto");


        }else{
            //wrong password
        }
    }

}
