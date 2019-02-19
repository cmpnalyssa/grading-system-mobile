package com.example.cmpna.automatedgradingmonitoringsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.volley.Request;

import org.w3c.dom.Text;


public class Login extends AppCompatActivity {

    private EditText editTextName, editTextPassword;
    private Button login;
    private TextView sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login);
        editTextName = (EditText) findViewById(R.id.editTextName);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHome();
            }
        });



        login.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                login.setBackgroundResource(R.drawable.rounded_edittext);
                login.setTextColor(getResources().getColor(R.color.white));

                return false;
            }
        });


    }
    public void openHome(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    private void userLogin(){
        final String username = editTextName.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();

       StringRequest stringRequest = new StringRequest();
    }

}
