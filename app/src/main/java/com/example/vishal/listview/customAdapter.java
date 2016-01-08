package com.example.vishal.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Vishal on 08-Jan-16.
 */
class customAdapter extends ArrayAdapter<String> {

    private final String[] foods;
    private final Integer[] imgid;


    public customAdapter(Context context, String[] foods, Integer[] imgid) {
        super(context, R.layout.custom_row ,foods);

        this.foods=foods;
        this.imgid=imgid;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater= LayoutInflater.from(getContext());
        View rowView=inflater.inflate(R.layout.custom_row, null,true);

        TextView vishText = (TextView) rowView.findViewById(R.id.vishText);
        ImageView vishImage = (ImageView) rowView.findViewById(R.id.vishImage);

        vishText.setText(foods[position]);
        vishImage.setImageResource(imgid[position]);
        return rowView;

    }
}



   /** @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater vishInflater =  LayoutInflater.from(getContext());
        View customView = convertView;
        if(customView == null){
            customView = vishInflater.inflate(R.layout.custom_row, parent, false);

        }

        String singleFoodItem = getItem(position);
        TextView vishText = (TextView)customView.findViewById(R.id.vishText);
        ImageView vishImage = (ImageView) customView.findViewById(R.id.vishImage);

        vishText.setText(singleFoodItem);
        vishImage.setImageResource(R.mipmap.apple);
        return customView; */
