package drt2009.movie.beans;

import com.google.common.base.Preconditions;

public class Movie {
	private String title;
	private String genre;
	private int hardDrive;
	private boolean DvdRip;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		Preconditions.checkNotNull(title,"The title cannot be null");
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		Preconditions.checkNotNull(genre,"The genre cannot be null");
		this.genre = genre;
	}

	public int getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(int hardDrive) {
		this.hardDrive = hardDrive;
	}

	public boolean isDvdRip() {
		return DvdRip;
	}

	public void setDvdRip(boolean dvdRip) {
		DvdRip = dvdRip;
	}

}
