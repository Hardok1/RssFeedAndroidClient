package com.example.hardok.rssfeedandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PolsatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polsat);
    }


    public void kliknietoWszystkie(View view) {
        Intent polsat = new Intent(this,RssViewActivity.class);
        polsat.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/polsat_wszystkie");
        startActivity(polsat);
    }

    public void kliknietoSwiat(View view) {
        Intent polsat = new Intent(this,RssViewActivity.class);
        polsat.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/polsat_swiat");
        startActivity(polsat);
    }

    public void kliknietoTechnologieIMedycyna(View view) {
        Intent polsat = new Intent(this,RssViewActivity.class);
        polsat.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/polsat_technologie_i_medycyna");
        startActivity(polsat);
    }

    public void kliknietoSport(View view) {
        Intent polsat = new Intent(this,RssViewActivity.class);
        polsat.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/polsat_sport");
        startActivity(polsat);
    }

    public void kliknietoRozrywka(View view) {
        Intent polsat = new Intent(this,RssViewActivity.class);
        polsat.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/polsat_rozrywka");
        startActivity(polsat);
    }

    public void kliknietoBiznes(View view) {
        Intent polsat = new Intent(this,RssViewActivity.class);
        polsat.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/polsat_biznes");
        startActivity(polsat);
    }

    public void kliknietoKraj(View view) {
        Intent polsat = new Intent(this,RssViewActivity.class);
        polsat.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/polsat_kraj");
        startActivity(polsat);
    }
}
