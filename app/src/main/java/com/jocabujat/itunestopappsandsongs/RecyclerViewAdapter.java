package com.jocabujat.itunestopappsandsongs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<FeedEntry> appList;

    public RecyclerViewAdapter(ArrayList<FeedEntry> appList) {
        this.appList = appList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_record, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.name.setText(this.appList.get(position).getName());
        holder.artist.setText(this.appList.get(position).getArtist());
        holder.summary.setText(this.appList.get(position).getSummary());
    }

    @Override
    public int getItemCount() {
        return this.appList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView artist;
        TextView summary;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvName);
            artist = itemView.findViewById(R.id.tvArtist);
            summary = itemView.findViewById(R.id.tvSummary);
        }
    }
}
