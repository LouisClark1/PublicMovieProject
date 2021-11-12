package com.softwareInstitute.louis.clark.Movie_project;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class MyStepdefs_Remove {

    Movie testRemoveMovie;
    Integer film_id;
    String title;
    String description;
    Integer language_id;
    Integer length;

    @Autowired
    private MovieRepository movieRepositoryInstanceForTests;

    @Given("I have permission to edit the database")
    public void permissionExists(){

        film_id = 5000;
        title = "TESTTITLE";
        language_id = 5;
        description = "blah blah blah";
        length = 25;

    }

    @When("I find a film that does not exist and try to remove it")
    public void tryRemove(){
        //testRemoveMovie = new Movie("Title that does not exist",1,"This movie should be removed as soon as it is created",200);
        //This does not override the autogenerate
        //testRemoveMovie.setmovieId(testMovieID);
        testRemoveMovie = new Movie(title,language_id,description,length);
        movieRepositoryInstanceForTests.save(testRemoveMovie);

    }

    @Then("the entry is removed from the database")
        public void movieIsRemoved(){
        List<Movie> filmIDsList = movieRepositoryInstanceForTests.searchByTitleLike(title);
            for (int i = 0; i < filmIDsList.size(); i++) {
                movieRepositoryInstanceForTests.deleteById(filmIDsList.get(i).getmovieId());
            }
        }




}