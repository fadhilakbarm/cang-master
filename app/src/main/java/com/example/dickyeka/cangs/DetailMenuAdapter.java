package com.example.dickyeka.cangs;

/**
 * Created by FADHIL on 7/5/2017.
 */

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

public class DetailMenuAdapter extends RecyclerView.Adapter<DetailMenuAdapter.MyViewHolder> {

    private List<DetailMenu> detailMenuList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView title, desc, price;
        public ImageView image;


        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            desc = (TextView) view.findViewById(R.id.desc);
            price = (TextView) view.findViewById(R.id.price);
            image = (ImageView) view.findViewById(R.id.imageView);
        }
    }


    public DetailMenuAdapter(List<DetailMenu> detailMenuList) {
        this.detailMenuList = detailMenuList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_menu_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DetailMenu detailMenu = detailMenuList.get(position);

        holder.title.setText(detailMenu.getTitle());
        holder.desc.setText(detailMenu.getDesc());
        holder.price.setText(detailMenu.getPrice());
        holder.image.setImageResource(detailMenu.getImageId());

    }

    @Override
    public int getItemCount() {
        return detailMenuList.size();
    }
}

