package com.example.modulo6;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.spinner)
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        RocketModel rocketModel = new RocketModel("falcon1","02/18/2018",true,"satellite");
        RocketModel rocketModel2 = new RocketModel("falcon9","03/10/2017",false,"Supplies");
        RocketModel rocketModel3 = new RocketModel("dragon","10/09/2016",true,"satellite");

        ArrayList<RocketModel> rocketModels = new ArrayList<>();

        rocketModels.add(rocketModel);
        rocketModels.add(rocketModel2);
        rocketModels.add(rocketModel3);

        RecyclerAdapter adapter = new RecyclerAdapter(rocketModels);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        spinnerImpl();
    }

    private void spinnerImpl() {

        String[] stringList = {"Item 1", "Item 2", "Item 3", "Item 4"};

        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, stringList);

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String selectedItem = adapterView.getItemAtPosition(i).toString();

                Toast.makeText(MainActivity.this, "You selected: " + selectedItem, Toast.LENGTH_SHORT).show();


            }


            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}