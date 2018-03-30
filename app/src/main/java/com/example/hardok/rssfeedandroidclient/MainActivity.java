package com.example.hardok.rssfeedandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void keyPressed(View view){
        Intent rssViewIntent = new Intent(MainActivity.this, RssViewActivity.class);
        startActivity(rssViewIntent);
    }

    public void kliknietoInteria(View view){
        Intent interia = new Intent(this,InteriaActivity.class);
        startActivity(interia);
    }

    public void kliknietoTVN24(View view){
        Intent tvn24 = new Intent(this,TVN24Activity.class);
        startActivity(tvn24);
    }

    public void kliknietoPolsatNews(View view){
        Intent polsatNews = new Intent(this,PolsatActivity.class);
        startActivity(polsatNews);
    }

    public void kliknietoRMF(View view){
        Intent rmf = new Intent(this,RMFActivity.class);
        startActivity(rmf);
    }
}
