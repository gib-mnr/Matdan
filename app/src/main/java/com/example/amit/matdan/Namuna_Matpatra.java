package com.example.amit.matdan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by Amit Kumar on 6/25/2017.
 */
public class Namuna_Matpatra extends AppCompatActivity {
    TextView t;

    WebView member_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidate_view);

        member_web = (WebView) findViewById(R.id.cand_web);
        t = (TextView) findViewById(R.id.selecttext);


        t.setText(" भीमदत्त नगरपालिकाको  मतपत्र को नामुना");

        member_web.getSettings().setBuiltInZoomControls(true);
        member_web.loadUrl("file:///android_asset/namuna_matpatra.html");
    }
}
