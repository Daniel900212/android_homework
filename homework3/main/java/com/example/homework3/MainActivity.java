package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView lvShow;
    private String[] fruit_name=new String[]{"蘋果","香蕉","水蜜桃","蓮霧","芭樂"};
    private int[] value = new int[]{54,65,321,38,98};
    private TextView TextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvShow = (ListView)findViewById(R.id.lvShow);
        TextView = findViewById(R.id.textview);
        setAdapter();

        lvShow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               TextView.setText(fruit_name[position]+" 每斤: "+value[position]+" 元");
            }
        });
    }

    private void setAdapter() {
        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,fruit_name);
        lvShow.setAdapter(adapter);
    }

}

