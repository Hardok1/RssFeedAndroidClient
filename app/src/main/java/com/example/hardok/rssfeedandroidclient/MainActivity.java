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

    public void wybranoInteria(View view){
        Intent interia = new Intent(this,InteriaActivity.class);
        startActivity(interia);
    }

    public void wybranoTVN24(View view){
        Intent tvn24 = new Intent(this,TVN24Activity.class);
        startActivity(tvn24);
    }

    public void wybranoPolsatNews(View view){
        Intent polsatNews = new Intent(this,PolsatActivity.class);
        startActivity(polsatNews);
    }

    public void wybranoRMF(View view){
        Intent rmf = new Intent(this,RMFActivity.class);
        startActivity(rmf);
    }
}
