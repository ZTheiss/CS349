package com.example.zacth.cs349hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreateL started.");

        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://static1.squarespace.com/static/589e834eff7c50486de031c3/58a11959893fc0b6d3de1d4c/5a2f3aadf9619a8167050b84/1522008064529/Bali-Feature-Image.jpg?format=1500w");
        mNames.add("Bali");

        mImageUrls.add("https://www.jacadatravel.com/wp-content/uploads/2016/06/belize_blue_hole-1200x675.jpg");
        mNames.add("Belize");

        mImageUrls.add("https://cdn.travelpulse.com/images/99999999-9999-9999-9999-999999999999/1732FABF-0821-3021-7A2D-3D596F20F2DE/630x355.jpeg");
        mNames.add("Cancun");

        mImageUrls.add("https://media-cdn.tripadvisor.com/media/photo-s/06/bd/a4/4b/turtle-having-lunch.jpg");
        mNames.add("Cozumel");

        mImageUrls.add("https://travelhealthpro.org.uk/media_lib/mlib-uploads/full/Egypt.jpg");
        mNames.add("Egypt");

        mImageUrls.add("https://secure.parksandresorts.wdpromedia.com/resize/mwImage/1/1200/600/90/secure.parksandresorts.wdpromedia.com/media/abd/refresh/europe/greece-vacations/adventures-by-disney-europe-greece-hero-01-domes-of-santorini.jpg");
        mNames.add("Greece");

        mImageUrls.add("https://www.telegraph.co.uk/content/dam/Travel/Cruise/worlds-most-beautiful-ports/hongkong-harbour-xlarge.jpg");
        mNames.add("Hong Kong");

        mImageUrls.add("https://japan-magazine.jnto.go.jp/jnto2wm/wp-content/uploads/1608_special_TOTO_main.jpg");
        mNames.add("Japan");

        mImageUrls.add("https://3c1703fe8d.site.internapcdn.net/newman/gfx/news/2018/wildlifehave.jpg");
        mNames.add("Sulawesi");

        initRecycerView();
    }

    private void initRecycerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mNames, mImageUrls, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
