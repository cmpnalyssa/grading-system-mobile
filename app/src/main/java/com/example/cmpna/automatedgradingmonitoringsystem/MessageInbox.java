package com.example.cmpna.automatedgradingmonitoringsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MessageInbox extends AppCompatActivity {
    private Button dashboard;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_inbox);

        listView=(ListView)findViewById(R.id.listView);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Maria Rica Gabutan");
        arrayList.add("Maria Rica Gabutan");
        arrayList.add("Maria Rica Gabutan");
        arrayList.add("Maria Rica Gabutan");
        arrayList.add("Maria Rica Gabutan");
        arrayList.add("Maria Rica Gabutan");
        arrayList.add("Maria Rica Gabutan");
        arrayList.add("Maria Rica Gabutan");
        arrayList.add("Maria Rica Gabutan");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);


    }
}
