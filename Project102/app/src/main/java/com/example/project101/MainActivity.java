package com.example.project102;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.project101.R;



import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonBD = findViewById(R.id.button_BD);
        buttonBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BD();
            }
        });
        Button buttonWD = findViewById(R.id.button_WD);
        buttonWD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WD();
            }
        });
        Button buttonDP = findViewById(R.id.button_DP);
        buttonDP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DP();
            }
        });

    }

    private void BD() {
        Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }

    private void DP() {
        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
    }

    private void WD() {
        Intent intent = new Intent(this,Main6Activity.class);
        startActivity(intent);
    }

}
