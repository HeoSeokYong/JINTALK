package com.example.jintalk;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class person extends AppCompatActivity {
    public static int b;
    public Button cancelBtn;
    public Button testBtn;
    public Button BBtn;
    public static int c;
    DBHelper helper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        testBtn=findViewById(R.id.testBtn);
        BBtn=findViewById(R.id.BBtn);
        cancelBtn = findViewById(R.id.cancelBtn);
        helper = new DBHelper(person.this, "person.db", null, 1);
        db = helper.getWritableDatabase();
        helper.onCreate(db);


        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=1000;
                ContentValues values= new ContentValues();
                values.put("name", "I: 내향적이고");
                db.insert("student", null, values);
                Intent intent = new Intent(person.this, Second.class);
                startActivity(intent);

            }
        });
        BBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                c=2000;
                ContentValues values = new ContentValues();
                values.put("name", "E: 외향적이고");
                db.insert("student", null, values);
                Intent intent = new Intent(person.this, Second.class);
                startActivity(intent);
            }
        });
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.delete("student","address=?", new String[]{"address"});
                Intent outIntent=getIntent();
                setResult(RESULT_CANCELED, outIntent);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed(){

    }
}
