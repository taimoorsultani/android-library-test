package taimoor.sultani.customlog;

import android.util.Log;

public class CustomLogs {
    public static String TAG = "MyCustomLogs";

    public static void d(String message) {
        Log.d(TAG, message);
    }

    public static void e(String message) {
        Log.e(TAG, message);
    }
}
