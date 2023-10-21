package com.example.atividadeparcial;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class noticiasAtletica extends AppCompatActivity {

    private EditText newsEditText;
    private Button postNewsButton;
    private ListView newsListView;

    private List<String> newsList = new ArrayList<>();
    private ArrayAdapter<String> newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia_atletica);

        newsEditText = findViewById(R.id.newsEditText);
        postNewsButton = findViewById(R.id.postNewsButton);
        newsListView = findViewById(R.id.newsListView);

        newsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, newsList);
        newsListView.setAdapter(newsAdapter);

        postNewsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newsText = newsEditText.getText().toString();


                newsList.add(newsText);
                newsAdapter.notifyDataSetChanged();


                newsEditText.setText("");
            }
        });


    }
}
