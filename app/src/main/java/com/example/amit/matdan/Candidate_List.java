package com.example.amit.matdan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Amit Kumar on 6/22/2017.
 */
public class Candidate_List extends AppCompatActivity{


//    Spinner ward;
    WebView wb;
    TextView t;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidate_view);

//        ward = (Spinner) findViewById(R.id.spin2);

        wb  = (WebView) findViewById(R.id.cand_web);

        t = (TextView) findViewById(R.id.selecttext);




        wb.getSettings().setBuiltInZoomControls(true);
        wb.loadUrl("file:///android_asset/chairperson.html");


    }

}
