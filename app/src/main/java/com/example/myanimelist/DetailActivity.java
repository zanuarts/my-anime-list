package com.example.myanimelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    public static final String animeName = "anime_name";
    public static final String animeDetail = "anime_detail";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvDataReceived = findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(animeName);
        int age = getIntent().getIntExtra(animeDetail, 0);
        String text = "Name : " + name + ",\nYour Age : " + age;
        tvDataReceived.setText(text);
    }
}
