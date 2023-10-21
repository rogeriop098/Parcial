package com.example.atividadeparcial;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class KitsActivity extends AppCompatActivity {

    private ListView kitsListView;
    private List<Kit> kitsList;
    private KitAdapter kitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kits);

        kitsListView = findViewById(R.id.kitsListView);
        kitsList = new ArrayList<>();



        kitAdapter = new KitAdapter(this, kitsList);
        kitsListView.setAdapter(kitAdapter);


        kitsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Kit selectedKit = kitsList.get(position);

            }
        });
    }
}
