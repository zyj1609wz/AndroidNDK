package com.ndk.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static com.ndk.app.BaseJNI.getStringSize;
import static com.ndk.app.BaseJNI.stringFromJNI;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText( stringFromJNI() );

        TextView tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText( "字符串长度：" + getStringSize( "zhaoyanjun") );
    }
}
