package com.ndk.app;

/**
 * Created by ${zyj} on 2016/11/18.
 */

public class BaseJNI {

    static {
        System.loadLibrary( "native-lib") ;
    }

    public static native String stringFromJNI();

    public static native String stringFromJNI2();

    public static native int getStringSize( String string) ;

}
