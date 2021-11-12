package com.softwareInstitute.louis.clark.Movie_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class restController {

    @Autowired
    private MovieRepository movieRepositoryInstance;

    @Autowired
    private ActorRepository actorRepositoryInstance;

    @GetMapping("/movies/all")
    public @ResponseBody
    Iterable<Movie> getAllMovies() {
        return movieRepositoryInstance.findAll();
    }

    @GetMapping("/actors/all")
    public @ResponseBody
    Iterable<Actor> getAllActors() {
        return actorRepositoryInstance.findAll();
    }

    @GetMapping("/id/movie/{movie_id}")
    public @ResponseBody Movie findByID(@PathVariable("movie_id") int movie_id) {
        System.out.println(movieRepositoryInstance.findById(movie_id));
        return movieRepositoryInstance.findById(movie_id).orElse(null);
    }

    @GetMapping("/all/id")
    public @ResponseBody Iterable<Movie> getAllIds() {
        return movieRepositoryInstance.findAll();
    }

    @GetMapping("/searchMovie/{title}")
    public List<Movie> searchMovieByTitle(@PathVariable("title") String titleString){
        return movieRepositoryInstance.searchByTitleLike(titleString);
    }

    @GetMapping("/movieNum")
    public @ResponseBody
    long countMovies() {
        return movieRepositoryInstance.count();
    }

    @PostMapping("/addMovie")
    public @ResponseBody String addAMovie (@RequestParam String movieName, @RequestParam int languageId, @RequestParam String description, @RequestParam Integer length) {
        Movie savedMovie = new Movie(movieName,languageId, description, length);
        movieRepositoryInstance.save(savedMovie);
        return "Saved";
    }

    @PostMapping("/addActor")
    public @ResponseBody String addActor (@RequestParam String first_name, @RequestParam String last_name) {
        Actor savedActor = new Actor(first_name, last_name);
        actorRepositoryInstance.save(savedActor);
        return "Saved";
    }
    // works with http://localhost:8080/removeActor/212
    @DeleteMapping(value = "/removeActor/{actor_id}")
    public String deleteActor(@PathVariable("actor_id") int actor_id) {
        actorRepositoryInstance.deleteById(actor_id);
        return "Actor removed";
    }

    @DeleteMapping(value = "/removeMovie/{film_id}")
    public String deleteFilm(@PathVariable("film_id") int film_id) {
        movieRepositoryInstance.deleteById(film_id);
        return "Movie removed";
    }


}
