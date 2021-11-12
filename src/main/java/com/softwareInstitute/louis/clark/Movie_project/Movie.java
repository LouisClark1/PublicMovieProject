package com.softwareInstitute.louis.clark.Movie_project;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="film")
public class Movie {

    //////////////////////attributes////////
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer film_id;
    @Column(name="title")
    private String movieName;
    @Column(name = "language_id")
    private int languageId;
    private String description;
    private int length;

    //////////////////////constructrs/////////
    public Movie(String movieName, int languageId, String description, int length){
        this.movieName = movieName;
        this.languageId =languageId;
        this.description= description;
        this.length = length;
    }
    public Movie(String movieName, int languageId, String description) {
        this.movieName = movieName;
        this.languageId =languageId;
        this.description= description;
    }



    public Movie(){}
    //////////////////////methods////////////
    public String getMovieName(){
        return movieName;
    }
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }

    public int getmovieId() {
        return film_id;
    }
    public void setmovieId(int movieId) {
        this.film_id = movieId;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return languageId == movie.languageId && length == movie.length && Objects.equals(film_id, movie.film_id) && Objects.equals(movieName, movie.movieName) && Objects.equals(description, movie.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(film_id, movieName, languageId, description, length);
    }
}

