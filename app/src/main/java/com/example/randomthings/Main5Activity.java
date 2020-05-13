package com.example.randomthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Main5Activity extends AppCompatActivity {

    private ListView lv;
    MyAdapter  adapter;
    int [] images;
    String [] names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);




        names = new String[] {"REALITY" , "BURN_CD" , "CLAPPER_BORD" , "COMMANDLINE" , "C#LOGO" , "FIREBASE" ,
                "GOOGLE_CODE" , "GOOGLE_PLAY" , "HEXA" , "LINE" , "TELEGRAM" , "TORRENT"};

        images = new int[] { R.drawable.augmentedreality,R.drawable.burncd,R.drawable.clapperboard,R.drawable.commandline,
                R.drawable.csharplogo ,R.drawable.firebase,R.drawable.googlecode,R.drawable.googleplay,
                R.drawable.hexa,R.drawable.lineme,R.drawable.telegramapp,R.drawable.torrent
        };

        lv  = findViewById(R.id.myList);
        adapter = new MyAdapter(Main5Activity.this , images, names);
        lv.setAdapter(adapter);

    }
}
