package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText name,surname;
    public Button add = findViewById(R.id.add);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String usersurname = surname.getText().toString();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra( "keyname",username);
                intent.putExtra( "keyname",usersurname);
                startActivity(intent);
            }
        });
    }
}