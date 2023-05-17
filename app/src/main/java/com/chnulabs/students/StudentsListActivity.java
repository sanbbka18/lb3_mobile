package com.chnulabs.students;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class StudentsListActivity extends AppCompatActivity {

    public static final String GROUP_NUMBER = "groupnumber";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list);

        Intent intent = getIntent();
        String grpNumber = intent.getStringExtra(GROUP_NUMBER);

        ListView listView = (ListView) findViewById(R.id.studentsList);
        ArrayAdapter<Student> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                Student.getStudents(grpNumber)
        );
        listView.setAdapter(adapter);
    }

}
