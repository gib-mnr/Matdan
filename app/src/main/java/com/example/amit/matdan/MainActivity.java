package com.example.amit.matdan;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.hide();

        Thread t = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(2500);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Intent in =new Intent("com.example.amit.matdan.ENTRYLEVEL");
                startActivity(in);
            }
        };
        t.start();

    }
}
