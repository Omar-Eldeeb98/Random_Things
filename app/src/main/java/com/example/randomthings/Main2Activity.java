package com.example.randomthings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {


    int [] images;
    String [] names;
    private ListView lv;
    private MyAdapter  adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

     names = new String[] {"ATOM" , "BATMAN" , "CYBORG" , "DEATH_STROKE" , "GREEN_ARROW" , "HARLEY_QUINN" ,
                "IRON_MAN" , "JOKER" , "LOGAN" , "THANOS" , "FLASH" , "VENOM"};

     images = new int[] { R.drawable.atom,R.drawable.batman,R.drawable.cyborg,R.drawable.deathstroke,
                R.drawable.green ,R.drawable.harley,R.drawable.ironman,R.drawable.joker,
                R.drawable.logan,R.drawable.thanos,R.drawable.flash,R.drawable.venom
        };


        lv  = (ListView) findViewById(R.id.myList);
        adapter = new MyAdapter(getApplicationContext() , images, names);
        lv.setAdapter(adapter);

    }
}



