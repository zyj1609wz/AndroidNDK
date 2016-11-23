package om.app1;

import android.util.Log;

/**
 * Created by ${zyj} on 2016/11/23.
 */

public class NativeUitl {

    public String name = "zeno" ;

    static {
        System.loadLibrary( "main");
    }

    public native String getStringFromJava() ;

    public native String setStringFromJava() ;

    public native String getMethodFromJava() ;

    public String run(){
        Log.d( "mmmm" , "run 无参数" ) ;
        return "1.0.0" ;
    }
}
