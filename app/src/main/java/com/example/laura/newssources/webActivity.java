package com.example.laura.newssources;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webActivity extends AppCompatActivity {

    WebView wv;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv = findViewById(R.id.newswv);


        Intent intent2 = getIntent();
        Bundle smallbundle = intent2.getExtras();
        url = smallbundle.getString("url");
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url);
//        wv.getSettings().setJavaScriptEnabled(true);

    }



}
