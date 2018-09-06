package com.poturno.vitor.owinfo.model;

import android.graphics.Bitmap;

public class Map {
    private String id;
    private String name;
    private String location;
    private String mode;
    private String event;
    private Bitmap smallImg;


    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Bitmap getSmallImg() {
        return smallImg;
    }

    public void setSmallImg(Bitmap smallImg) {
        this.smallImg = smallImg;
    }
}
