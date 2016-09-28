package com.example.llin.jokeandroidlib;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by llin on 2016-09-27.
 */

public class JokeDisplayActivity extends Activity {

    public static final String JOKE_DATA = "joke_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        TextView textView = (TextView) findViewById(R.id.activity_joke_display_text);
        textView.setText(getIntent().getStringExtra(JOKE_DATA));
    }
}
