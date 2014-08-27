package com.hboqu.laiqian.fragment;

import com.hboqu.laiqian.R;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Page06Fragment extends Fragment {

    private static final String TAG = "Page01Fragment";
//    private View mView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        LayoutInflater inflater = getActivity().getLayoutInflater();
//        mView = inflater.inflate(R.layout.page01_fragment_layout,
//                (ViewGroup) getActivity().findViewById(R.id.view_pager), true);
        Log.e(TAG, "nannan onCreate ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
            @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.page01_fragment_layout,
                container, false);
//        ViewGroup view = (ViewGroup) mView.getParent();
//        if(view != null) {
//            view.removeAllViewsInLayout();
//        }
        Log.e(TAG, "nannan onCreateView ");
        return view;
    }
}
