package com.example.myanimelist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    public static final String animeName = "name";
    public static final String animeDetail = "detail";
    public static final int animeImages = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView title = findViewById(R.id.title);
        TextView detail = findViewById(R.id.detail);
        ImageView imgDataReceived = findViewById(R.id.img_data_received);

        imgDataReceived.setImageResource(getIntent().getIntExtra("animeImages", animeImages));
        title.setText(getIntent().getStringExtra(animeName));
        detail.setText(getIntent().getStringExtra(animeDetail));
    }
}
