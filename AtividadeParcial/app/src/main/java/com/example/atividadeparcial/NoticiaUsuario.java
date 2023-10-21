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

public class noticiausuarioActivity extends AppCompatActivity {

    private EditText userNewsEditText;
    private Button postUserNewsButton;
    private ListView userNewsListView;

    private List<String> userNewsList = new ArrayList<>();
    private ArrayAdapter<String> userNewsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticia_usuario);

        userNewsEditText = findViewById(R.id.userNewsEditText);
        postUserNewsButton = findViewById(R.id.postUserNewsButton);
        userNewsListView = findViewById(R.id.userNewsListView);

        userNewsAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, userNewsList);
        userNewsListView.setAdapter(userNewsAdapter);

        postUserNewsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userNewsText = userNewsEditText.getText().toString();


                userNewsList.add(userNewsText);
                userNewsAdapter.notifyDataSetChanged();


                userNewsEditText.setText("");
            }
        }{

        });


    }
}
