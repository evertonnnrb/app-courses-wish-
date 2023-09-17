package com.mywishlist.controller;

import android.content.Context;
import android.widget.Toast;

import com.mywishlist.model.Student;

public class StudentController {

    public void save(Context context, Student  student){
        Toast.makeText(context, "Student : "+student, Toast.LENGTH_SHORT).show();
    }
}
