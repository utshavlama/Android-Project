package com.example.myapplication;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
public class dboard extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        findviews();
        inittoolbar();
    }
    private int[] iconList ={R.drawable.a,R.drawable.b,R.drawable.c};
    private void setupWithViewPager(){
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new homeFragment(),"Home");
        adapter.addFragment(new ProfileFragment(),"Profile");
        adapter.addFragment(new SettingFragment(),"Settings");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    private void findviews(){
        tabLayout= findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        setupWithViewPager();
        tabLayout.getTabAt(0).setIcon(iconList[0]);
        tabLayout.getTabAt(1).setIcon(iconList[1]);
        tabLayout.getTabAt(2).setIcon(iconList[2]);
    }
    private void inittoolbar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Dashboard");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}