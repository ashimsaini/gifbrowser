package com.giphy.gifbrowser.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OriginalStill {

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


    public class Pagination {

        @SerializedName("total_count")
        @Expose
        private Integer totalCount;
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("offset")
        @Expose
        private Integer offset;

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public Integer getOffset() {
            return offset;
        }

        public void setOffset(Integer offset) {
            this.offset = offset;
        }

    }


    public class Preview {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;

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

    }

    public class PreviewGif {

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

    }


    public class PreviewWebp {

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

    }


    public class User {

        @SerializedName("avatar_url")
        @Expose
        private String avatarUrl;
        @SerializedName("banner_image")
        @Expose
        private String bannerImage;
        @SerializedName("banner_url")
        @Expose
        private String bannerUrl;
        @SerializedName("profile_url")
        @Expose
        private String profileUrl;
        @SerializedName("username")
        @Expose
        private String username;
        @SerializedName("display_name")
        @Expose
        private String displayName;
        @SerializedName("description")
        @Expose
        private String description;
        @SerializedName("instagram_url")
        @Expose
        private String instagramUrl;
        @SerializedName("website_url")
        @Expose
        private String websiteUrl;
        @SerializedName("is_verified")
        @Expose
        private Boolean isVerified;

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public String getBannerImage() {
            return bannerImage;
        }

        public void setBannerImage(String bannerImage) {
            this.bannerImage = bannerImage;
        }

        public String getBannerUrl() {
            return bannerUrl;
        }

        public void setBannerUrl(String bannerUrl) {
            this.bannerUrl = bannerUrl;
        }

        public String getProfileUrl() {
            return profileUrl;
        }

        public void setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getInstagramUrl() {
            return instagramUrl;
        }

        public void setInstagramUrl(String instagramUrl) {
            this.instagramUrl = instagramUrl;
        }

        public String getWebsiteUrl() {
            return websiteUrl;
        }

        public void setWebsiteUrl(String websiteUrl) {
            this.websiteUrl = websiteUrl;
        }

        public Boolean getIsVerified() {
            return isVerified;
        }

        public void setIsVerified(Boolean isVerified) {
            this.isVerified = isVerified;
        }

    }


    public class _480wStill {

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

    }

    public class _4k {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;

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

    }

    public class Analytics {

        @SerializedName("onload")
        @Expose
        private Onload onload;
        @SerializedName("onclick")
        @Expose
        private Onclick onclick;
        @SerializedName("onsent")
        @Expose
        private Onsent onsent;

        public Onload getOnload() {
            return onload;
        }

        public void setOnload(Onload onload) {
            this.onload = onload;
        }

        public Onclick getOnclick() {
            return onclick;
        }

        public void setOnclick(Onclick onclick) {
            this.onclick = onclick;
        }

        public Onsent getOnsent() {
            return onsent;
        }

        public void setOnsent(Onsent onsent) {
            this.onsent = onsent;
        }

    }

    public class FixedHeightSmall {

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

    public class FixedHeightSmallStill {

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

    }


    public class FixedHeightStill {

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

    }


    public class FixedWidth {

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


    public class FixedWidthDownsampled {

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

    public class FixedWidthSmall {

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


    public class FixedWidthSmallStill {

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

    }

    public class FixedWidthStill {

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

    }

    public class Hd {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;

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

    }

    public class Images {

        @SerializedName("original")
        @Expose
        private Original original;
        @SerializedName("downsized")
        @Expose
        private Downsized downsized;
        @SerializedName("downsized_large")
        @Expose
        private DownsizedLarge downsizedLarge;
        @SerializedName("downsized_medium")
        @Expose
        private DownsizedMedium downsizedMedium;
        @SerializedName("downsized_small")
        @Expose
        private DownsizedSmall downsizedSmall;
        @SerializedName("downsized_still")
        @Expose
        private DownsizedStill downsizedStill;
        @SerializedName("fixed_height")
        @Expose
        private FixedHeight fixedHeight;
        @SerializedName("fixed_height_downsampled")
        @Expose
        private FixedHeightDownsampled fixedHeightDownsampled;
        @SerializedName("fixed_height_small")
        @Expose
        private FixedHeightSmall fixedHeightSmall;
        @SerializedName("fixed_height_small_still")
        @Expose
        private FixedHeightSmallStill fixedHeightSmallStill;
        @SerializedName("fixed_height_still")
        @Expose
        private FixedHeightStill fixedHeightStill;
        @SerializedName("fixed_width")
        @Expose
        private FixedWidth fixedWidth;
        @SerializedName("fixed_width_downsampled")
        @Expose
        private FixedWidthDownsampled fixedWidthDownsampled;
        @SerializedName("fixed_width_small")
        @Expose
        private FixedWidthSmall fixedWidthSmall;
        @SerializedName("fixed_width_small_still")
        @Expose
        private FixedWidthSmallStill fixedWidthSmallStill;
        @SerializedName("fixed_width_still")
        @Expose
        private FixedWidthStill fixedWidthStill;
        @SerializedName("looping")
        @Expose
        private Looping looping;
        @SerializedName("original_still")
        @Expose
        private OriginalStill originalStill;
        @SerializedName("original_mp4")
        @Expose
        private OriginalMp4 originalMp4;
        @SerializedName("preview")
        @Expose
        private Preview preview;
        @SerializedName("preview_gif")
        @Expose
        private PreviewGif previewGif;
        @SerializedName("preview_webp")
        @Expose
        private PreviewWebp previewWebp;
        @SerializedName("hd")
        @Expose
        private Hd hd;
        @SerializedName("480w_still")
        @Expose
        private _480wStill _480wStill;
        @SerializedName("4k")
        @Expose
        private _4k _4k;

        public Original getOriginal() {
            return original;
        }

        public void setOriginal(Original original) {
            this.original = original;
        }

        public Downsized getDownsized() {
            return downsized;
        }

        public void setDownsized(Downsized downsized) {
            this.downsized = downsized;
        }

        public DownsizedLarge getDownsizedLarge() {
            return downsizedLarge;
        }

        public void setDownsizedLarge(DownsizedLarge downsizedLarge) {
            this.downsizedLarge = downsizedLarge;
        }

        public DownsizedMedium getDownsizedMedium() {
            return downsizedMedium;
        }

        public void setDownsizedMedium(DownsizedMedium downsizedMedium) {
            this.downsizedMedium = downsizedMedium;
        }

        public DownsizedSmall getDownsizedSmall() {
            return downsizedSmall;
        }

        public void setDownsizedSmall(DownsizedSmall downsizedSmall) {
            this.downsizedSmall = downsizedSmall;
        }

        public DownsizedStill getDownsizedStill() {
            return downsizedStill;
        }

        public void setDownsizedStill(DownsizedStill downsizedStill) {
            this.downsizedStill = downsizedStill;
        }

        public FixedHeight getFixedHeight() {
            return fixedHeight;
        }

        public void setFixedHeight(FixedHeight fixedHeight) {
            this.fixedHeight = fixedHeight;
        }

        public FixedHeightDownsampled getFixedHeightDownsampled() {
            return fixedHeightDownsampled;
        }

        public void setFixedHeightDownsampled(FixedHeightDownsampled fixedHeightDownsampled) {
            this.fixedHeightDownsampled = fixedHeightDownsampled;
        }

        public FixedHeightSmall getFixedHeightSmall() {
            return fixedHeightSmall;
        }

        public void setFixedHeightSmall(FixedHeightSmall fixedHeightSmall) {
            this.fixedHeightSmall = fixedHeightSmall;
        }

        public FixedHeightSmallStill getFixedHeightSmallStill() {
            return fixedHeightSmallStill;
        }

        public void setFixedHeightSmallStill(FixedHeightSmallStill fixedHeightSmallStill) {
            this.fixedHeightSmallStill = fixedHeightSmallStill;
        }

        public FixedHeightStill getFixedHeightStill() {
            return fixedHeightStill;
        }

        public void setFixedHeightStill(FixedHeightStill fixedHeightStill) {
            this.fixedHeightStill = fixedHeightStill;
        }

        public FixedWidth getFixedWidth() {
            return fixedWidth;
        }

        public void setFixedWidth(FixedWidth fixedWidth) {
            this.fixedWidth = fixedWidth;
        }

        public FixedWidthDownsampled getFixedWidthDownsampled() {
            return fixedWidthDownsampled;
        }

        public void setFixedWidthDownsampled(FixedWidthDownsampled fixedWidthDownsampled) {
            this.fixedWidthDownsampled = fixedWidthDownsampled;
        }

        public FixedWidthSmall getFixedWidthSmall() {
            return fixedWidthSmall;
        }

        public void setFixedWidthSmall(FixedWidthSmall fixedWidthSmall) {
            this.fixedWidthSmall = fixedWidthSmall;
        }

        public FixedWidthSmallStill getFixedWidthSmallStill() {
            return fixedWidthSmallStill;
        }

        public void setFixedWidthSmallStill(FixedWidthSmallStill fixedWidthSmallStill) {
            this.fixedWidthSmallStill = fixedWidthSmallStill;
        }

        public FixedWidthStill getFixedWidthStill() {
            return fixedWidthStill;
        }

        public void setFixedWidthStill(FixedWidthStill fixedWidthStill) {
            this.fixedWidthStill = fixedWidthStill;
        }

        public Looping getLooping() {
            return looping;
        }

        public void setLooping(Looping looping) {
            this.looping = looping;
        }

        public OriginalStill getOriginalStill() {
            return originalStill;
        }

        public void setOriginalStill(OriginalStill originalStill) {
            this.originalStill = originalStill;
        }

        public OriginalMp4 getOriginalMp4() {
            return originalMp4;
        }

        public void setOriginalMp4(OriginalMp4 originalMp4) {
            this.originalMp4 = originalMp4;
        }

        public Preview getPreview() {
            return preview;
        }

        public void setPreview(Preview preview) {
            this.preview = preview;
        }

        public PreviewGif getPreviewGif() {
            return previewGif;
        }

        public void setPreviewGif(PreviewGif previewGif) {
            this.previewGif = previewGif;
        }

        public PreviewWebp getPreviewWebp() {
            return previewWebp;
        }

        public void setPreviewWebp(PreviewWebp previewWebp) {
            this.previewWebp = previewWebp;
        }

        public Hd getHd() {
            return hd;
        }

        public void setHd(Hd hd) {
            this.hd = hd;
        }

        public _480wStill get480wStill() {
            return _480wStill;
        }

        public void set480wStill(_480wStill _480wStill) {
            this._480wStill = _480wStill;
        }

        public _4k get4k() {
            return _4k;
        }

        public void set4k(_4k _4k) {
            this._4k = _4k;
        }

    }

    public class Looping {

        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;

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

    }

    public class Meta {

        @SerializedName("status")
        @Expose
        private Integer status;
        @SerializedName("msg")
        @Expose
        private String msg;
        @SerializedName("response_id")
        @Expose
        private String responseId;

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getResponseId() {
            return responseId;
        }

        public void setResponseId(String responseId) {
            this.responseId = responseId;
        }

    }

    public class Onclick {

        @SerializedName("url")
        @Expose
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }


    public class Onload {

        @SerializedName("url")
        @Expose
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }


    public class Onsent {

        @SerializedName("url")
        @Expose
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }


    public class Original {

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
        @SerializedName("frames")
        @Expose
        private String frames;
        @SerializedName("hash")
        @Expose
        private String hash;

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

        public String getFrames() {
            return frames;
        }

        public void setFrames(String frames) {
            this.frames = frames;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

    }

    public class OriginalMp4 {

        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("width")
        @Expose
        private String width;
        @SerializedName("mp4_size")
        @Expose
        private String mp4Size;
        @SerializedName("mp4")
        @Expose
        private String mp4;

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

    }
}