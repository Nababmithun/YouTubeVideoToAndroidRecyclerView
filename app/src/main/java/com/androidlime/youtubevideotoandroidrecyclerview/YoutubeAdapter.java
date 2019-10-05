package com.androidlime.youtubevideotoandroidrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by Mithun on 10/4/2019.
 */

public class YoutubeAdapter extends RecyclerView.Adapter<YoutubeViewHolder> {


    ArrayList<DataSetList> arrayList;

    Context context;


    public YoutubeAdapter(ArrayList<DataSetList> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public YoutubeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.video_per_row,parent,false);


        return new YoutubeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(YoutubeViewHolder holder, int position) {

        final DataSetList current=arrayList.get(position);

        holder.webView.loadUrl(current.getLink());

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent=new Intent(context,VideoFullScreen.class);
                intent.putExtra("link",current.getLink());
                context.startActivity(intent);



            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
