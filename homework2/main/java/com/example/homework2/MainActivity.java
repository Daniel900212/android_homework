package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn1.setOnClickListener(myListener);
        btn2.setOnClickListener(myListener);
        btn3.setOnClickListener(myListener);
        btn4.setOnClickListener(myListener);

    }

    private Button.OnClickListener myListener = new Button.OnClickListener() {
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn1: {

                    Toast toast = Toast.makeText(MainActivity.this, "1啦", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,-50,-50);
                    toast.show();
                    break;
                }
                case R.id.btn2: {
                    Toast toast = Toast.makeText(MainActivity.this, "2啦", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);

                    toast.show();
                    break;
                }
                case R.id.btn3: {
                    Toast toast = Toast.makeText(MainActivity.this, "3啦", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                    break;
                }
                case R.id.btn4: {
                    Toast toast = Toast.makeText(MainActivity.this, "4啦", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER,0,0);
                    toast.show();
                    break;
                }
            }
        };
    };
}