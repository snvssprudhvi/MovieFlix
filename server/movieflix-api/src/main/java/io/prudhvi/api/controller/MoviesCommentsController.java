package io.prudhvi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.prudhvi.api.entity.MoviesComments;
import io.prudhvi.api.service.MoviesCommentsService;

@RestController
@RequestMapping(value="moviescomments")

public class MoviesCommentsController 
{
	@Autowired
	private MoviesCommentsService service;
	
	@RequestMapping(method = RequestMethod.GET )
	public List<MoviesComments> findAll()
	{
		return  service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/title/{title}")
	public List<MoviesComments> movieComments(@PathVariable("title") String title)
	{
		return service.movieComments(title);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public MoviesComments create(@RequestBody MoviesComments moviesComments)
	{
		return service.create(moviesComments);
	}
	
}
