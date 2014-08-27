package com.hboqu.laiqian;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class LaiQianApplication extends Application {

    private static final String TAG = "LaiQianApplication";

/*    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferences prefs = this.getSharedPreferences(
                LaiQianActivity.PREFS_LAIQIAN_DEFAULT, MODE_PRIVATE);
        Editor editor = prefs.edit();
        editor.putBoolean("isUpdate", false);
        editor.commit();
    }*/
}
