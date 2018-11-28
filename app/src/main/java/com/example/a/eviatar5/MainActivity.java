package com.example.a.eviatar5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn;
    Button btn2;
    TextView txtv;

    Random rand=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btn = (Button) findViewById(R.id.btn);
        btn2=(Button) findViewById(R.id.btn2);
        txtv = (TextView) findViewById(R.id.txtv);
    }

    public void creat(View view) {
        int x=rand.nextInt(100);
        txtv.setText("number "+x);

    }

    public void cancel(View view) {
        txtv.setText("number not found");
    }
}
