package com.example.amit.matdan;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Amit Kumar on 6/25/2017.
 */
public class About_Us extends AppCompatActivity {
    TextView t;
    Button bf, bg;


    WebView member_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);

        member_web = (WebView) findViewById(R.id.cand_web);
        t = (TextView) findViewById(R.id.selecttext);

        bf = (Button) findViewById(R.id.facebook);
        bg = (Button) findViewById(R.id.gmail);



        t.setText("About Developers and App");

        member_web.getSettings();
        member_web.loadUrl("file:///android_asset/about_me.html");

       /* public void gotoSo (View view)
    {
        gotoUrl
    }*/

        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW);
            in.setData(Uri.parse("https://m.facebook.com/GIB-198458987300142/"));
            startActivity(in);
            }
        });


        bg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW);
                in.setData(Uri.parse("https://www.gmail.com"));
                startActivity(in);
            }
        });

    }
}