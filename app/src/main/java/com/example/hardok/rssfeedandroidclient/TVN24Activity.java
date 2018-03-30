package com.example.hardok.rssfeedandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TVN24Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tvn24);
    }

    public void kliknietoNajnowsze(View view) {
        Intent tvn24 = new Intent(this,RssViewActivity.class);
        tvn24.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/tvn24_najnowsze");
        startActivity(tvn24);
    }

    public void kliknietoNajwazniejsze(View view) {
        Intent tvn24 = new Intent(this,RssViewActivity.class);
        tvn24.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/tvn24_najwazniejsze");
        startActivity(tvn24);
    }

    public void kliknietoSwiat(View view) {
        Intent tvn24 = new Intent(this,RssViewActivity.class);
        tvn24.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/tvn24_swiat");
        startActivity(tvn24);
    }

    public void kliknietoSport(View view) {
        Intent tvn24 = new Intent(this,RssViewActivity.class);
        tvn24.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/tvn24_sport");
        startActivity(tvn24);
    }

    public void kliknietoTech(View view) {
        Intent tvn24 = new Intent(this,RssViewActivity.class);
        tvn24.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/tvn24_tech");
        startActivity(tvn24);
    }

    public void kliknietoBiznes(View view) {
        Intent tvn24 = new Intent(this,RssViewActivity.class);
        tvn24.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/tvn24_biznes");
        startActivity(tvn24);
    }

    public void kliknietoPolska(View view) {
        Intent tvn24 = new Intent(this,RssViewActivity.class);
        tvn24.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/tvn24_polska");
        startActivity(tvn24);
    }
}
