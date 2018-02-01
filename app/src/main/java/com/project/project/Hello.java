package com.project.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Hello extends AppCompatActivity {

    EditText userNameEditText;
    EditText passwordEditText;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ищем кнопку
        Button button = findViewById(R.id.button);
        // привязываем к ней действие
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick(view);
            }
        });

        intsalize();

    }

    private void intsalize() {
        userNameEditText = findViewById(R.id.editText);
        passwordEditText = findViewById(R.id.editTextI);
        loginButton = findViewById(R.id.button);

        userNameEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
            check();
            }
        });

        passwordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                check();
            }
        });

        final TextView showPasswordTextView = findViewById(R.id.ShowPasswordView);
        showPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPasswordTextView.setText("HIDE");
            }
        });


    }

    private void check() {
        if (TextUtils.isEmpty(userNameEditText.getText())
            ||TextUtils.isEmpty(passwordEditText.getText())) {
            loginButton.setEnabled(false);
        }else {
            loginButton.setEnabled(true);
        }

    }

    public void onButtonClick(View view) {
        //создаём конверт с сообщением
        Intent intent = new Intent(this, MainActivity.class);
        //отправляем его
        startActivity(intent);
    }


}
