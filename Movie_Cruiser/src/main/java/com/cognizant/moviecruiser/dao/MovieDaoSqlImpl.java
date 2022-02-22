package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.model.MovieWithImage;

@Service
public class MovieDaoSqlImpl {

	@Autowired
	MovieDao moviedao;
	
	@Transactional
	public List<Movie> getMovieListAdmin() {
		List<Movie> list=moviedao.getMovieListAdmin();
		return list;
	}

	@Transactional
	public List<Movie> getMovieListCustomer() {
		List<Movie> list=moviedao.getMovieListCustomer();
		return list;
	}

	@Transactional
	public void modifyMovie(Movie movie) {
		Optional<Movie> res=moviedao.findById(movie.getId());
		Movie movie1=res.get();
		movie1.setTitle(movie.getTitle());
		movie1.setActive(movie.isActive());
		movie1.setBoxOffice(movie.getBoxOffice());
		movie1.setDateOfLaunch(movie.getDateOfLaunch());
		movie1.setGenre(movie.getGenre());
		movie1.setHasTeaser(movie.isHasTeaser());
		
	moviedao.save(movie1);

	}
//
//	@Transactional
//	public Movie getMovie(long movieId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public List<MovieWithImage> getWithImageOfMoviesList(List<Movie> movieListAdmin) {
		// TODO Auto-generated method stub
		List<MovieWithImage> movieList = new ArrayList<MovieWithImage>();
		for(Movie m: movieListAdmin) {
			MovieWithImage mv = new MovieWithImage();
			String image = Base64.getEncoder().encodeToString(m.getImage());
			mv.setImage(image);
			mv.setId(m.getId());
			mv.setTitle(m.getTitle());
			mv.setActive(m.isActive());
			mv.setBoxOffice(m.getBoxOffice());
			mv.setDateOfLaunch(m.getDateOfLaunch());
			mv.setGenre(m.getGenre());
			mv.setHasTeaser(m.isHasTeaser());
			movieList.add(mv);
		}
		return movieList;
	}

}
