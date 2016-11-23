package om.app1;

/**
 * Created by ${zyj} on 2016/11/23.
 */

public class NativeUitl {

    static {
        System.loadLibrary( "main");
    }

    public static native String getStringFromC() ;

}
