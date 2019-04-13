package com.example.smartsurveillance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {
    private static final String Tag = "MainActivity";
    static {
        if(OpenCVLoader.initDebug())
        {
            Log.d(Tag, "static initializer: Successful");
        }
        else
        {

            Log.d(Tag, "static initializer: Not Successful");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
