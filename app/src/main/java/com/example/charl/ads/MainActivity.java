package com.example.charl.ads;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleClick(View view){
        switch (view.getId()){
            case R.id.banner:
                Intent banner = new Intent(this,Banner.class);
                startActivity(banner);
                break;
            case R.id.interstitial:
                Intent interstitial = new Intent(this,Interstitial.class);
                startActivity(interstitial);
                break;
            case R.id.Reward_video:
                Intent reward = new Intent(this,RewardVideo.class);
                startActivity(reward);
                break;


        }

    }
}
