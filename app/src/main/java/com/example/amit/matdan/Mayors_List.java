package com.example.amit.matdan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amit Kumar on 6/23/2017.
 */
public class Mayors_List extends AppCompatActivity {
    
    ListView listView;

    List<Mayors> lm = new ArrayList<Mayors>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mayor_list);

        listView = (ListView) findViewById(R.id.mayors_list);


        lm.add(new Mayors("भानुभक्त पार्की","राष्ट्रिय जनमुक्ति पार्टी", R.drawable.rastriya_janamukti_party));
        lm.add(new Mayors("धौली देवी मल्ल (सिंह)","ने.क.पा. (माले)", R.drawable.neaka_maale));
        lm.add(new Mayors("माया देवी नेगी","नयाँ शक्ति पार्टी", R.drawable.naya_shakti));
        lm.add(new Mayors("सुरेन्द्र ब. बिष्ट","ने.क.पा. एमाले", R.drawable.aamalea));
        lm.add(new Mayors("गजेन्द्र बहादुर चन्द","रा.प्र.पा", R.drawable.rastriya_prajatantra));
        lm.add(new Mayors("मन्जु दमाई","रा.जनमोर्चा", R.drawable.rastriya_janamorcha));
        lm.add(new Mayors("गोपाल रसायली","ने.क.पा. (माओवादी केन्द्र)", R.drawable.kendra_maaobadi));
        lm.add(new Mayors("मन्सा डगौरा","म.ज.फो.ने.(लोकतान्त्रीक)", R.drawable.mahela_forum_nepal));
        lm.add(new Mayors("गुलाफ आउजी","ने.क.पा. (सयुक्त)", R.drawable.nea_ka_pa_sanyukta));

        lm.add(new Mayors("तेज सिंह थापा","ने.पू.रा.से.लो.पा.", R.drawable.nepal_purba_rastra_sewak));

        lm.add(new Mayors("कृष्णानन्द भट्ट","स्वतन्त्र", R.drawable.sawtontra1));

        lm.add(new Mayors("तिलक दत्त भट्ट","स्वतन्त्र", R.drawable.swatantra));

        lm.add(new Mayors("पदम बोगटी","नेपाली काँग्रेस", R.drawable.tree));




        ArrayAdapter<Mayors> mayorad = new MyListAdapter();
        listView.setAdapter(mayorad);
    }

    public class MyListAdapter extends ArrayAdapter<Mayors> {
        public MyListAdapter() {super(Mayors_List.this, R.layout.mayors_view, lm);}

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View mayorview = convertView;
            if (convertView == null) {
                mayorview = getLayoutInflater().inflate(R.layout.mayors_view, parent, false);
            }
            Mayors currentmayor = lm.get(position);


            TextView nameview = (TextView) mayorview.findViewById(R.id.mayor_name);
            TextView partyview = (TextView) mayorview.findViewById(R.id.mayor_party);
            ImageView imageView = (ImageView) mayorview.findViewById(R.id.mayor_sign);


            nameview.setText(currentmayor.getName());
            partyview.setText(currentmayor.getPartyname());
            imageView.setImageResource(currentmayor.getIcon());


//            imageview.setImageResource(currenttasks.getIcon());
//            titleview.setText(currenttasks.getTitle());

            return  mayorview;

        }
    }
}
