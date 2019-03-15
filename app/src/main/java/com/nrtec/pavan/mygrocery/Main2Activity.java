package com.nrtec.pavan.mygrocery;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button b1;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        editor = pref.edit();

    }

    public void cofeee(View view) {


        /*Intent i=new Intent(getApplicationContext(),MainActivity.class);
        i.putExtra("coffee","Coffee powder");
        startActivity(i);
*/

        editor.putString("coffee", "Coffee powder");
        editor.commit();
        finish();
    }

    public void teapowder(View view) {
//        Intent i = new Intent(getApplicationContext(), MainActivity.class);
//        i.putExtra("tea", "Tea powder");
//        startActivity(i);
        editor.putString("tea", "Tea powder");
        editor.commit();
        finish();

    }

    public void sugar(View view) {
//        Intent i = new Intent(getApplicationContext(), MainActivity.class);
//        i.putExtra("sugar", " White sugar");
//        startActivity(i);
        editor.putString("sugar", " White sugar");
        editor.commit();
        finish();

    }

    public void boost(View view) {
       /* Intent i = new Intent(getApplicationContext(), MainActivity.class);
        i.putExtra("boost", "Boost");
        startActivity(i);*/
        editor.putString("boost", "Boost");
        editor.commit();
        finish();
    }

    public void gbisc(View view) {
        /*Intent i = new Intent(getApplicationContext(), MainActivity.class);
        i.putExtra("goodday", "Goodday biscuits");
        startActivity(i);
        */
        editor.putString("goodday", "Goodday biscuits");
        editor.commit();
        finish();
    }

    public void wrava(View view) {
        /*Intent i = new Intent(getApplicationContext(), MainActivity.class);
        i.putExtra("wheatrava", "Wheat rava");
        startActivity(i);
        */
        editor.putString("wheatrava", "Wheat rava");
        editor.commit();
        finish();
    }

    public void hgram(View view) {
        /*Intent i = new Intent(getApplicationContext(), MainActivity.class);
        i.putExtra("hgram", "Horsegram");

        startActivity(i);
        */
        editor.putString("hgram", "Horsegram");
        editor.commit();
        finish();

    }

    public void cheese(View view) {
        /*Intent i = new Intent(getApplicationContext(), MainActivity.class);

        i.putExtra("cheese", "Cheese");
        startActivity(i);
        */
        editor.putString("cheese", "Cheese");
        editor.commit();
        finish();
    }

    public void greengram(View view) {
        /*Intent i = new Intent(getApplicationContext(), MainActivity.class);

        i.putExtra("greengram", "Green gram");
        startActivity(i);
        */
        editor.putString("greengram", "Green gram");
        editor.commit();
        finish();
    }

    public void wflour(View view) {
        /*Intent i = new Intent(getApplicationContext(), MainActivity.class);

        i.putExtra("wheat", "Wheat flour");
        startActivity(i);*/
        editor.putString("wheat", "Wheat flour");
        editor.commit();
        finish();
    }
}
