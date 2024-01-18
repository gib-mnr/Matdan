package com.example.amit.matdan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by Amit Kumar on 6/23/2017.
 */
public class How_to_vote extends AppCompatActivity {

    WebView webvote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_vote);

        webvote = (WebView) findViewById(R.id.web_vote);

        webvote.getSettings().setBuiltInZoomControls(true);

        webvote.loadUrl("file:///android_asset/how_to_vote.html");

    }
}
