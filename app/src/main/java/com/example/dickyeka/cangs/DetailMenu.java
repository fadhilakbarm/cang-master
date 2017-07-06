package com.example.dickyeka.cangs;

/**
 * Created by FADHIL on 7/5/2017.
 */

public class DetailMenu {
    private String title, desc, price;
    private int imageId;

    public DetailMenu(String title, String desc, String price, int imageId) {
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}