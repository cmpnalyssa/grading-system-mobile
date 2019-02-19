package com.example.cmpna.automatedgradingmonitoringsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MyClass extends AppCompatActivity {

    private Button view;
    private Button dashboard;
    private Button messageInbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_class);

        Button view = (Button) findViewById(R.id.view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRemarks();
            }
        });

        Button dashboard = (Button)findViewById(R.id.dashboard);
        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHome();
            }
        });

        Button  messageInbox = (Button) findViewById(R.id.messageInbox);
        messageInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMessageInbox();
            }
        });
    }

    public void openRemarks(){
        Intent intent = new Intent(this, Remarks.class);
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
