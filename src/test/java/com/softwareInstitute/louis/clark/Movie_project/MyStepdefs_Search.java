package com.softwareInstitute.louis.clark.Movie_project;
import com.softwareInstitute.louis.clark.Movie_project.MovieRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.softwareInstitute.louis.clark.Movie_project.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Optional;


public class MyStepdefs_Search {

    String searchWord;


    @Autowired
    private MovieRepository movieRepositoryInstanceForTests;

     @Given("that I only know the film title that I want to search for")
     public void defineTheSearchTitle(){
         searchWord = "WAKE JAWS";
     }

     @When("I search the film title")
     public void searchByTitle(){
         movieRepositoryInstanceForTests.searchByTitleLike(searchWord);

     }
    @Then("Results that match the search are returned")
     public void returnMovieByTitle(){
        Movie expectedMovie = new Movie();
        expectedMovie.setMovieName("WAKE JAWS");
        expectedMovie.setDescription("A Beautiful Saga of a Feminist And a Composer who must Challenge a Moose in Berlin");
        expectedMovie.setLanguageId(1);
        expectedMovie.setLength(73);
        expectedMovie.setmovieId(954);
        List<Movie> actualMovieList = movieRepositoryInstanceForTests.searchByTitleLike(searchWord);
        Movie actualMovie = actualMovieList.get(0);
        assertTrue(actualMovie.equals(expectedMovie));
    }


}
