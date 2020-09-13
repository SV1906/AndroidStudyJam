package com.example.project102;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Main6Activity extends AppCompatActivity {


    private EditText mEditTextWDTo;
    private EditText mEditTextWDBName;
    private EditText mEditTextWDGName;
    private EditText mEditTextWDDateAndTime;
    private EditText mEditTextWDWhere;
    private EditText mEditTextWDFName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        mEditTextWDTo = findViewById(R.id.edit_text_WDto);
        mEditTextWDBName = findViewById(R.id.edit_text_WDBname);
        mEditTextWDGName = findViewById(R.id.edit_text_WDGname);
        mEditTextWDDateAndTime = findViewById(R.id.edit_text_WDDateAndTime);
        mEditTextWDWhere = findViewById(R.id.edit_text_WDwhere);
        mEditTextWDFName = findViewById(R.id.edit_text_WDfname);

        Button buttonSend = findViewById(R.id.button_submit);
        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail1();
            }
        });
    }

    private void sendMail1() {
        String recipientList = mEditTextWDTo.getText().toString();
        String[] recipients = recipientList.split(",");

        String subject = "SAVE THE DATE!";
        String message = "IT'S HAPPENING!!!\n" + mEditTextWDBName.getText().toString() + "   &   " + mEditTextWDGName.getText().toString() + "\nare getting married on " + mEditTextWDDateAndTime.getText().toString() + "\nVenue: " + mEditTextWDWhere.getText().toString() + "\nLove always,\n" + mEditTextWDFName.getText().toString();


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);


        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }
}
