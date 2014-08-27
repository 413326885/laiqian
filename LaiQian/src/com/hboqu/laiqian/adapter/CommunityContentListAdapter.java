package com.hboqu.laiqian.adapter;

import com.hboqu.laiqian.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class CommunityContentListAdapter extends BaseAdapter{

    private static final String TAG = "CommunityContentListAdapter";
    
    private Context mContext;
    private LayoutInflater mInflater;
    
    public CommunityContentListAdapter(Context context) {
        mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }
    
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.community_item_layout, parent, false); 
        }
        return convertView;
    }

}
