package com.example.bulbul.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.logging.Logger;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        showMessage("onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showMessage("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showMessage("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showMessage("onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showMessage("onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showMessage("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showMessage("onDestroy");
    }

    private void showMessage(String message){
        Toast.makeText(this, "SecondActivity: " + message, Toast.LENGTH_SHORT).show();

    }

    public void finishActivity(View view) {
        finish();
    }


}