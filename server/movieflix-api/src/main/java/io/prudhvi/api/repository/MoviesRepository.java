package io.prudhvi.api.repository;

import java.util.List;

import io.prudhvi.api.entity.Movies;

public interface MoviesRepository 
{
	public List<Movies> findAll();
	
	public Movies findOne(String movie_Id);
	
	public Movies findBytitle(String title);
	
	public List<Movies> topRatedMovies();
	
	public List<Movies> topRatedSeries();
	
	public List<Movies> type(String type);
	
	public List<Movies> genre(String genre);
	
	public List<Movies> year(String year);
	
	public List<Movies> sortImdbRaing();

	public List<Movies> sortYear();

	public List<Movies> sortImdbVotes();
	
	public Movies create(Movies movies);
	
	public Movies update(Movies movies);
	
	public void delete (Movies movies);

	
}
