package com.example.ConsumeNytMovieReview;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Link {
    // declare Link variables
    private String type;
    private String url;
    private String suggested_link_text;

    // create Link constructor to be used for creating new Link objects
    public Link() {
    }

    // create getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) { this.type = type; }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) { this.url = url; }

    public String getSuggested_link_text() {
        return suggested_link_text;
    }

    public void setSuggested_link_text(String suggested_link_text) { this.suggested_link_text = suggested_link_text; }

    @Override
    public String toString() {
        return "Link{" +
                "type='" + type + '\'' +
                ", url=" + url + '\'' +
                ", suggested_link_text=" + suggested_link_text+ '\'' +
                '}';
    }
}
