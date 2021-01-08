package com.giphy.gifbrowser.models;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GIFModel {

    @SerializedName("data")
    @Expose
    private List<Datum> data =  new ArrayList<>();
    @SerializedName("pagination")
    @Expose
    private OriginalStill.Pagination pagination;
    @SerializedName("meta")
    @Expose
    private OriginalStill.Meta meta;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public OriginalStill.Pagination getPagination() {
        return pagination;
    }

    public void setPagination(OriginalStill.Pagination pagination) {
        this.pagination = pagination;
    }

    public OriginalStill.Meta getMeta() {
        return meta;
    }

    public void setMeta(OriginalStill.Meta meta) {
        this.meta = meta;
    }

}