package com.example.vishal.listview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"Apple", "Banana", "Pear", "Mango", "Watermelon", "Cherry"};
        ListAdapter vishAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);
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
