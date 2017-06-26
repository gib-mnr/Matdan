package com.example.amit.matdan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by Amit Kumar on 6/25/2017.
 */
public class Women_members extends AppCompatActivity {
    TextView t;

    WebView member_web;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidate_view);

        member_web = (WebView) findViewById(R.id.cand_web);
        t = (TextView) findViewById(R.id.selecttext);


        t.setText(" भीमदत्त नगरपालिकाका महिला सदस्य्य पदका उम्मेदवारको नामावली");

        member_web.getSettings().setBuiltInZoomControls(true);
        member_web.loadUrl("file:///android_asset/women_member_list.html");
    }
}