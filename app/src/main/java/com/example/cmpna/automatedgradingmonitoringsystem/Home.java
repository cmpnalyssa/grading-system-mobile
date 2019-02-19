package com.example.cmpna.automatedgradingmonitoringsystem;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class Home extends AppCompatActivity {

    private Button myClassMain;
    private Button messageInbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView textView = (TextView) findViewById(R.id.name);
        textView.setPaintFlags(textView.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        TextView textView2 = (TextView) findViewById(R.id.name2);
        textView2.setPaintFlags(textView2.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        TextView textView3 = (TextView) findViewById(R.id.name3);
        textView3.setPaintFlags(textView3.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        TextView textView4 = (TextView) findViewById(R.id.name4);
        textView4.setPaintFlags(textView4.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        TextView textView5 = (TextView) findViewById(R.id.name5);
        textView5.setPaintFlags(textView5.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        TextView textView6 = (TextView) findViewById(R.id.name6);
        textView6.setPaintFlags(textView6.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        TextView textView7 = (TextView) findViewById(R.id.name7);
        textView7.setPaintFlags(textView7.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        TextView textView8 = (TextView) findViewById(R.id.name8);
        textView8.setPaintFlags(textView8.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        TextView textView9= (TextView) findViewById(R.id.name9);
        textView9.setPaintFlags(textView9.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        TextView textView10 = (TextView) findViewById(R.id.name10);
        textView10.setPaintFlags(textView10.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);

        Button messageInbox = (Button) findViewById(R.id.messageInbox);
        messageInbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMessageInbox();
            }
        });

        Button myClassMain = (Button) findViewById(R.id.myClassMain);
        myClassMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyClassMain();
            }
        });

        Thread t = new Thread(){
            @Override
            public void run() {
                try{
                    while(!isInterrupted()){
                        Thread.sleep(1000);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                TextView tdate = (TextView) findViewById(R.id.date);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat sdf = new SimpleDateFormat("MMM dd yyyy\nhh-mm-ss a");
                                String dateString = sdf.format(date);
                                tdate.setText(dateString);
                            }
                        });
                    }
                } catch (InterruptedException e) {

                }
            }
        };
        t.start();


    }
    public void openMyClassMain(){
        Intent intent = new Intent(this, MyClassMain.class);
        startActivity(intent);
    }

    public void openMessageInbox(){
        Intent intent = new Intent(this, MessageInbox.class);
        startActivity(intent);

    }
}
