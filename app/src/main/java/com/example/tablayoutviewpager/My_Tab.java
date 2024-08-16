package com.example.tablayoutviewpager;

import androidx.fragment.app.Fragment;

public class My_Tab {
    //bma 2no kel tab m3yane ela fragemnt bade 2a3ml class 5as feha 3ashen ykoun sho8le mratab bade sameh My_tab heda l class bkel basata bado ykoun fe sha8lten bado ykun fe l category 2aw momken ykoun l string esm l tab String tabName; w fragemnt  esm tab w l fragemnt le mortbta feha 3ashen ya3ref kel tab sho elha ya3ne iza keen 3ana 4 tabet 4 pages iza keen 3ana 10 tabet 10 pages
    //String tabName;
    Category category;
    Fragment fragment;

    //ba3den ba3mel constructor
    public My_Tab(Category category, Fragment fragment) {
        this.category = category;
        this.fragment = fragment;
    }


    //getter w setter

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }
}
