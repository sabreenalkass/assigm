package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        String id = getIntent().getStringExtra("id");
        String title = getIntent().getStringExtra("title");
        String note = getIntent().getStringExtra("note");
        String date = getIntent().getStringExtra("date");
    }
}
