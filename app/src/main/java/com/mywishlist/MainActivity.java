package com.mywishlist;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.mywishlist.controller.StudentController;
import com.mywishlist.model.Student;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences coursesWhishPreferences;
    public static final String NAME_PREFERENCE = "pref_whish_list";
    private EditText editTextName;
    private EditText editTextLastName;
    private EditText editTextEmail;
    private EditText editTextFone;
    private EditText editTextCourseWish;

    private Button buttonSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextFone = findViewById(R.id.editTextFone);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextCourseWish = findViewById(R.id.editTextCourse);
        buttonSave = findViewById(R.id.btnSave);

        coursesWhishPreferences = getSharedPreferences(NAME_PREFERENCE, 0);
        SharedPreferences.Editor whishList = coursesWhishPreferences.edit();

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student student = new Student(
                        editTextName.getText().toString(),
                        editTextLastName.getText().toString(),
                        editTextFone.getText().toString(),
                        editTextEmail.getText().toString(),
                        editTextCourseWish.getText().toString());

                whishList.putString("firstName", student.getName());
                whishList.putString("lastName", student.getLastName());
                whishList.putString("fone", student.getFone());
                whishList.putString("email", student.getEmail());
                whishList.putString("wishList", student.getCourseWish());
                whishList.apply();

                StudentController studentController = new StudentController();
                studentController.save(getApplicationContext(), student);

            }
        });

    }
}