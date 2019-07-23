package com.example.gemyni.viewpagertablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CustomPagerAdapter extends FragmentStatePagerAdapter {
    public CustomPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "Tab 1";
            case 1: return "Tab 2";
            case 2: return "Tab 3";
        };
        return null;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0: return new fragment1();
            case 1: return new fragment2();
            case 2: return new fragment3();
        };
        return null;    }

    @Override
    public int getCount() {
        return 3;
    }
}
