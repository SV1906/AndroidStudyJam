package com.example.firebaseauth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;


public class Register extends AppCompatActivity {
    EditText EmailId, Password, PhoneNo;
    Button  Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EmailId = findViewById(R.id.edit_text_Eid);
        Password= findViewById(R.id.edit_text_Pwd);
        PhoneNo = findViewById(R.id.edit_text_Pno);
        Submit = findViewById(R.id.button_submit);


    }
}
