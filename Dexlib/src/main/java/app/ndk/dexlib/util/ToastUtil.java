package app.ndk.dexlib.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by ${zyj} on 2016/11/16.
 */

public class ToastUtil {

    public static void show(Context context ){
        Toast.makeText( context , " hello dex ", Toast.LENGTH_SHORT).show();
    }

}
