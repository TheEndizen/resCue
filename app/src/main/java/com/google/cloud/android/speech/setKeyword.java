package com.google.cloud.android.speech;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;



public class setKeyword extends AppCompatActivity {
    public String keyword;
    EditText textSetKeyword;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_keyword);
        textSetKeyword = (EditText) findViewById(R.id.textSetKeyword);
    }
    public void createAction(View view) {
        SharedPreferences sharedPref = getSharedPreferences("keyword1Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        keyword = textSetKeyword.getText().toString();
        editor.putString("keyword", keyword);
        editor.apply();
        Intent goToActions = new Intent(this,editActions.class);
        startActivity(goToActions);
    }
}
