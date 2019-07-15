package com.example.alc4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activity2(View view){
        Intent openSecondActivity = new Intent(this, AboutALC.class);
        startActivity(openSecondActivity);
    }

    public void activity3(View view){
        Intent openThirdActivity = new Intent(this, MyProfileALC.class);
        startActivity(openThirdActivity);
    }
}
