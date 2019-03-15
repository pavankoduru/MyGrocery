package com.nrtec.pavan.mygrocery;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TextView) findViewById(R.id.t1);
        /*t2= (TextView) findViewById(R.id.t2);
        t3= (TextView) findViewById(R.id.t3);
        t4= (TextView) findViewById(R.id.t4);
        t5= (TextView) findViewById(R.id.t5);
        t6= (TextView) findViewById(R.id.t6);
        t7= (TextView) findViewById(R.id.t7);
        t8= (TextView) findViewById(R.id.t8);
        t9= (TextView) findViewById(R.id.t9);
        t10= (TextView) findViewById(R.id.t10);
        add= (Button)findViewById(R.id.add);
        Bundle b=getIntent().getExtras();
        t1.setText(b.getString("wheat"));
        t2.setText(b.getString("greengram"));
        t3.setText(b.getString("cheese"));
        t4.setText(b.getString("hgram"));
        t5.setText(b.getString("wheatrava"));
        t6.setText(b.getString("goodday"));
        t7.setText(b.getString("boost"));
        t8.setText(b.getString("sugar"));
        t9.setText(b.getString("tea"));
        t10.setText(b.getString("coffee"));*/
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        SharedPreferences.Editor editor = pref.edit();
        String s1=pref.getString("wheat", null);
        s1+="\n"+pref.getString("greengram", null);
        s1+="\n"+pref.getString("cheese", null);
        s1+="\n"+pref.getString("hgram", null);
        s1+="\n"+pref.getString("wheatrava", null);
        s1+="\n"+pref.getString("goodday", null);
        s1+="\n"+pref.getString("boost", null);
        s1+="\n"+pref.getString("sugar", null);
        s1+="\n"+pref.getString("tea", null);
        s1+="\n"+pref.getString("coffee", null);


        t1.setText(s1);


    }

    public void add(View view) {
        Intent i=new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(i);


    }
}
