package om.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView1 , textView2 ,textView3  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView) findViewById( R.id.tv1 );
        textView2 = (TextView) findViewById( R.id.tv2 );
        textView3 = (TextView) findViewById( R.id.tv3 );

        textView1.setText( NativeUitl.getStringFromC()  );

    }
}
