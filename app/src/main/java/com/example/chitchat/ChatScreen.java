package com.example.chitchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ChatScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_screen);
        TextView t=findViewById(R.id.phone_no);
        String p=getIntent().getStringExtra("Phoneno");
        t.setText(p);
    }
}