package com.softwareInstitute.louis.clark.Movie_project;

import org.springframework.boot.test.context.SpringBootTest;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
class MovieProjectApplicationTests {

	Movie testFilm = new Movie("movieName", 4, "Is good film no?", 14);

	//////////////////////////////////film constructor tests ////////////////////////////////////////////

	@Test
	public void testForFilmTitle(){
		assertEquals("movieName",testFilm.getMovieName(),"Film title constructor not working");
	}

	@Test
	public void testForFilmLanguage(){
		assertEquals(4,testFilm.getLanguageId(),"Film language constructor not working");
	}
	@Test
	public void testForFilmDescription(){
		assertEquals( "Is good film no?",testFilm.getDescription(),"Film description constructor not working");
	}
	@Test
	public void testForFilmLength(){
		Integer a = 14;
		assertEquals( a, testFilm.getLength(),"Film length constructor not working");
	}

	//////////////////////////////////////actor constructor tests ////////////////////////////////////////////////////
	Actor testActor = new Actor("Testy","McTestFace");
	@Test
	public void testForActorFirstName(){
		assertEquals("Testy", testActor.getActorFirstName(), "Actor first name constructor error");
	}

	@Test
	public void testForActorLastName(){
		assertEquals("McTestFace",testActor.getActorSurname(),"Actor last name constructor error");
	}

}
