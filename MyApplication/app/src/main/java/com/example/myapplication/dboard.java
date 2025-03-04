package com.example.myapplication;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
public class dboard extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tab;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        findviews();
        ftoolbar();
    }
    private int[] iconList ={R.drawable.a,R.drawable.b,R.drawable.c};
    private void setupWithViewPager(){
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new homeFragment(),"Home");
        adapter.addFragment(new ProfileFrahment(),"Profile");
        adapter.addFragment(new SettingFragment(),"Settings");
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
    }
    private void findviews(){
        tab= findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);
        setupWithViewPager();
        tab.getTabAt(0).setIcon(iconList[0]);
        tab.getTabAt(1).setIcon(iconList[1]);
        tab.getTabAt(2).setIcon(iconList[2]);
    }
    private void ftoolbar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Dashboard");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}