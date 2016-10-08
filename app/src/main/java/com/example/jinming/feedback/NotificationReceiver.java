package com.example.jinming.feedback;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Jinming on 10/7/16.
 */
public class NotificationReceiver extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView tv = new TextView(this);
        tv.setText("Yo!");

        setContentView(tv);
    }
}
