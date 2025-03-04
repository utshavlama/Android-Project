package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    final List<Fragment> mfragementList = new ArrayList<>();
    final List<String> mFragmentTitleList = new ArrayList<>();
    public ViewPagerAdapter(@NonNull FragmentManager fm){
        super(fm);
    }
    public void addFragment(Fragment fragment, String title){
        mfragementList.add(fragment);
        mFragmentTitleList.add(title);
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mfragementList.get(position);
    }
    @Override
    public int getCount() {
        return mfragementList.size();
    }
}