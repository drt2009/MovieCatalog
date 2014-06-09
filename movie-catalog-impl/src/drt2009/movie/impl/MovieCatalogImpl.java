package drt2009.movie.impl;

import com.google.common.base.Preconditions;

import drt2009.movie.api.MovieCatalog;
import drt2009.movie.beans.Movie;
import drt2009.movie.beans.exceptions.MovieCatalogDatabaseException;

public class MovieCatalogImpl implements MovieCatalog {

	private static MovieCatalogImpl instance = null;
	private MovieCatalogDao dao;

	public static MovieCatalogImpl getInstance() {
		if (instance == null) {
			instance = new MovieCatalogImpl();
		}
		return instance;
	}

	private MovieCatalogImpl() {
		dao = MovieCatalogDao.getInstance();
		// Prevent use
	}

	public void addNewMovie(String title, String genre, int hardDrive, boolean dvdRip) {
		Preconditions.checkNotNull(title, "Title cannot be null");
		Preconditions.checkNotNull(genre, "Genre cannot be null");
		Preconditions.checkArgument(hardDrive > 0,
				"Hard Drive must be greated then 0");
		Movie movie = new Movie();
		movie.setTitle(title);
		movie.setGenre(genre);
		movie.setHardDrive(hardDrive);
		movie.setDvdRip(dvdRip);
		if (!saveToDatabase(movie)) {
			throw new MovieCatalogDatabaseException(
					"Failed to save movie to the database");
		}
	}

	public void updateMovie() {
		// TODO Auto-generated method stub

	}

	public void deleteMovie() {
		// TODO Auto-generated method stub

	}

	public Movie getMovie() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean saveToDatabase(Movie movie) {
		dao.saveNewMovie(movie);
		return true;
	}

}
