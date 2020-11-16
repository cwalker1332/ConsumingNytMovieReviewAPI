package com.example.ConsumeNytMovieReview;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

// model class

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieReview {
    // declare MovieReview variables
    private String status;
    private String copyright;
    private boolean has_more;
    private int num_results;
    private ArrayList<Results> results;

    // create MovieReview constructor
    public MovieReview(){
    }

    // create getters and setters
    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }

    public String getCopyright() { return copyright; }

    public void setCopyright(String copyright) { this.copyright = copyright; }

    public boolean isHas_more() { return has_more; }

    public void setHas_more(boolean has_more) { this.has_more = has_more; }

    public int getNum_results() { return num_results; }

    public void setNum_results(int num_results) { this.num_results = num_results; }

    public ArrayList<Results> getResults() { return results; }

    public void setResults(ArrayList<Results> results) { this.results = results; }

    @Override
    public String toString() {
        return "MovieReview{" +
                "status='" + status + '\'' +
                ", copyright=" + copyright + '\'' +
                ", has_more=" + has_more +
                ", num_results=" + num_results +
                ", results=" + results +
                '}';
    }
}