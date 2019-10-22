package com.example.login_aa_kc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OkActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok);
        tv1 = (TextView) findViewById(R.id.name);

        Bundle bundle = getIntent().getExtras();
        tv1.setText(bundle.getString("nombre"));

    }

    public void cerrarActiviy(View view){
        finish();
    }
}
