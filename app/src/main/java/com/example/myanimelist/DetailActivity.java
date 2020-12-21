package com.example.myanimelist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    public static final String animeName = "animeNames";
    public static final String animeDetail = "animeDetails";
    public static final String animeScore = "animeScore";
    public static final String animeEps = "animeEps";
    public static final String animeProds = "animeProds";
    public static final String animeGenre = "animeGenre";
    public static final int animeImages = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView title = findViewById(R.id.title);
        TextView detail = findViewById(R.id.detail);
        TextView score = findViewById(R.id.anime_score);
        TextView eps = findViewById(R.id.anime_eps);
        TextView prods = findViewById(R.id.anime_prod);
        TextView genre = findViewById(R.id.anime_genre);
        ImageView imgDataReceived = findViewById(R.id.img_data_received);

        imgDataReceived.setImageResource(getIntent().getIntExtra("animeImages", animeImages));
        title.setText(getIntent().getStringExtra(animeName));
        detail.setText(getIntent().getStringExtra(animeDetail));
        score.setText(getIntent().getStringExtra(animeScore));
        eps.setText(getIntent().getStringExtra(animeEps));
        prods.setText(getIntent().getStringExtra(animeProds));
        genre.setText(getIntent().getStringExtra(animeGenre));
    }
}
