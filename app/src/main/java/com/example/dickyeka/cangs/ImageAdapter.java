package com.example.dickyeka.cangs;

/**
 * Created by FADHIL on 7/4/2017.
 */

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(230, 230));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0, 0, 0, 0);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.image_2, R.drawable.image_3,
            R.drawable.image_4, R.drawable.image_5,
            R.drawable.image_6, R.drawable.image_7,
            R.drawable.image_8, R.drawable.image_9,
            R.drawable.image_1, R.drawable.image_2,
            R.drawable.image_4, R.drawable.image_5,
            R.drawable.image_6, R.drawable.image_7,
            R.drawable.image_8, R.drawable.image_9,
            R.drawable.image_1, R.drawable.image_8,
            R.drawable.image_2, R.drawable.image_3,
            R.drawable.image_4, R.drawable.image_9,
            R.drawable.image_9, R.drawable.image_5,
            R.drawable.image_6, R.drawable.image_7,
            R.drawable.image_1, R.drawable.image_3,
    };
}
