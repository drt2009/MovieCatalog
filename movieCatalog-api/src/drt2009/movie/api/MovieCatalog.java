package drt2009.movie.api;

import drt2009.movie.beans.Movie;

public interface MovieCatalog {
	public void addNewMovie();
	public void updateMovie();
	public void deleteMovie();
	public Movie getMovie();
}
