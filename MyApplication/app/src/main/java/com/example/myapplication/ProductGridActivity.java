package com.example.myapplication;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ProductGridActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private GridView gridview;
    private ProductGridAdapter adapter;
    private ArrayList<Product> productlist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_grid);
        ftoolbar();
        findview();
        adapter = new ProductGridAdapter(productlist ,ProductGridActivity.this);
        gridview.setAdapter(adapter);
    }
    private void findview(){
        gridview = findViewById(R.id.gridView);
        setproductdata();
    }
    private void ftoolbar(){
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Product list toolbar");
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    private void setproductdata(){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        p1.setName("Discord");
        p1.setDescription("this is discord");
        p1.setPrice(100);
        p1.setImage(R.drawable.gojo);
        p2.setName("Bluetooth");
        p2.setDescription("this is bluetooth");
        p2.setPrice(13400);
        p2.setImage(R.drawable.yuta);
        p3.setName("android");
        p3.setDescription("this is android");
        p3.setPrice(1200);
        p3.setImage(R.drawable.nobara);
        p4.setName("comment");
        p4.setDescription("this is comment");
        p4.setPrice(1400);
        p4.setImage(R.drawable.sukuna);
        productlist.add(p1);
        productlist.add(p2);
        productlist.add(p3);
        productlist.add(p4);

    }
}