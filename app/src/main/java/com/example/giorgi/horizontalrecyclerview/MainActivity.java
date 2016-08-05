package com.example.giorgi.horizontalrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;

import com.example.giorgi.horizontalrecyclerview.adapters.MultyLayoutAdapter;
import com.example.giorgi.horizontalrecyclerview.adapters.PersonAdapter;
import com.example.giorgi.horizontalrecyclerview.custom.Person;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Person> personsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViews();

    }

    private void setUpViews() {

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MultyLayoutRecyclingActivity.class));
            }
        });

        personsList = new ArrayList<>();
        for (int i = 0; i < 37; i++) {
            Person person = new Person();
            person.setName(Integer.toString(i));
            person.setLastName("urjulo");
            person.setImageId(R.drawable.info);

            personsList.add(person);
        }

        RecyclerView rvPersons = (RecyclerView)findViewById(R.id.rvPersons);
        RecyclerView rvPersonsVertical = (RecyclerView)findViewById(R.id.rvPersonsVertical);

        LinearLayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rvPersons.setLayoutManager(lm);

        LinearLayoutManager lmVert = new LinearLayoutManager(this);
        rvPersonsVertical.setLayoutManager(lmVert);

        PersonAdapter adapter = new PersonAdapter(personsList);
        rvPersons.setAdapter(adapter);
        rvPersonsVertical.setAdapter(adapter);
    }
}
