package com.example.myanimelist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String animeName = "name";
    public static final String animeDetail = "detail";
    public static final String animeImage = "image";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvDataReceived = findViewById(R.id.tv_data_received);
        ImageView imgDataReceived = findViewById(R.id.img_data_received);

        String image = getIntent().getStringExtra(animeImage);
        String name = getIntent().getStringExtra(animeName);
        String age = getIntent().getStringExtra(animeDetail);
        String text = "Name : " + name + ",\nDetail : \n" + age;
        imgDataReceived.setImageDrawable(getResources().getDrawable(R.drawable.fullmetal));
        tvDataReceived.setText(text);
    }
}
