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

import java.util.Optional;


@SpringBootTest
public class MyStepdefs_add {

    Integer film_id;
    String title;
    String description;
    Integer language_id;
    Integer length;


    Movie testMovie;
    @Autowired
    private MovieRepository movieRepositoryInstanceForTests;
/////////////////////////////////////Adding a film to the database////////////////////////////////////////////////////////
    @Given("I know all the information for the film I want to add")
    public void iKnowAllTheInformationForTheFilmIWantToAdd() {
        film_id = 5000;
        title = "TESTTITLE";
        language_id = 5;
        description = "blah blah blah";
        length = 25;
    }
    @When("I input all the information")
    public void iInputAllTheInformation() {
            testMovie = new Movie(title,language_id,description,length);
            movieRepositoryInstanceForTests.save(testMovie);
            //return testMovie;
    }
    @Then("The database is updated")
    public void theDatabaseIsUpdated() {
        int testID = testMovie.getmovieId();
        Optional<Movie> actualMovieOptional = movieRepositoryInstanceForTests.findById(testID);
        Movie actualMovie = actualMovieOptional.get();
        assertTrue(actualMovie.equals(testMovie));
    }
///////////////////////////////////////////Adding a film to the database with incomplete data//////////////////////////////////////////////////
// Would need to add way more possibilities for non-added attributes
    @Given("I only know some of the information for a new film")
    public void partialMovieInfo() {
        title = "TESTTITLE";
        language_id = 5;
        description = null;
        length = null;
    }
    @When("I input the incomplete data")
    public Movie createMovieWithPartialInfo() {
        testMovie = new Movie(title,language_id,description);
        return testMovie;
    }

    @Then("I recieve an error message saying {string}")
    public void iRecieveAnErrorMessageSaying(String string) {
        int testLength = testMovie.getLength();
        assertEquals(testLength, 0);

    }
}
