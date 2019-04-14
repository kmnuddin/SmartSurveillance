package com.example.smartsurveillance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.smartsurveillance.adapter.MenuAdapter;
import com.example.smartsurveillance.models.MenuItem;

import org.opencv.android.OpenCVLoader;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    private List<MenuItem> items;

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

        init_menu();

    }

    private void init_menu() {

        recyclerView = (RecyclerView) findViewById(R.id.recycler_menu);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items = new ArrayList<>();
        items.add(new MenuItem("Add Person", R.drawable.ic_action_add_person,
                new Intent(MainActivity.this, CameraActivity.class)));

        adapter = new MenuAdapter(items, this);
        recyclerView.setAdapter(adapter);
    }



}
