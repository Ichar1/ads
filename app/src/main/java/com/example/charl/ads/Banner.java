package com.example.charl.ads;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Banner extends AppCompatActivity {
    private AdView mAdViewTop,mAdViewBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MobileAds.initialize(this,
                "ca-app-pub-3940256099942544~3347511713");

        mAdViewTop = findViewById(R.id.adView1);
        mAdViewBottom = findViewById(R.id.adView);

        mAdViewTop.loadAd(new AdRequest.Builder().build());
        mAdViewBottom.loadAd(new AdRequest.Builder().build());

    }

}
