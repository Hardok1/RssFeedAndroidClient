package com.example.hardok.rssfeedandroidclient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InteriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interia);
    }

    public void kliknietoFakty(View view){
        Intent interia = new Intent(this,RssViewActivity.class);
        interia.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/interia_fakty");
        startActivity(interia);
    }

    public void kliknietoSwiat(View view){
        Intent interia = new Intent(this,RssViewActivity.class);
        interia.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/interia_swiat");
        startActivity(interia);
    }

    public void kliknietoPolska(View view){
        Intent interia = new Intent(this,RssViewActivity.class);
        interia.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/interia_polska");
        startActivity(interia);
    }

    public void kliknietoNauka(View view){
        Intent interia = new Intent(this,RssViewActivity.class);
        interia.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/interia_nauka");
        startActivity(interia);
    }

    public void kliknietoEurosport(View view){
        Intent interia = new Intent(this,RssViewActivity.class);
        interia.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/interia_eurosport");
        startActivity(interia);
    }

    public void kliknietoEkstraklasa(View view){
        Intent interia = new Intent(this,RssViewActivity.class);
        interia.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/interia_ekstraklasa");
        startActivity(interia);
    }

    public void kliknietoNoweTechnologie(View view){
        Intent interia = new Intent(this,RssViewActivity.class);
        interia.putExtra("url","https://rssfeedserver.herokuapp.com/rss/bySite/interia_nowe_technologie");
        startActivity(interia);
    }


}
