package com.example.abdigital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.example.abdigital.Constants.studentID;

public class SplashActivity extends AppCompatActivity   {

    private Button myButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        myButton = findViewById(R.id.btn_splash);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                intent.putExtra(studentID,2);
                intent.putExtra("name","Malik");
                startActivity(intent);

                //Amman     ----Bags and stuff ---->      Zarqa

            }
        });
    }


}
