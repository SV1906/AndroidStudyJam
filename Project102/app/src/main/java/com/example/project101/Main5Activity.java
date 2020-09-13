package com.example.project102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {

    private EditText mEditTextDPTo;
    private EditText mEditTextDPDate;
    private EditText mEditTextDPTime;
    private EditText mEditTextDPWhere;
    private EditText mEditTextDPFrom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mEditTextDPTo = findViewById(R.id.edit_text_DPto);
        mEditTextDPDate = findViewById(R.id.edit_text_DPdate);
        mEditTextDPTime = findViewById(R.id.edit_text_DPtime);
        mEditTextDPWhere = findViewById(R.id.edit_text_DPwhere);
        mEditTextDPFrom = findViewById(R.id.edit_text_DPfrom);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button buttonSend = findViewById(R.id.button_submit);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });


    }

    private void sendMail() {
        String recipientList = mEditTextDPTo.getText().toString();
        String[] recipients = recipientList.split(",");

        String subject ="YOU'RE INVITED!";
        String message = "PLEASE JOIN US FOR A \n DINNER PARTY \n"+mEditTextDPDate.getText().toString()+"\n"+mEditTextDPTime.getText().toString()+".\n\nVenue:"+mEditTextDPWhere.getText().toString()+".\nLove always,\n"+mEditTextDPFrom.getText().toString();


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);


        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }




}
