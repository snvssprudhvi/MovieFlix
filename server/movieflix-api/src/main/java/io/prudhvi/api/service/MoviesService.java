package io.prudhvi.api.service;

import java.util.List;

import io.prudhvi.api.entity.Movies;

public interface MoviesService 
{
	public List<Movies> findAll();
	
	public Movies findOne(String movies_Id);
	
	public Movies findBytitle(String title);
	
	public List<Movies> topRatedMovies();
	
	public List<Movies> topRatedSeries();
	
	public List<Movies> type(String type);

	public List<Movies> genre(String genre);
	
	public List<Movies> year(String year);
	
	public List<Movies> sortImdbRaing();

	public List<Movies> sortImdbVotes();

	public List<Movies> sortYear();
	
	public Movies create(Movies movies);
	
	public Movies update(String movies_Id, Movies movies);
	
	public void delete (String movies_Id);

	
}
