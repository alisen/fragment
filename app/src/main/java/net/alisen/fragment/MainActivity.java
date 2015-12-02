package net.alisen.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        FragmentTabHost tabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        tabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        tabHost.addTab(tabHost.newTabSpec("First").setIndicator("First"), FirstFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("Second").setIndicator("Second"), SecondFragment.class, null);
        tabHost.addTab(tabHost.newTabSpec("Third").setIndicator("Third"), ThirdFragment.class, null);
    }

    public String getFirstData(){
        return "First";
    }

    public String getSecondData(){
        return "Second";
    }

    public String getThirdData(){
        return "Third";
    }
}