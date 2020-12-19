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

        TextView tvDataReceived = findViewById(R.id.tv_data_received);
        ImageView imgDataReceived = findViewById(R.id.img_data_received);

        int img = getIntent().getIntExtra("photo", animeImages);
        String name = getIntent().getStringExtra(animeName);
        String detail= getIntent().getStringExtra(animeDetail);

        Log.d("photo", String.valueOf(img));
        String text = "Name : " + name + ",\nDetail : \n" + detail;

        imgDataReceived.setImageResource(img);
        tvDataReceived.setText(text);
    }
}
