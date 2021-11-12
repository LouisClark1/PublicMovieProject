package com.softwareInstitute.louis.clark.Movie_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
//import org.testng.annotations.Optional;
import java.util.NoSuchElementException;


@SpringBootApplication

public class MovieProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieProjectApplication.class, args);
    }

//	@PutMapping("/update/actor/{id}")
//	public ResponseEntity<?>update(@RequestBody Actor updateActor, @PathVariable Integer id){
//		try{
//			Actor existsProduct = actorRepositoryInstance.getActorId(id);
//			actorRepositoryInstance.save(updateActor);
//			return new ResponseEntity<>(HttpStatus.OK);
//		} catch (NoSuchElementException e){
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//
//	}


//	@DeleteMapping(value = "/posts/{id}")
//	public ResponseEntity<Long> deletePost(@PathVariable Long id) {
//		var isRemoved = postService.delete(id);
//		if (!isRemoved) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//		return new ResponseEntity<>(id, HttpStatus.OK);
//	}

//	@GetMapping("/getById/{id}")
//	public String getFilm(@PathVariable(value ="id") int id){
//		return movieRepository.getmovieId(id);
//	}

//	@GetMapping("/getById/{id}")
//	public String getFilm(@PathVariable("id") int id){
//		return movieRepository.getmovieId(id);
//	}
}
