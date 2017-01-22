package io.prudhvi.api.service;

import java.util.List;

import io.prudhvi.api.entity.MoviesComments;

public interface MoviesCommentsService 
{
		public List<MoviesComments> findAll();
		
		public List<MoviesComments> movieComments(String title);
		
		public MoviesComments create(MoviesComments moviesComments);
		
}
