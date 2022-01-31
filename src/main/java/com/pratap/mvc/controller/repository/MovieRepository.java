package com.pratap.mvc.controller.repository;

import com.pratap.mvc.controller.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    public List<Movie> moviesData;



    public MovieRepository() {
        this.moviesData = new ArrayList();;
    }

    public List<Movie> getMoviesData() {
        return moviesData;
    }

    public void setMoviesData(List<Movie> moviesData) {
        this.moviesData = moviesData;
    }
    public void addMovies(Movie movie)
    {
        this.moviesData.add(movie);
    }
    public void deleteMovies(String movie_Name)
    {
        this.moviesData.remove(movie_Name);
    }

    public void updateMovie(Movie movie)
    {
        this.moviesData.add(movie);
    }
}
