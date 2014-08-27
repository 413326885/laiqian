package com.hboqu.laiqian;

import java.util.ArrayList;

import com.hboqu.laiqian.adapter.ViewPagerFragmentAdapter;
import com.hboqu.laiqian.fragment.Page01Fragment;
import com.hboqu.laiqian.fragment.Page02Fragment;
import com.hboqu.laiqian.fragment.Page03Fragment;
import com.hboqu.laiqian.viewpagerindicator.TabPageIndicator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;

public class CommunityActivity extends AbstractActivity {

    private static final String TAG = "CommunityActivity";

    private ViewPager mViewPager;
    private ArrayList<Fragment> mViewFragmentSets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_layout);
        initViewPager();
    }

    @Override
    protected void onResume() {
        super.onResume();
        initViewPager();
    }

    private void initViewPager() {
        mViewPager = (ViewPager) findViewById(R.id.view_pager);

        mViewFragmentSets = new ArrayList<Fragment>();
        mViewFragmentSets.add(new Page01Fragment());
        mViewFragmentSets.add(new Page02Fragment());
        mViewFragmentSets.add(new Page03Fragment());

        mViewPager.setAdapter(new ViewPagerFragmentAdapter(
                getSupportFragmentManager(), mViewFragmentSets));

        TabPageIndicator headBarIndicator = (TabPageIndicator) findViewById(R.id.community_headbar_indicator);
        headBarIndicator.setViewPager(mViewPager);
        headBarIndicator.setOnPageChangeListener(new OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
            }
        });
    }

}
