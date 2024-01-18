package com.example.amit.matdan;

/**
 * Created by Amit Kumar on 6/18/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class Candidate_Posts extends AppCompatActivity {
    ListView l;


    List<String> ls = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.candidate_posts);


        l = (ListView) findViewById(R.id.cand_list);


        ls.add("Mayor [ मेयर ]");
        ls.add("Deputy Mayor [उप मेयर ]");
        ls.add("Ward Chairperson [अध्यक्ष ] ");
        ls.add("Member [सदस्य]");
        ls.add("Woman Member [महिला सदस्य ]");
        ls.add("Dalit Woman Member  " +
                " [दलित महिला सदस्य ]");

        ArrayAdapter<String> cand_ad = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ls);
        l.setAdapter(cand_ad);




        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {

                    Intent in = new Intent("com.example.amit.matdan.MAYORS_LIST");
                    startActivity(in);

                }
                 else if (i == 1) {
                    Intent in = new Intent("com.example.amit.matdan.DEPUTY_MAYOR");
                    startActivity(in);

                } else if (i == 2) {
                    Intent in = new Intent("com.example.amit.matdan.CANDIDATE_LIST");
                    startActivity(in);

                }
                else if (i == 3) {

                    Intent in = new Intent("com.example.amit.matdan.MEMBERS");
                    startActivity(in);
                }

                else if (i == 4) {

                    Intent in = new Intent("com.example.amit.matdan.WOMEN_MEMBERS");
                    startActivity(in);
                }

                else if (i == 5) {

                    Intent in = new Intent("com.example.amit.matdan.DALIT_WOMEN_MEMBERS");
                    startActivity(in);
                }


            }
        });
    }
}
