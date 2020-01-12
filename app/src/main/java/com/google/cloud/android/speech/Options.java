package com.google.cloud.android.speech;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
//import androidx.appcompat.app.AppCompatActivity;

public class Options extends AppCompatActivity {
    public String keyword;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);



    }
    public void setKeyword(View view) {
        Intent intentSetKeyword = new Intent(this, setKeyword.class);
        startActivity(intentSetKeyword);
    }
    public void goBack(View view){
        Intent back = new Intent(this,Setup.class);
        startActivity(back);
    }
}
