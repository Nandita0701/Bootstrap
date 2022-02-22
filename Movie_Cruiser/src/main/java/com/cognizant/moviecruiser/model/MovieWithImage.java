package com.cognizant.moviecruiser.model;

import java.util.Date;


public class MovieWithImage {
	private int id;
	private String title;
	private String image;
	private String boxOffice;
	private boolean active;
	private Date dateOfLaunch;
	private String genre;
	private boolean hasTeaser;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(String boxOffice) {
		this.boxOffice = boxOffice;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}
	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isHasTeaser() {
		return hasTeaser;
	}
	public void setHasTeaser(boolean hasTeaser) {
		this.hasTeaser = hasTeaser;
	}
	@Override
	public String toString() {
		return "MovieWithImage [id=" + id + ", title=" + title + ", image=" + image + ", boxOffice=" + boxOffice
				+ ", active=" + active + ", dateOfLaunch=" + dateOfLaunch + ", genre=" + genre + ", hasTeaser="
				+ hasTeaser + "]";
	}
	public MovieWithImage() {
		super();
	}
	
	

}

