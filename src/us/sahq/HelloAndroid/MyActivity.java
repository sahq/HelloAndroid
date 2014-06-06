package us.sahq.HelloAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.v("MyActivity", "This is a verbose log message");
        Log.d("MyActivity", "This is a debug log message");
        Log.i("MyActivity", "This is a information log message");
        Log.w("MyActivity", "This is a warning log message");
        Log.e("MyActivity", "This is a error log message");
    }
}
