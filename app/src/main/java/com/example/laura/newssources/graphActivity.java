package com.example.laura.newssources;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class graphActivity extends AppCompatActivity {

    Button nyt;
    Button fox;
    Button cnn;
    Button economist;
    Button wsj;
    Button msnbc;
    Button bbc;
    Button atlantic;
    Button abc;
    Button guardian;
    Button buzzfeed;

    String userinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        final Intent intent2 = getIntent();
        Bundle smallbundle = intent2.getExtras();
        userinput = smallbundle.getString("keyword");

        nyt = findViewById(R.id.buttonnyt);
        nyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://mobile.nytimes.com/search?query=" + userinput.replace(" ", "+");
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        fox = findViewById(R.id.buttonfox);
        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/search?q="+userinput.replace(" ","+")+"&as_sitesearch=www.foxnews.com";
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        cnn = findViewById(R.id.buttoncnn);
        cnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.cnn.com/search/?q=" + userinput.replace(" ", "+");
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        economist = findViewById(R.id.buttoneconomist);
        economist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://www.economist.com/search?q=" + userinput.replace(" ", "%20");
                System.out.println(url);
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        wsj = findViewById(R.id.buttonwsj);
        wsj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.wsj.com/search/term.html?KEYWORDS=" + userinput.replace(" ", "%20");
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        msnbc = findViewById(R.id.buttonmsnbc);
        msnbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://www.msnbc.com/search/"+ userinput.replace(" ", "%20");
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        bbc = findViewById(R.id.buttonbbc);
        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.bbc.co.uk/search?q="+userinput.replace(" ", "+")+"&sa_f=search-product&scope=";
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        atlantic = findViewById(R.id.buttonatlantic);
        atlantic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url ="https://www.theatlantic.com/search/?q="+userinput.replace(" ","+");
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        abc = findViewById(R.id.buttonabc);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://abcnews.go.com/beta/mobilesearch?q="+userinput.replace(" ", "%20");
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        guardian = findViewById(R.id.buttonguardian);
        guardian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.co.uk/search?q="+userinput.replace(" ", "+")+"&as_sitesearch=www.theguardian.com";
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

        buzzfeed = findViewById(R.id.buttonbuzzfeed);
        buzzfeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.google.com/search?q="+userinput.replace(" ","+")+"&as_sitesearch=www.buzzfeed.com";
                Intent intent = new Intent(graphActivity.this, webActivity.class);
                intent.putExtra("url", url);
                startActivity(intent);

            }
        });

    }

}
