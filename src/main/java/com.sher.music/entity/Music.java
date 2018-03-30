package com.sher.music.entity;

import java.io.Serializable;

public class Music implements Serializable {
    private int id;
    private String name;
    private String album;
    private long alumbId;
    private String url;
    private String artist;
    private int  duration;
    private String pic;//专辑海报
//    private  long size;
//    private String tag;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public long getAlumbId() {
        return alumbId;
    }

    public void setAlumbId(long alumbId) {
        this.alumbId = alumbId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
