package com.google.cloud.android.speech;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;

public class Setup extends AppCompatActivity {
    RadioButton radioOn;
    TextView textName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setup);
        //Button setupButton = (Button) findViewById(R.id.setupButton);
    }
    public void goToOptions(View view) {
        textName = (TextView)findViewById(R.id.textName);
        SharedPreferences sharedPref = getSharedPreferences("keyword1Settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString("name",textName.getText().toString());
        editor.apply();
        textName.setText(sharedPref.getString("name",""));
        Intent intentToOptions = new Intent(this, setKeyword.class);
        startActivity(intentToOptions);
    }
    public void startRun(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        if (checked) {
            Intent intentRun = new Intent(this, MainActivity.class);
            startActivity(intentRun);
        }
        else {

        }
    }

}