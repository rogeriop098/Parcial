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

public class GerenciarMembros extends AppCompatActivity {

    private EditText nameEditText, emailEditText;
    private Button addMemberButton;
    private ListView membersListView;

    private List<String> membersList = new ArrayList<>();
    private ArrayAdapter<String> membersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerenciar_membros);

        nameEditText = findViewById(R.id.nameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        addMemberButton = findViewById(R.id.addMemberButton);
        membersListView = findViewById(R.id.membersListView);

        membersAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, membersList);
        membersListView.setAdapter(membersAdapter);

        addMemberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String memberName = nameEditText.getText().toString();
                String memberEmail = emailEditText.getText().toString();


                membersList.add(memberName);
                membersAdapter.notifyDataSetChanged();


                nameEditText.setText("");
                emailEditText.setText("");
            }
        });


    }
}
