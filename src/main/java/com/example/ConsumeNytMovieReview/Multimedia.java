package com.example.ConsumeNytMovieReview;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Multimedia {
    // declare Multimedia variables
    private String type;
    private String src;
    private int width;
    private int height;

    // create Multimedia constructor
    public Multimedia() {
    }

    // create getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) { this.type = type; }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) { this.src = src; }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) { this.width = width; }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) { this.height = height; }

    @Override
    public String toString() {
        return "Multimedia{" +
                "type='" + type + '\'' +
                ", src=" + src + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
