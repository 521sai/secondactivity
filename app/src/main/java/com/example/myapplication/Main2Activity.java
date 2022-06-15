package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    private TextView name = findViewById(R.id.text_name),surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        surname = findViewById(R.id.text_surname);

        String username = getIntent().getStringExtra("keyname");
        String usersurname = getIntent().getStringExtra("keysurname");

        name.setText(username);
        surname.setText(usersurname);
    }
}
