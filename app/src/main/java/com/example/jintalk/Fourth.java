package com.example.jintalk;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static com.example.jintalk.person.c;

import androidx.appcompat.app.AppCompatActivity;

public class Fourth extends AppCompatActivity {
    public Button cancelBtn;
    public Button testBtn;
    public Button BBtn;
    DBHelper helper;
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        testBtn = findViewById(R.id.testBtn);
        BBtn = findViewById(R.id.BBtn);
        cancelBtn = findViewById(R.id.cancelBtn);
        helper = new DBHelper(Fourth.this, "person.db", null, 1);
        db = helper.getWritableDatabase();
        helper.onCreate(db);

        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=c+1;
                ContentValues values= new ContentValues();
                values.put("personality", "J: 체계적인사람");
                db.insert("student", null, values);
                Intent intent = new Intent(Fourth.this, Fifth.class);
                startActivity(intent);
            }
        });
        BBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c=c+2;
                ContentValues values= new ContentValues();
                values.put("personality", "P: 융통성있는사람");
                db.insert("student", null, values);
                Intent intent = new Intent(Fourth.this, Fifth.class);
                startActivity(intent);
            }
        });
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                c= (c/100) * 100;
                ContentValues values= new ContentValues();
                values.put("address", (String) null);
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
