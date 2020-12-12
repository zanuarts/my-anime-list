package com.example.myanimelist;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListAnimeAdapter extends RecyclerView.Adapter<ListAnimeAdapter.ListViewHolder> {

    private ArrayList<Anime> listAnime;

    public ListAnimeAdapter(ArrayList<Anime> list){
        this.listAnime = list;
    }

    @NonNull
    @Override
    public ListAnimeAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_anime, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAnimeAdapter.ListViewHolder holder, int position) {
        Anime anime = listAnime.get(position);
        Glide.with(holder.itemView.getContext())
                .load(anime.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(anime.getName());
        holder.tvDetail.setText(anime.getDetail());
    }

    @Override
    public int getItemCount() {
        return listAnime.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }

        @Override
        public void onClick(View v) {
            val detailIntent = Intent(this@MainActivity, DetailActivity::class.java);
            detailIntent.putExtra(DetailActivity.list);
            startActivity(detailIntent);
        }
    }
}