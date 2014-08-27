package com.hboqu.laiqian;

import com.tendcloud.tenddata.TCAgent;

import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.widget.Toast;

public class AbstractActivity extends FragmentActivity {

    public void showMesage(int resId) {
        Toast.makeText(this, resId, Toast.LENGTH_SHORT).show();
    }

    private long mExitTime = 0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                showMesage(R.string.exit_confirm);
                mExitTime = System.currentTimeMillis();
            } else {
                finish();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TCAgent.onResume(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        TCAgent.onPause(this);
    }
}
