package com.example.timestables;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class MainActivity extends AppCompatActivity {

    ListView timesTablesListView;

    public void generateTimesTable(int timesTableNumber) {
        ArrayList<String> timesTableContent = new ArrayList<String>();

        for (int j = 1; j <= 100; j++) {
            timesTableContent.add(Integer.toString(j * timesTableNumber));
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,timesTableContent);

        timesTablesListView.setAdapter(arrayAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SeekBar timesTablesSeekBar = findViewById(R.id.timesTablesSeekBar);
        timesTablesListView = findViewById(R.id.timesTablesListView);

        int max = 20;
        int startingPosition = 10;

        timesTablesSeekBar.setMax(max);
        timesTablesSeekBar.setProgress(startingPosition);

        generateTimesTable(startingPosition);

        timesTablesSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                int min = 1;
                int timesTableNumber;

                if (i < min) {
                    timesTableNumber = min;
                    timesTablesSeekBar.setProgress(min);
                } else {
                    timesTableNumber = i;
                }

                Log.i("Seekbar Value", Integer.toString(timesTableNumber));

                generateTimesTable(timesTableNumber);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}

//public class MainActivity extends AppCompatActivity {

    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
    //    super.onCreate(savedInstanceState);
    //  setContentView(R.layout.activity_main);

    //  ListView tableslistView =(ListView)findViewById(R.id.tablesListView);
    //  SeekBar numberSeekBar = (SeekBar)findViewById(R.id.numberSeekBar);



    //  ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    //  ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(2,4,6,8,10,12,14,16,18,20));
    //  ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(3,6,9,12,15,18,21,24,27,30));
    //  ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(4,8,12,16,20,24,28,32,36,40));
    //  ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(5,10,15,20,25,30,35,40,45,50));
    //  ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(6,12,18,24,30,36,42,48,54,60));
    //  ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(7,14,21,28,35,42,49,56,63,70));
    //  ArrayList<Integer> list8 = new ArrayList<Integer>(Arrays.asList(8,16,24,32,40,48,56,64,72,80));
    // ArrayList<Integer> list9 = new ArrayList<Integer>(Arrays.asList(9,18,27,36,45,54,63,72,81,90));
//     ArrayList<Integer> list10 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
    // ArrayList<Integer> list11 = new ArrayList<Integer>(Arrays.asList(11,22,33,44,55,66,77,88,99,110));
    //  ArrayList<Integer> list12 = new ArrayList<Integer>(Arrays.asList(12,24,36,48,60,72,84,96,108,120));
    //  ArrayList<Integer> list13 = new ArrayList<Integer>(Arrays.asList(13,26,39,52,65,78,91,104,117,130));
    //  ArrayList<Integer> list14 = new ArrayList<Integer>(Arrays.asList(14,28,42,56,70,84,98,112,126,140));
    //  ArrayList<Integer> list15 = new ArrayList<Integer>(Arrays.asList(15,30,45,60,75,90,105,120,135,150));
    //ArrayList<Integer> list16 = new ArrayList<Integer>(Arrays.asList(16,32,48,64,80,96,112,128,144,160));
    //   ArrayList<Integer> list17 = new ArrayList<Integer>(Arrays.asList(17,34,51,68,85,102,119,136,153,170));
    //ArrayList<Integer> list18 = new ArrayList<Integer>(Arrays.asList(18,36,54,72,90,108,126,144,162,180));
    //ArrayList<Integer> list19 = new ArrayList<Integer>(Arrays.asList(19,38,57,76,95,114,133,152,171,190));
    //ArrayList<Integer> list20 = new ArrayList<Integer>(Arrays.asList(20,40,60,80,100,120,140,160,180,200));

//
//ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>(Arrays.asList(list1,list2,list3,list4,list5,list6,list7,list8,list9,list10,list11,list12,list13,list14,list15,list16,list17,list18,list19,list20));


//numberSeekBar.setMax(19);
//      numberSeekBar.setProgress(0);
//      //numberSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//  @Override
//          public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//              ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<Integer>(getApplicationContext(), android.R.layout.simple_list_item_1,listOfLists.get(progress));
//              tableslistView.setAdapter(arrayAdapter);
    //          }

    //      @Override
//      public void onStartTrackingTouch(SeekBar seekBar) {

    //          }

    //      @Override
// public void onStopTrackingTouch(SeekBar seekBar) {

                //    }
//      });

//}
//}