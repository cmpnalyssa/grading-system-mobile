package com.example.cmpna.automatedgradingmonitoringsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyClassMain extends AppCompatActivity {

    private Button mainview;
    private Button messagesinbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_class_main);

        Button messageInbox = (Button) findViewById(R.id.messageInbox);
        messageInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMessageInbox();
            }
        });

        Button mainview = (Button) findViewById(R.id.mainview);
        mainview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyClass();
            }
        });

        Button dashboard = (Button)findViewById(R.id.dashboard);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });

    }

    public void openMyClass(){
        Intent intent = new Intent(this, MyClass.class);
        startActivity(intent);
    }

    public void openHome(){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void openMessageInbox(){
        Intent intent = new Intent(this, MessageInbox.class);
        startActivity(intent);

    }
}
