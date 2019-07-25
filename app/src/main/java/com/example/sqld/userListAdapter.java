package com.example.sqld;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class userListAdapter extends BaseAdapter {

    Context context;
    int[] listUser;

    public userListAdapter(Context context, int[] listUser) {
        this.context = context;
        this.listUser = listUser;
    }

    @Override
    public int getCount() {
        return this.listUser.length;
    }

    @Override
    public Object getItem(int i) {
        return this.listUser.;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
