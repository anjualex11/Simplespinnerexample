package com.anjualex.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner myspinner = (Spinner) findViewById(R.id.spinner);
        ArrayList<String> myarraylist=new ArrayList<String>();
        myarraylist.add("JAVA FEATURES");
        myarraylist.add("*SIMPLE");
        myarraylist.add("*POWERFUL");
        myarraylist.add("*ROBUST");
        myarraylist.add("*MULTITHREADED");
        ArrayAdapter<String> myadapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myarraylist);
        myspinner.setAdapter(myadapter);

    }
}
