package com.ndk.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static com.ndk.app.BaseJNI.stringFromJNI;
import static com.ndk.app.BaseJNI.stringFromJNI2;
import static com.ndk.app.BaseJNI.stringFromJNI3;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
        tv.setText( stringFromJNI2());
        tv.setText(stringFromJNI3());
    }
}
