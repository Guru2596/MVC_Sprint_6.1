package com.pratap.mvc.controller.movie;

import com.pratap.mvc.controller.model.Movie;
import com.pratap.mvc.controller.repository.MovieRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieC {
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Movie movie = context.getBean("movie",Movie.class);
    MovieRepository movieRepository = context.getBean("movieRepository",MovieRepository.class);

    public MovieC() {
        System.out.println("Movie Controller Instantiated ...");
    }
    @GetMapping(path = "/")
    public String getMovieHomePage(){
        System.out.println("Taking to home Page");
        return "index";
    }
    @PostMapping("/savemovie")
    public String saveMovie(@ModelAttribute("movie")Movie movie, ModelMap model){
        System.out.println("Taking to the save Movie Page ...."+movie);
        this.movieRepository.addMovies(movie);
        model.addAttribute("movieList",this.movieRepository.getMoviesData());
        return "index";
    }
}
