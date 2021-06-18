package taimoor.sultani.librarytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import taimoor.sultani.customlog.CustomLogs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomLogs.e("Is it working?");
        CustomLogs.d("Yes, its working");
        CustomLogs.e("Wo hoooo");
    }
}