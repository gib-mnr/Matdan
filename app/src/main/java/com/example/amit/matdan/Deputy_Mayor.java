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
public class Deputy_Mayor extends AppCompatActivity {

    ListView listView;
    TextView t;

    List<Mayors> lm = new ArrayList<Mayors>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mayor_list);

        listView = (ListView) findViewById(R.id.mayors_list);
        t = (TextView) findViewById(R.id.mayor_text);

        t.setText("भीमदत्त नगरपालिकाका उप मेयर  पदका उम्मेदवारको नामावली");



        lm.add(new Mayors("गोवर्धन श्रेष्ठ", "ने.क.पा. (माले)", R.drawable.neaka_maale));
        lm.add(new Mayors("दिपा सुनर", "राष्ट्रिय जनमुक्ति पार्टी", R.drawable.rastriya_janamukti_party));
        lm.add(new Mayors("माया पन्त","ने.क.पा. एमाले", R.drawable.aamalea));
        lm.add(new Mayors("सुनिताकुमारी डगौरा","म.ज.फो.ने.(लोकतान्त्रीक)", R.drawable.mahela_forum_nepal));
        lm.add(new Mayors("खंजरादेवी कुँवर","रा.प्र.पा", R.drawable.rastriya_prajatantra));
        lm.add(new Mayors("मन्जु दमाई","रा.जनमोर्चा", R.drawable.rastriya_janamorcha));
        lm.add(new Mayors("तुलसी देवी धामी","ने.क.पा. (सयुक्त)", R.drawable.nea_ka_pa_sanyukta));
        lm.add(new Mayors("नारुदेवी सिंह","ने.क.पा. (माओवादी केन्द्र)", R.drawable.kendra_maaobadi));
        lm.add(new Mayors("गोमती पुजारा","संघिय समाजवादी फोरम नेपाल", R.drawable.sangiya_samajbad_forum));
        lm.add(new Mayors("जयानन्द जोशी","स्वतन्त्र", R.drawable.sawtantra2));
        lm.add(new Mayors("सुशिला चन्द","नेपाली काँग्रेस", R.drawable.tree));

        lm.add(new Mayors("गोदावरी मडै(मल्ल)","ने.पू.रा.से.लो.पा.", R.drawable.nepal_purba_rastra_sewak));











        ArrayAdapter<Mayors> mayorad = new MyListAdapter();
        listView.setAdapter(mayorad);
    }

    public class MyListAdapter extends ArrayAdapter<Mayors> {
        public MyListAdapter() {super(Deputy_Mayor.this, R.layout.mayors_view, lm);}

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
