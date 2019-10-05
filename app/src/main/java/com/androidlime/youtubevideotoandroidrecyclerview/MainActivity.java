package com.androidlime.youtubevideotoandroidrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    ArrayList<DataSetList>arrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        arrayList=new ArrayList<DataSetList>();


        DataSetList dataSetList=new DataSetList("https://www.youtube.com/watch?v=n2GVjtMD2is&list=PLhOvCfpaqrhtpo_FHGOXka1Pv6ORg-x8T");
        arrayList.add(dataSetList);
        DataSetList dataSetList1=new DataSetList("https://www.youtube.com/watch?v=oknMkttzfu8&list=PLhOvCfpaqrhtpo_FHGOXka1Pv6ORg-x8T&index=2");
        arrayList.add(dataSetList1);
        DataSetList dataSetList2=new DataSetList("https://www.youtube.com/watch?v=7j_zcpat8CA&list=PLhOvCfpaqrhtpo_FHGOXka1Pv6ORg-x8T&index=3");
        arrayList.add(dataSetList2);
        DataSetList dataSetList3=new DataSetList("https://www.youtube.com/watch?v=R3cHEEC2QNU&list=PLhOvCfpaqrhtpo_FHGOXka1Pv6ORg-x8T&index=4");
        arrayList.add(dataSetList3);
        DataSetList dataSetList4=new DataSetList("https://www.youtube.com/watch?v=yOAoH-Dzb3Y&list=PLhOvCfpaqrhtpo_FHGOXka1Pv6ORg-x8T&index=5");
        arrayList.add(dataSetList4);
        DataSetList dataSetList5=new DataSetList("https://www.youtube.com/watch?v=2wlQ0Mj9QFM&list=PLhOvCfpaqrhtpo_FHGOXka1Pv6ORg-x8T&index=6");
        arrayList.add(dataSetList5);
        DataSetList dataSetList6=new DataSetList("https://www.youtube.com/watch?v=lu8vF3TngF8&list=PLhOvCfpaqrhtpo_FHGOXka1Pv6ORg-x8T&index=7");
        arrayList.add(dataSetList6);
        DataSetList dataSetList7=new DataSetList("https://www.youtube.com/watch?v=lu8vF3TngF8&list=PLhOvCfpaqrhtpo_FHGOXka1Pv6ORg-x8T&index=7");
        arrayList.add(dataSetList7);


        YoutubeAdapter youtubeAdapter=new YoutubeAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(youtubeAdapter);


    }
}
