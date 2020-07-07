package com.example.jintalk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SpActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);
        startLoading();

    }
    private void startLoading(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = getIntent();
                String userID = intent.getStringExtra("userID");
                String userPass = intent.getStringExtra("userPass");
                intent = new Intent(getBaseContext(), MainActivity.class);
                intent.putExtra("userID",userID);
                intent.putExtra("userPass",userPass);
                //intent = new Intent(getBaseContext(), Navi.class);
                startActivity(intent);
                finish();
            }
    }, 3000);
    }
}
