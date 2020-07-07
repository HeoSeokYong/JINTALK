package com.example.jintalk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;


public class LoginActivity extends AppCompatActivity {

    private String id, pw;
    private boolean saveLoginData;
    private EditText et_id, et_pass;
    private Button btn_login, btn_register;
    private CheckBox checkBox;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mContext = this;

        et_id = findViewById(R.id.et_id);
        et_pass = findViewById(R.id.et_pass);
        btn_login = findViewById(R.id.btn_login);
        btn_register = findViewById(R.id.btn_register);
        checkBox = findViewById(R.id.checkBox);

        saveLoginData = PreferenceManager.getBoolean(mContext,"check");
        //저장된 데이터 있을 시
        if (saveLoginData){
            et_id.setText(PreferenceManager.getString(mContext,"id"));
            et_pass.setText(PreferenceManager.getString(mContext, "pw"));
            checkBox.setChecked(true);
        }

        // 회원가입 버튼을 클릭 시 수행.
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
        // 로그인 버튼 클릭 시 수행.
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userID = et_id.getText().toString();
                String userPass = et_pass.getText().toString();
                PreferenceManager.setString(mContext, "id", userID);
                PreferenceManager.setString(mContext, "pw", userPass);
                // 텍스트가 하나라도 비어있는 경우
                if(TextUtils.isEmpty(userID) || TextUtils.isEmpty(userPass)){
                    Toast.makeText(getApplicationContext(),"아이디 혹은 암호를 입력해주세요.", Toast.LENGTH_SHORT).show();
                }else {
                    Response.Listener<String> responseListener = new Response.Listener<String>() {
                        @Override
                        public void onResponse(String response) {
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                boolean success = jsonObject.getBoolean("success");
                                if (success) { // 로그인에 성공한 경우.
                                    String userID = jsonObject.getString("userID");
                                    String userPass = jsonObject.getString("userPassword");

                                    Toast.makeText(getApplicationContext(), "로그인에 성공하였습니다.", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(LoginActivity.this, SpActivity.class);
                                    intent.putExtra("userID", userID);
                                    intent.putExtra("userPass", userPass);

                                    startActivity(intent);
                                } else { // 로그인에 실패한 경우.
                                    Toast.makeText(getApplicationContext(), "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show();
                                    return;
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    LoginRequest loginRequest = new LoginRequest(userID, userPass, responseListener);
                    RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                    queue.add(loginRequest);
                }
            }
        });
        //로그인 기억하기, 체크박스 체크 유무에 따른 동작 구현.
        checkBox.setOnClickListener(new CheckBox.OnClickListener(){
            @Override
            public void onClick(View v){
                if(((CheckBox)v).isChecked()){
                    PreferenceManager.setString(mContext, "id", et_id.getText().toString());
                    PreferenceManager.setString(mContext, "pw", et_pass.getText().toString());
                    PreferenceManager.setBoolean(mContext, "check", checkBox.isChecked());
                } else {
                    PreferenceManager.setBoolean(mContext,"check",checkBox.isChecked());
                    PreferenceManager.clear(mContext);
                }
            }
        });
    }

}


