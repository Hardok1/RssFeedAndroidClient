package com.example.hardok.rssfeedandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RMFActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rmf);
    }

    public void kliknietoFakty(View view){
        Intent rmf = new Intent(this,RssViewActivity.class);
        rmf.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/rmf_fakty");
        startActivity(rmf);
    }

    public void kliknietoSwiat(View view){
        Intent rmf = new Intent(this,RssViewActivity.class);
        rmf.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/rmf_swiat");
        startActivity(rmf);

    }

    public void kliknietoPolska(View view){
        Intent rmf = new Intent(this,RssViewActivity.class);
        rmf.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/rmf_polska");
        startActivity(rmf);

    }

    public void kliknietoNauka(View view){
        Intent rmf = new Intent(this,RssViewActivity.class);
        rmf.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/rmf_nauka");
        startActivity(rmf);
    }

    public void kliknietoSport(View view){
        Intent rmf = new Intent(this,RssViewActivity.class);
        rmf.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/rmf_sport");
        startActivity(rmf);
    }

    public void kliknietoKultura(View view){
        Intent rmf = new Intent(this,RssViewActivity.class);
        rmf.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/rmf_kultura");
        startActivity(rmf);
    }

    public void kliknietoEkonomia(View view){
        Intent rmf = new Intent(this,RssViewActivity.class);
        rmf.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/rmf_ekonomia");
        startActivity(rmf);
    }
}
