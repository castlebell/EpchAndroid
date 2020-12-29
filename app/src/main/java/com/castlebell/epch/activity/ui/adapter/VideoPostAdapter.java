package com.castlebell.epch.activity.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.castlebell.epch.R;
import com.castlebell.epch.vo.data.YoutubeDataModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by mdmunirhossain on 12/18/17.
 */

public class VideoPostAdapter extends RecyclerView.Adapter<VideoPostAdapter.YoutubePostHolder> {

    private ArrayList<YoutubeDataModel> dataSet;
    private Context mContext = null;


    public VideoPostAdapter(Context mContext, ArrayList<YoutubeDataModel> dataSet) {
        this.dataSet = dataSet;
        this.mContext = mContext;

    }

    @Override
    public YoutubePostHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_youtube,parent,false);
        YoutubePostHolder postHolder = new YoutubePostHolder(view);
        return postHolder;
    }

    @Override
    public void onBindViewHolder(YoutubePostHolder holder, int position) {

        YoutubeDataModel object = dataSet.get(position);
        holder.youtube_title.setText(object.getTitle());
        holder.youtube_content.setText(object.getDescription());
        //TODO: image will be downloaded from url
        Picasso.with(mContext).load(object.getThumbnail()).into(holder.youtube_image);

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class YoutubePostHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.youtube_image)
        ImageView youtube_image;
        @BindView(R.id.youtube_title)
        TextView youtube_title;
        @BindView(R.id.youtube_content)
        TextView youtube_content;

        public YoutubePostHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
        @OnClick(R.id.youtube_click)
        public void listClick(View itemView) {
            Log.i("test","test");
        }

    }
}
