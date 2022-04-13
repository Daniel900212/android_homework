package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private ImageView viewr;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button);
        viewr = (ImageView) findViewById(R.id.imageView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==5){i=0;}
                else{i++;}
                if(i==0){
                    viewr.setImageResource(R.drawable.book1);
                }else if(i==1){
                    viewr.setImageResource(R.drawable.book2);
                }else if(i==2){
                    viewr.setImageResource(R.drawable.book3);
                }else if(i==3){
                    viewr.setImageResource(R.drawable.book4);
                }else if(i==4){
                    viewr.setImageResource(R.drawable.book5);
                }else {
                    viewr.setImageResource(R.drawable.book6);
                }

            }
        });

        viewr.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View arg0) {

                if(i==0){
                    Toast.makeText(getApplicationContext(), "C# 2010 速學對策 " ,Toast.LENGTH_SHORT).show();
                }else if(i==1){
                    Toast.makeText(getApplicationContext(), "Basic 2010 速學對策 " ,Toast.LENGTH_SHORT).show();
                }else if(i==2){
                    Toast.makeText(getApplicationContext(), "ASP.NET 速學對策 " ,Toast.LENGTH_SHORT).show();
                }else if(i==3){
                    Toast.makeText(getApplicationContext(), "Visual Basic 2008 " ,Toast.LENGTH_SHORT).show();
                }else if(i==4){
                    Toast.makeText(getApplicationContext(), "C# 2008 " ,Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "C++ 2008 " ,Toast.LENGTH_SHORT).show();
                }
                return true;    // set to true
            }
        });
    }
}