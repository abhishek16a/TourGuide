package com.example.tourguide;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText etUserName,etPassword;
    private Button btnLOgIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserName=findViewById(R.id.etUserName);
        etPassword=findViewById(R.id.etPassword);
        btnLOgIn=findViewById(R.id.btnLOgIn);

        btnLOgIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
    private void checkUser(){
        SharedPreferences sharedPreferences=getSharedPreferences("User", MODE_PRIVATE);
        String username= sharedPreferences.getString("username", "");
        String password= sharedPreferences.getString("password", "");
        if (username.equals(etUserName.getText().toString())){
            
        }

    }
}
