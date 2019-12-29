package com.example.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        EditText username=(EditText) findViewById(R.id.username);
        EditText password=(EditText)findViewById(R.id.password);
        String user= username.getText().toString();
        String pass=password.getText().toString();
        if(user.equals("")||pass.equals("")){
            Toast.makeText(view.getContext(),"Please enter the data",Toast.LENGTH_LONG).show();
        }
        Intent i = new Intent(MainActivity.this,MiwokActivity.class);
        if(user.equals("daibin") && pass.equals("daibin")){
            startActivity(i);
        }

    }

    public void show_password(View view) {
        EditText password=(EditText)findViewById(R.id.password);
        password.setInputType(InputType.TYPE_CLASS_TEXT);
        password.setSelection(password.getText().length());
    }
}
