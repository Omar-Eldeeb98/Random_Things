package com.example.randomthings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    private ListView lv;
    MyAdapter  adapter;
    int [] images;
    String [] names;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        names = new String[] {"YEMEN" , "USA" , "TURKEY" , "SYRIA" , "QATAR" , "SAUDI" ,
                "ISRAEL" , "CHINA" , "ALGERIA" , "IRAQ" , "SPAIN" , "BRAZIL"};

        images = new int[] { R.drawable.yemencircular,R.drawable.usa,R.drawable.turkey,R.drawable.syria,
                R.drawable.qatar ,R.drawable.saudi,R.drawable.israel,R.drawable.china,
                R.drawable.algeria,R.drawable.iraqcircular,R.drawable.spainr,R.drawable.brazil
        };


        lv  =findViewById(R.id.myList);
        adapter = new MyAdapter(Main3Activity.this , images, names);
        lv.setAdapter(adapter);

    }
}
