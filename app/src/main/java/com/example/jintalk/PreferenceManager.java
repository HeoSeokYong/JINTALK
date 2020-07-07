package com.example.jintalk;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceManager {
    public static final String PREFERENCES_NAME = "rebuild_preference";
    private static final String DEFAULT_VALUE_STRING = "";
    private static final boolean DEFAULT_VALUE_BOOLEAN = false;


    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    /**
     * String 값 저장
     */
    public static void setString(Context context, String key, String value) {

        SharedPreferences prefs = getPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(key, value);
        editor.commit();
    }

    /**
     * boolean 값 저장
     */
    public static void setBoolean(Context context, String key, boolean value) {

        SharedPreferences prefs = getPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }


    /**
     * String 값 로드
     */
    public static String getString(Context context, String key) {

        SharedPreferences prefs = getPreferences(context);
        String value = prefs.getString(key, DEFAULT_VALUE_STRING);
        return value;
    }

    /**
     * boolean 값 로드
     */
    public static boolean getBoolean(Context context, String key) {

        SharedPreferences prefs = getPreferences(context);
        boolean value = prefs.getBoolean(key, DEFAULT_VALUE_BOOLEAN);
        return value;
    }




    /**
     * 키 값 삭제
     */
    public static void removeKey(Context context, String key) {

        SharedPreferences prefs = getPreferences(context);
        SharedPreferences.Editor edit = prefs.edit();
        edit.remove(key);
        edit.commit();
    }

    /**
     * 모든 저장 데이터 삭제
     */
    public static void clear(Context context) {

        SharedPreferences prefs = getPreferences(context);
        SharedPreferences.Editor edit = prefs.edit();
        edit.clear();
        edit.commit();
    }
}

