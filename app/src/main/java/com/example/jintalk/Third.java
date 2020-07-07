package com.example.jintalk;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static com.example.jintalk.person.c;

import androidx.appcompat.app.AppCompatActivity;

public class Third extends AppCompatActivity {
    public Button cancelBtn;
    public Button testBtn;
    public Button BBtn;
    DBHelper helper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        testBtn = findViewById(R.id.testBtn);
        BBtn = findViewById(R.id.BBtn);
        cancelBtn = findViewById(R.id.cancelBtn);
        helper = new DBHelper(Third.this, "person.db", null, 1);
        db = helper.getWritableDatabase();
        helper.onCreate(db);


        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=c+10;
                ContentValues values= new ContentValues();
                values.put("address", "T: 사고적인");
                db.insert("student", null, values);
                Intent intent = new Intent(Third.this, Fourth.class);
                startActivity(intent);
            }
        });
        BBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=c+20;
                ContentValues values= new ContentValues();
                values.put("address", "F: 감정적인");
                db.insert("student", null, values);
                Intent intent = new Intent(Third.this, Fourth.class);
                startActivity(intent);
            }
        });
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=(c/1000) * 1000;
                ContentValues values= new ContentValues();
                values.put("age", (String) null);
                db.update("student",values, null, new String[]{});
                Intent outIntent = getIntent();
                setResult(RESULT_CANCELED, outIntent);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed(){

    }
}


