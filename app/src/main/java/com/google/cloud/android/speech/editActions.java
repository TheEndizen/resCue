package com.google.cloud.android.speech;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
//import androidx.appcompat.app.AppCompatActivity;

public class editActions extends AppCompatActivity {
    TextView test;
    SharedPreferences sharedPref;
    SharedPreferences.Editor editor;
    public void toSettings(View view) {

        Intent goToSettings = new Intent(this,setSettings.class);
        startActivity(goToSettings);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_actions);
        sharedPref = getSharedPreferences("keyword1Settings", Context.MODE_PRIVATE);
        editor = sharedPref.edit();
        editor.putBoolean("call911",false);
        editor.putBoolean("callContacts",false);
        editor.apply();
    }
    public void textboxChecked (View view) {
        boolean checked = ((CheckBox)view).isChecked();
        switch(view.getId()) {
            case R.id.callContacts:
                if (checked) {
                    editor.putBoolean("callContacts",true);
                    editor.apply();
                }
                else {
                    editor.putBoolean("callContacts",false);
                    editor.apply();
                }
                break;
            case R.id.call911:
                if (checked) {
                    editor.putBoolean("call911",true);
                    editor.apply();
                }
                else {
                    editor.putBoolean("call911",false);
                    editor.apply();
                }
                break;
        }
    }
}
