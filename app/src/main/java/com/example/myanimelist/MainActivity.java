package com.example.myanimelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvAnime;
    private ArrayList<Anime> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnime = findViewById(R.id.rv_anime);
        rvAnime.setHasFixedSize(true);

        list.addAll(AnimeData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvAnime.setLayoutManager(new LinearLayoutManager(this));
        ListAnimeAdapter listHeroAdapter = new ListAnimeAdapter(list);
        rvAnime.setAdapter(listHeroAdapter);
    }
}
