package om.app1;

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

}
