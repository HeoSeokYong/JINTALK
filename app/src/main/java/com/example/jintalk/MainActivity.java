package com.example.jintalk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    final  static int ACT_EDIT=0;
    public Button per;
    public Button my;
    public Button psy;
    public TextView mText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mText = findViewById(R.id.text);
        per = (Button)findViewById(R.id.personality);       //각 버튼아이디정의
        my = (Button)findViewById(R.id.mypage);
        psy = (Button)findViewById(R.id.psychology);

        per.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v){
                Intent intent = new Intent(MainActivity.this, person.class);

                startActivityForResult(intent, ACT_EDIT);

            }
        });

        my.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                Intent intent = getIntent();
                String userID = intent.getStringExtra("userID");
                String userPass = intent.getStringExtra("userPass");

                intent = new Intent(MainActivity.this, mypa.class);

                intent.putExtra("userID",userID);
                intent.putExtra("userPass",userPass);
                startActivityForResult(intent,ACT_EDIT);
            }
        });

        psy.setOnClickListener(new View.OnClickListener(){
            public void  onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://chat.latte.ai/JQur/"));
                startActivity(intent);
            }
        });
    }
    protected  void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==ACT_EDIT && resultCode==RESULT_OK){
            mText.setText(data.getStringExtra("TextOut"));
        }
    }

}
