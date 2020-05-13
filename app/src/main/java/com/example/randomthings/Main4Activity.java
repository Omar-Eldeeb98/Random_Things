package com.example.randomthings;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Main4Activity extends AppCompatActivity {


    private ListView lv;
    MyAdapter  adapter;
    int [] images;
    String [] names;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        names = new String[] {"DELL" , "FOTNITE" , "ELECTRICS" , "GEOMETRY" , "HBOGO" , "HP" ,
                "JAMESBOND" , "LANCHBOX" , "SAFARI" , "PIEDPIPER" , "LAUNCHPAD" , "AVENGERS"};

        images = new int[] { R.drawable.dellv1,R.drawable.fortnite,R.drawable.generalelectrics,R.drawable.geometrydash,
                R.drawable.hbogo ,R.drawable.hp,R.drawable.james,R.drawable.launchbox,
                R.drawable.safariv1,R.drawable.piedpiper,R.drawable.launchpadv1,R.drawable.avengers
        };


        lv  =findViewById(R.id.myList);
        adapter = new MyAdapter(Main4Activity.this , images, names);
        lv.setAdapter(adapter);


    }
}
