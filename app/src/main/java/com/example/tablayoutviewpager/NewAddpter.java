package com.example.tablayoutviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class NewAddpter extends FragmentStateAdapter {

    ArrayList<My_Tab>arrayList;
    public NewAddpter(@NonNull FragmentActivity fragmentActivity,ArrayList<My_Tab>arrayList) {
        super(fragmentActivity);
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position){
        return arrayList.get(position).fragment;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }




}
