package com.ndk.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static com.ndk.app.BaseJNI.getStringSize;
import static com.ndk.app.BaseJNI.stringFromJNI;
import static com.ndk.app.BaseJNI.stringTostring;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //从jni里面获取字符串
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText( stringFromJNI() );

        //获取字符串长度
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        tv2.setText( "字符串长度：" + getStringSize( "zhaoyanjun") );

        //字符串拼接
        TextView tv3 = (TextView) findViewById(R.id.tv3);
        tv3.setText( stringTostring( "zhao" , "yanjun") );
    }
}
