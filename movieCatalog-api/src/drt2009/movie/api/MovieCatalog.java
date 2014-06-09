package drt2009.movie.api;

import drt2009.movie.beans.Movie;

public interface MovieCatalog {
	public void addNewMovie(String title,String genre,int hardDrive,boolean dvdRip);
	public void updateMovie();
	public void deleteMovie();
	public Movie getMovie();
}
