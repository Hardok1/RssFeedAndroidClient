package com.example.hardok.rssfeedandroidclient;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class RssViewActivity extends AppCompatActivity {



    // URL to get contacts JSON

    ArrayList<HashMap<String, String>> contactList;

    String url;
    EditText text;
    private String TAG = RssViewActivity.class.getSimpleName();
    ListView lv;
    ArrayList<HashMap<String, String>> feedList;
    private ArrayAdapter<String> adapter;
    //private ArrayList<String> arrayList;
    //int clickCounter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rss_view);
        lv = (ListView) findViewById(R.id.listView);
        feedList = new ArrayList<>();
        new GetFeed().execute();
        Bundle bundle = getIntent().getExtras();
        url = (String) bundle.get("url");
        //lv.setAdapter(adapter);
    }

    public void addItem(View view){
        Toast.makeText(this, "This functionality isn't finished yet", Toast.LENGTH_SHORT).show();
        /*String tekst = text.getText().toString();
        if (!tekst.isEmpty()) {
            arrayList.add(text.getText().toString());
            Toast.makeText(this, "Wpisano: " + text.getText().toString(), Toast.LENGTH_SHORT).show();
            adapter.notifyDataSetChanged();
        }*/
    }

    private class GetFeed extends AsyncTask<Void, Void, Void>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(RssViewActivity.this, "JSON DATA IS DOWNLOADING", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            HttpHandler sh = new HttpHandler();
            String jsonStr = sh.makeServiceCall(url);
            Log.e(TAG, "Response from url: " + jsonStr);
            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);

                    // Getting JSON Array node
                    JSONArray feeds = jsonObj.getJSONArray("feeds");

                    // looping through All Contacts
                    for (int i = 0; i < feeds.length(); i++) {
                        JSONObject c = feeds.getJSONObject(i);
                        String title = c.getString("title");
                        String description = c.getString("description");
                        String publicationDate = c.getString("publicationDate");
                        String category = c.getString("category");
                        String link = c.getString("link");


                        // tmp hash map for single feed
                        HashMap<String, String> feed = new HashMap<>();

                        // adding each child node to HashMap key => value
                        feed.put("title", title);
                        feed.put("description", description);
                        feed.put("publicationDate",publicationDate );
                        feed.put("category", category);
                        feed.put("link",link);

                        // adding feed to feed list
                        feedList.add(feed);
                    }
                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }
                    });

                }

            } else {
                Log.e(TAG, "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG).show();
                    }
                });
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result){
            super.onPostExecute(result);
            ListAdapter adapter = new SimpleAdapter(RssViewActivity.this, feedList, R.layout.list_rss,new String[]{"title","publicationDate","category","description","link"},new int[]{R.id.title,R.id.publicationDate,R.id.category,R.id.description,R.id.link});
            lv.setAdapter(adapter);
        }


    }

}
