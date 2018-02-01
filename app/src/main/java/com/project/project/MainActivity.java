package com.project.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userEmailEditText;
    EditText userNameEditText;
    EditText surnmaeEditText;
    Button CreateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // ищем кнопку
        Button button = findViewById(R.id.button);
        // привязываем к ней действие
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick(view);
            }
        });
    }

    private void intsalize() {
        EditText userEmailEditText = findViewById(R.id.editText10);
        EditText userNameEditText = findViewById(R.id.editText5);
        EditText surnameEditText = findViewById(R.id.editText11);
        Button CreateButton = findViewById(R.id.button2);

        userEmailEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

    public void onButtonClick(View view) {
        //создаём конверт с сообщением
        Intent intent = new Intent(this, MainActivity.class);
        //отправляем его
        startActivity(intent);
    }

}
