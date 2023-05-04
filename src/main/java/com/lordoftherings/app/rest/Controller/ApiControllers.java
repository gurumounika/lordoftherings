package com.lordoftherings.app.rest.Controller;

import com.lordoftherings.app.rest.Models.Movie;
import com.lordoftherings.app.rest.Models.Quote;
import com.lordoftherings.app.rest.Repo.MovieRepo;
import com.lordoftherings.app.rest.Repo.QuoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class ApiControllers {

    @Autowired
    private MovieRepo movieRepo;
    @Autowired
    private QuoteRepo quoteRepo;

    @GetMapping(value = "/")
    public String getpage(){
         return "Welcome To Lord of the Rings Details!! ";
    }
    @GetMapping(value = "/movie")
    public List<Movie> getMovies(){
        return movieRepo.findAll();
    }

    @PostMapping(value = "/savemovie")
    public String saveMovies(@RequestBody Movie movie){
        movieRepo.save(movie);
        return "saved movies....";
    }
    @RequestMapping(value="/movie/{id}")
    public Optional<Movie> getMoviesId(@PathVariable long id){
        return  movieRepo.findById(id);
    }

    @GetMapping(value = "/quote")
    public List<Quote> getQuotes(){
        return quoteRepo.findAll();
    }

    @PostMapping(value = "/savequote")
    public String saveQuotes(@RequestBody Quote quote){
        quoteRepo.save(quote);
        return "saved quotes....";
    }

    @RequestMapping(value="/quote/{id}")
    public Optional<Quote> getQuotesId(@PathVariable long id){
        return  quoteRepo.findById(id);
    }

}
