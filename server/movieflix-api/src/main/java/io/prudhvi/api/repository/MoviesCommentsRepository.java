package io.prudhvi.api.repository;

import java.util.List;

import io.prudhvi.api.entity.MoviesComments;;

public interface MoviesCommentsRepository 
{
	public List<MoviesComments> findAll();
	
	public List<MoviesComments> movieComments(String title);
	
	public MoviesComments create(MoviesComments movies);
	
}
