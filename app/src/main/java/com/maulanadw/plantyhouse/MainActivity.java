package com.maulanadw.plantyhouse;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPlants;
    private ArrayList<Plant> list = new ArrayList<>();

    private ImageButton btnAboutMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlants = findViewById(R.id.rv_plants);
        rvPlants.setHasFixedSize(true);

        list.addAll(PlantsData.getListData());
        showRecyclerList();

        btnAboutMe = findViewById(R.id.btnAboutMe);

        btnAboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutMeActivity.class);
                startActivity(intent);
            }
        });
    }

    private void showRecyclerList() {
        rvPlants.setLayoutManager(new LinearLayoutManager(this));
        ListPlantAdapter listPlantAdapter = new ListPlantAdapter(list);
        rvPlants.setAdapter(listPlantAdapter);

        listPlantAdapter.setOnItemClickCallback(new ListPlantAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Plant data) {
                showSelectedPlant(data);
            }
        });
    }

    private void showSelectedPlant(Plant data) {
        Intent intent = new Intent(MainActivity.this, DetailPlantActivity.class);
        Toast.makeText(this, data.getPlantName(), Toast.LENGTH_SHORT).show();
        intent.putExtra("image_photo", data.getPlantPhoto());
        intent.putExtra("plant_name", data.getPlantName());
        intent.putExtra("plant_alias", data.getPlantAlias());
        intent.putExtra("plant_detail", data.getPlantDetail());
        startActivity(intent);
    }
}