package drt2009.movies.beans;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import drt2009.movie.beans.Movie;

public class MovieTest {

	public static final String STRING = "String";
	public static final int INTEGER = 1;
	public boolean BOOLEAN = true;

	Movie movie;

	@Before
	public void setup() {
		movie = new Movie();
	}

	@Test
	public void getSetTitle_Test() {
		movie.setTitle(STRING);
		assertEquals("String", movie.getTitle());
	}

	@Test
	public void getSetGenre_Test() {
		movie.setGenre(STRING);
		assertEquals("String", movie.getGenre());
	}

	@Test
	public void getSetHardDrive_Test() {
		movie.setHardDrive(INTEGER);
		assertEquals(1, movie.getHardDrive());
	}

	@Test
	public void getSetDvdRip_Test() {
		movie.setDvdRip(BOOLEAN);
		assertEquals(true, movie.isDvdRip());
	}

	// Null Test
	@Test(expected = NullPointerException.class)
	public void getSetTitle_NullTest() {
		movie.setTitle(null);
	}

	@Test(expected = NullPointerException.class)
	public void getSetGenre_NullTest() {
		movie.setGenre(null);
	}
}
