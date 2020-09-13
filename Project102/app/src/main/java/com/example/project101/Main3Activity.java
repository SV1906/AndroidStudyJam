package com.example.project102;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.project101.R;



import androidx.appcompat.app.AppCompatActivity;


public class Main3Activity extends AppCompatActivity {

    private EditText mEditTextBDTo;
    private EditText mEditTextBDName;
    private EditText mEditTextBDOn;
    private EditText mEditTextBDTime;
    private EditText mEditTextBDWhere;
    private EditText mEditTextBDHow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mEditTextBDTo = findViewById(R.id.edit_text_BDto);
        mEditTextBDName = findViewById(R.id.edit_text_BDname);
        mEditTextBDOn = findViewById(R.id.edit_text_BDon);
        mEditTextBDTime = findViewById(R.id.edit_text_BDtime);
        mEditTextBDWhere = findViewById(R.id.edit_text_BDwhere);
        mEditTextBDHow = findViewById(R.id.edit_text_BDhow);

        Button buttonSend = findViewById(R.id.button_submit);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }
    private void sendMail() {
        String recipientList = mEditTextBDTo.getText().toString();
        String[] recipients = recipientList.split(",");

        String subject ="YOU ARE INVITED!";
        String message = "Join US for a CELEBRATION of "+mEditTextBDName.getText().toString()+"'s BIRTHDAY ON "+mEditTextBDOn.getText().toString()+" AT "+mEditTextBDTime.getText().toString()+".\nThe THEME :"+mEditTextBDHow.getText().toString()+".\nVENUE :"+mEditTextBDWhere.getText().toString()+"\nLove always,\nSandhya";


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);


        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }
}
