package com.example.minhl.androidfragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    protected void changePicture() {
        BottemFragment bottemFragment = (BottemFragment) getFragmentManager().findFragmentById(R.id.bot_fragment);
        bottemFragment.changePicture();
    }
}
