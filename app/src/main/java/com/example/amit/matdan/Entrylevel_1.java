package com.example.amit.matdan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amit Kumar on 6/22/2017.
 */
public class Entrylevel_1 extends AppCompatActivity {

    ListView lv;
    WebView webView;
//    TextView t;
    Button b;


    List<Tasks> l = new ArrayList<Tasks>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrylevel_1);

        lv = (ListView) findViewById(R.id.mainlist);
        webView = (WebView) findViewById(R.id.web_marque);
//        t = (TextView) findViewById(R.id.txt);
        b = (Button) findViewById(R.id.btn);



        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.hide();


//        t.setText("https://m.facebook.com/GIB");
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent("com.example.amit.matdan.ABOUT_US");
                startActivity(in);
            }
        });

//-198458987300142/

        webView.getSettings();
        webView.loadUrl("file:///android_asset/message_marque");

        l.add(new Tasks("How To Vote?", R.drawable.vote));
        l.add(new Tasks("Who To Vote?", R.drawable.vot_kaslai));
        l.add(new Tasks("Namunaa Matpatra", R.drawable.namuna));
        l.add(new Tasks("Nirwachan Esthaan", R.drawable.matdan_kendra));

        ArrayAdapter<Tasks> ad = new MyListAdapter();
        lv.setAdapter(ad);

    }

    public class MyListAdapter extends ArrayAdapter<Tasks> {
        public MyListAdapter() {
            super(Entrylevel_1.this, R.layout.entrylevel_view, l);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View itemview = convertView;
            if (convertView == null) {
                itemview = getLayoutInflater().inflate(R.layout.entrylevel_view, parent, false);
            }
            Tasks currenttasks = l.get(position);

            ImageView imageview = (ImageView) itemview.findViewById(R.id.main_img);
            TextView titleview = (TextView) itemview.findViewById(R.id.main_text);

            imageview.setImageResource(currenttasks.getIcon());
            titleview.setText(currenttasks.getTitle());


            if(position==1)
            {

                imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                     public void onClick(View view) {

                        Intent in = new Intent("com.example.amit.matdan.CANDIDATE_POSTS");
                        startActivity(in);
                    }
                });
            }


            else if(position==0)
            {
                imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in = new Intent("com.example.amit.matdan.HOW_TO_VOTE");
                        startActivity(in);
                    }
                });

            }
            else if(position==2)
            {
                imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in = new Intent("com.example.amit.matdan.NAMUNA_MATPATRA");
                        startActivity(in);
                    }
                });
            }

            else if(position==3)
            {
                imageview.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent in = new Intent("com.example.amit.matdan.MADAN_PLACES");
                        startActivity(in);
                    }
                });
            }


            return  itemview;

        }
    }

}