package com.androidlime.youtubevideotoandroidrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import static com.androidlime.youtubevideotoandroidrecyclerview.R.id.video_view;

/**
 * Created by Mithun on 10/4/2019.
 */

public class YoutubeViewHolder extends RecyclerView.ViewHolder {

    WebView webView;
    Button button;


    public YoutubeViewHolder(View itemView) {
        super(itemView);


        webView=itemView.findViewById(R.id.video_view);
        button=itemView.findViewById(R.id.fullscreen);

        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);



    }
}
