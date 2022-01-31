package com.pratap.mvc.controller.model;

public class Movie {
    private String movie_Name;
    private String movie_Release_date;
    private String movie_Director;

    public Movie() {
    }

    public Movie(String movie_Name, String movie_Release_date, String movie_Director) {
        this.movie_Name = movie_Name;
        this.movie_Release_date = movie_Release_date;
        this.movie_Director = movie_Director;
    }

    public String getMovie_Name() {
        return movie_Name;
    }

    public void setMovie_Name(String movie_Name) {
        this.movie_Name = movie_Name;
    }

    public String getMovie_Release_date() {
        return movie_Release_date;
    }

    public void setMovie_Release_date(String movie_Release_date) {
        this.movie_Release_date = movie_Release_date;
    }

    public String getMovie_Director() {
        return movie_Director;
    }

    public void setMovie_Director(String movie_Director) {
        this.movie_Director = movie_Director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_Name='" + movie_Name + '\'' +
                ", movie_Release_date='" + movie_Release_date + '\'' +
                ", movie_Director='" + movie_Director + '\'' +
                '}';
    }
}
