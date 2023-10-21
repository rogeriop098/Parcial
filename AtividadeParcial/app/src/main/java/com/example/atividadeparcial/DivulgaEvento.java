package com.example.atividadeparcial;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    private ListView eventsListView;
    private List<Event> eventsList;
    private EventAdapter eventAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divulga_evento);

        eventsListView = findViewById(R.id.eventsListView);
        eventsList = new ArrayList<>();



        eventAdapter = new EventAdapter(this, eventsList);
        eventsListView.setAdapter(eventAdapter);


        eventsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Event selectedEvent = eventsList.get(position);

            }
        });
    }
}

