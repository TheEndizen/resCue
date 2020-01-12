package com.google.cloud.android.speech;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class setSettings extends AppCompatActivity {
    EditText textCustomMessage;
    EditText textSetContact;
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_settings);
        textCustomMessage = (EditText) findViewById(R.id.textCustomMessage);
        textSetContact = (EditText) findViewById(R.id.textSetContact);
    }
    public void saveInfo(View view) {
        SharedPreferences sharedPref = getSharedPreferences("keyword1Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("contact",textSetContact.getText().toString());
        editor.putString("message",textCustomMessage.getText().toString());
        editor.apply();
        Intent goToOptions = new Intent(this,Setup.class);
        startActivity(goToOptions);
    }
}
