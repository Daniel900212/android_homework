package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private ImageView imageView;
    private TextView textview;
    private int[] image  = {R.drawable.book1,R.drawable.book2,R.drawable.book3
                            ,R.drawable.book4,R.drawable.book5,R.drawable.book6};
    private String[] imagetxt ={"書號: AEL011300\n書名: Visual C# 2010",
                                "書號: AEL011301\n書名: Visual Basic 2010 程式設計宿學對策",
                                "書號: AEL011302\n書名: ASP.NET 4.0",
                                "書號: AEL011303\n書名: 挑戰 Visual Basic 2008",
                                "書號: AEL011304\n書名: 挑戰 Visual C# 2008",
                                "書號: AEL011305\n書名: 挑戰 Visual C++ 2008"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Map<String,Object>> items = new ArrayList<Map<String,Object>>();
        for(int i=0;i<image.length;i++){
            Map<String,Object> item = new HashMap<String,Object>();
            item.put("image",image[i]);
            items.add(item);
        }
        SimpleAdapter adapter = new SimpleAdapter(this,items,R.layout.gridview_item,new String[] {"image"},new int[]{R.id.image});
        gridView = (GridView)findViewById(R.id.gridview);
        gridView.setNumColumns(3);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                imageView = (ImageView) findViewById(R.id.imageView);
                imageView.setImageResource(image[position]);
                textview = (TextView) findViewById(R.id.textView2);
                textview.setText(imagetxt[position]);
            }
        });

    }

}
