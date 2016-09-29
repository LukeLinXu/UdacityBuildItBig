package com.example.llin.jokeandroidlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by llin on 2016-09-27.
 */

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String JOKE_DATA = "joke_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        TextView textView = (TextView) findViewById(R.id.activity_joke_display_text);
        textView.setText(getIntent().getStringExtra(JOKE_DATA));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home) finish();
        return super.onOptionsItemSelected(item);
    }
}
