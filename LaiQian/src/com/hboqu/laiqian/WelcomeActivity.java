package com.hboqu.laiqian;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

public class WelcomeActivity extends Activity {

    private static final String TAG = "WelcomeActivity";
    private static final String IS_FIRST_STARTUP = "is_first_startup";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = this.getSharedPreferences(
                LaiQianMainActivity.PREFS_LAIQIAN_DEFAULT, MODE_PRIVATE);
        boolean isFirstStartUp = prefs.getBoolean(IS_FIRST_STARTUP, true);
        if (!isFirstStartUp) {
            redirectToMainActivity();
            return;
        }

        Editor editor = prefs.edit();
        editor.putBoolean(IS_FIRST_STARTUP, false);
        editor.commit();

        final View view = View.inflate(this, R.layout.welcome_layout, null);
        setContentView(view);

        AlphaAnimation animation = new AlphaAnimation(0.3f, 1.0f);
        animation.setDuration(2000);
        view.startAnimation(animation);
        animation.setAnimationListener(new AnimationListener() {
            @Override
            public void onAnimationEnd(Animation arg0) {
                redirectToMainActivity();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            @Override
            public void onAnimationStart(Animation animation) {
            }

        });

    }

    private void redirectToMainActivity() {
        Intent intent = new Intent(this, LaiQianMainActivity.class);
        startActivity(intent);
        finish();
    }
}
