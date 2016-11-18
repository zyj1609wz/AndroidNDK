package app.dex;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import java.io.File;

import dalvik.system.DexClassLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final File optimizedDexOutputPath = new File(Environment.getExternalStorageDirectory().toString()
                + File.separator + "test.jar");

        DexClassLoader cl = new DexClassLoader(optimizedDexOutputPath.getAbsolutePath(),
                Environment.getExternalStorageDirectory().toString(), null, getClassLoader());
        Class libProviderClazz = null;

        try {

            libProviderClazz = cl.loadClass("com.dynamic.DynamicTest");

            // Cast the return object to the library interface so that the
            // caller can directly invoke methods in the interface.
            // Alternatively, the caller can invoke methods through reflection,
            // which is more verbose and slow.
            //LibraryInterface lib = (LibraryInterface) libProviderClazz.newInstance();

            // Display the toast!
            //lib.showAwesomeToast(view.getContext(), "hello 世界!");
         //   Toast.makeText(MainActivity.this, lib.helloWorld(), Toast.LENGTH_SHORT).show();
        } catch (Exception exception) {
            // Handle exception gracefully here.
            exception.printStackTrace();
        }

    }
}
