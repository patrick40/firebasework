package com.example.myfirebase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements viewOnClickListener{
    private Button buttonRegister;
    private EditText EditTextEmail;
    private EditText EditTextPassword;
    private EditText EditTextViewSignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonRegister = (Button) findViewById(R.id.buttonRegister);
        EditTextEmail=(EditText) findViewById(R.id.EditTextEmaail);
        EditTextPassword = (EdiText) findViewById(R.id.EditTextPassword);
        EditTextViewSignin =(EditText)findViewById(R.id.EditTextViewSignin);
        buttonRegister.setOnClickListener(this);
    }
}
