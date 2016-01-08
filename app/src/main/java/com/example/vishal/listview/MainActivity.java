package com.example.vishal.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    ListView list;
    String[] foods ={
            "Apple",
            "Banana",
            "Pear",
            "Mango",
            "Watermelon",
            "Cherry",
            "VLC Player",
            "Cold War"

    };

    Integer[] imgid={
            R.mipmap.apple,
            R.mipmap.banana,
            R.mipmap.apple,
            R.mipmap.banana,
            R.mipmap.apple,
            R.mipmap.apple,
            R.mipmap.banana,
            R.mipmap.apple,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customAdapter adapter= new customAdapter(this, foods, imgid);
        list=(ListView)findViewById(R.id.vishListView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= foods[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
    }
}




/**
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"Apple", "Banana", "Pear", "Mango", "Watermelon", "Cherry"};
        ListAdapter vishAdapter = new customAdapter(this, foods);
        ListView vishListView = (ListView) findViewById(R.id.vishListView);
        vishListView.setAdapter(vishAdapter);

        vishListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();

                    }
                }
        );


    }
}
*/