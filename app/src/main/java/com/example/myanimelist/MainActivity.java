package com.example.myanimelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

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

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.about_page:
                Intent about = new Intent(this, AboutPage.class);
                this.startActivity(about);
        }
    }

    private void showRecyclerList(){
        rvAnime.setLayoutManager(new LinearLayoutManager(this));
        ListAnimeAdapter listHeroAdapter = new ListAnimeAdapter(list);
        rvAnime.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new ListAnimeAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Anime data) {
                showSelectedHero(data);
            }
        });
    }

    private void showSelectedHero(Anime anime) {
        Toast.makeText(this, "Kamu memilih " + anime.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("photo", anime.getPhoto());
        intent.putExtra("name", anime.getName());
        intent.putExtra("detail", anime.getDetail());
        this.startActivity(intent);
    }
}
