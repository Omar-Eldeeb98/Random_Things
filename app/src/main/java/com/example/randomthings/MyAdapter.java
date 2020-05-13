package com.example.randomthings;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyAdapter extends BaseAdapter {
    Context context;
    int[] imageArray;
    String[] nameArray;
    LayoutInflater inflater;

    public MyAdapter( Context context, int[] imageArray, String[] nameArray ) {
        this.context = context;
        this.imageArray = imageArray;
        this.nameArray = nameArray;
    }


    @Override
    public int getCount() {
        return nameArray.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // inflating layout
       inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.list_row,parent,false);

        // get the reference to the view object
        ImageView myImage = row.findViewById(R.id.heroImage);
        TextView myName  = row.findViewById(R.id.heroName);

        // providing the element of an array by specifying its position
        myImage.setImageResource(imageArray[position]);
        myName.setText(nameArray[position]);
        return row;
    }
}




