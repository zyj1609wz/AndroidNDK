package om.app1;

import android.util.Log;

/**
 * Created by ${zyj} on 2016/11/23.
 */

public class MyTask {

    public String name = "zeno" ;

    public String getVersion(){
        Log.d( "mmmm" , "getSersion 无参数" ) ;
        return "1.0.0" ;
    }

    public void setVersion(){
        Log.d( "mmmm" , "setVersion 无参数" ) ;
    }

}
