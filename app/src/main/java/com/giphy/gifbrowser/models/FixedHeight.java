package com.giphy.gifbrowser.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FixedHeight {

@SerializedName("height")
@Expose
private String height;
@SerializedName("width")
@Expose
private String width;
@SerializedName("size")
@Expose
private String size;
@SerializedName("url")
@Expose
private String url;
@SerializedName("mp4_size")
@Expose
private String mp4Size;
@SerializedName("mp4")
@Expose
private String mp4;
@SerializedName("webp_size")
@Expose
private String webpSize;
@SerializedName("webp")
@Expose
private String webp;

public String getHeight() {
return height;
}

public void setHeight(String height) {
this.height = height;
}

public String getWidth() {
return width;
}

public void setWidth(String width) {
this.width = width;
}

public String getSize() {
return size;
}

public void setSize(String size) {
this.size = size;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public String getMp4Size() {
return mp4Size;
}

public void setMp4Size(String mp4Size) {
this.mp4Size = mp4Size;
}

public String getMp4() {
return mp4;
}

public void setMp4(String mp4) {
this.mp4 = mp4;
}

public String getWebpSize() {
return webpSize;
}

public void setWebpSize(String webpSize) {
this.webpSize = webpSize;
}

public String getWebp() {
return webp;
}

public void setWebp(String webp) {
this.webp = webp;
}

}