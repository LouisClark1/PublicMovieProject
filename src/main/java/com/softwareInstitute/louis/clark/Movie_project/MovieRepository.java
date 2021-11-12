package com.softwareInstitute.louis.clark.Movie_project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Component //this is used by the example to split the services up
public interface MovieRepository extends CrudRepository<Movie,Integer>{

    @Query("SELECT u from Movie u WHERE u.movieName LIKE %:movieName%")
    List<Movie> searchByTitleLike(@Param("movieName") String movieName);

    //@Query("DELETE u from Movie u WHERE u.movieName LIKE %:movieName%")
    //void deleteByTitleLike(@Param("movieName") String movieName);
}
