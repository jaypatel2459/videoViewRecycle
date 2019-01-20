package com.videoDemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.alphamovie.lib.AlphaMovieView;
import com.videoDemo.R;

import java.util.ArrayList;

public class VideoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<String> data = new ArrayList<>();
    private Context context;

    public VideoAdapter(ArrayList<String> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v =  LayoutInflater.from(context).inflate(R.layout.row_video_item, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder holder = (ViewHolder) viewHolder;
        switch (holder.getAdapterPosition()){
            case 0:{
                holder.img_bg.setBackgroundColor(ContextCompat.getColor(context, R.color.color0));
                holder.video_player.setVideoFromAssets(data.get(holder.getAdapterPosition()));
            }break;
            case 1:{
                holder.img_bg.setBackgroundColor(ContextCompat.getColor(context, R.color.color1));
                holder.video_player.setVideoFromAssets(data.get(holder.getAdapterPosition()));
            }break;
            case 2:{
                holder.img_bg.setBackgroundColor(ContextCompat.getColor(context, R.color.color2));
                holder.video_player.setVideoFromAssets(data.get(holder.getAdapterPosition()));
            }break;
            case 3:{
                holder.img_bg.setBackgroundColor(ContextCompat.getColor(context, R.color.color3));
                holder.video_player.setVideoFromAssets(data.get(holder.getAdapterPosition()));
            }break;
            case 4:{
                holder.img_bg.setBackgroundColor(ContextCompat.getColor(context, R.color.color4));
                holder.video_player.setVideoFromAssets(data.get(holder.getAdapterPosition()));
            }break;
        }

        if(!holder.video_player.isPlaying()){
            holder.video_player.start();
        }

    }

    @Override
    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        ViewHolder holder = (ViewHolder) viewHolder;
        holder.video_player.stop();
        super.onViewRecycled(viewHolder);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    private class ViewHolder extends RecyclerView.ViewHolder {

        AlphaMovieView video_player;
        ImageView img_bg;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            video_player = itemView.findViewById(R.id.video_player);
            img_bg = itemView.findViewById(R.id.img_bg);
        }
    }
}
