package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Note> studentslist = new ArrayList<>();
    RecyclerView notes_rv;
    NotesAdapter notesAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        notes_rv = findViewById(R.id.student_rv);
        notes_rv.setLayoutManager(new LinearLayoutManager(this));
        notesAdapter = new NotesAdapter(this ,studentslist );
        notes_rv.setAdapter(notesAdapter);
    }

    private void initData() {
        studentslist . add(new Note("1","Student  1 Title" , "Student 1 description" , "5/12/2019"));
        studentslist . add(new Note("2","Student  2 Title" , "Student 2 description" , "5/12/2019"));
        studentslist . add(new Note("3","Student  3 Title" , "Student 3 description" , "5/12/2019"));
        studentslist . add(new Note("4","Student  4 Title" , "Student 4 description" , "5/12/2019"));
        studentslist . add(new Note("5","Student  5 Title" , "Student 5 description" , "5/12/2019"));
        studentslist . add(new Note("6","Student  6 Title" , "Student 6 description" , "5/12/2019"));

    }
}
