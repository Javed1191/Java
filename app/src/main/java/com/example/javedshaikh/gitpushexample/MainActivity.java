package com.example.javedshaikh.gitpushexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testPush()
    {
        int i;
        i = 1+2;

        System.out.print(i);
    }
}
