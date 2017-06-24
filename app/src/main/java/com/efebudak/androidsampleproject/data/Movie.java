package com.efebudak.androidsampleproject.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by efebudak on 24/06/2017.
 */

public class Movie {

    @SerializedName("id")
    private long id;
    @SerializedName("title")
    private String title;

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}