package io.prudhvi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.prudhvi.api.entity.Movies;
import io.prudhvi.api.service.MoviesService;

@RestController
@RequestMapping(value="movies")
public class MoviesController 
{
	@Autowired
	private MoviesService service;
	
	@RequestMapping(method = RequestMethod.GET )
	public List<Movies> findAll()
	{
		return  service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/movie_id/{movies_Id}")
	public Movies findOne(@PathVariable("movies_Id") String movies_Id)
	{
		return service.findOne(movies_Id);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/title/{title}")
	public Movies findBytitle(@PathVariable("title") String title)
	{
		return service.findBytitle(title);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/topRatedMovies")
	public List<Movies> topRatedMovies()
	{
		return service.topRatedMovies();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/topRatedSeries")
	public List<Movies> topRatedSeries()
	{
		return service.topRatedSeries();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/type/{type}")
	public List<Movies> type(@PathVariable("type") String type)
	{
		return service.type(type);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/genre/{genre}")
	public List<Movies> genre(@PathVariable("genre") String genre)
	{
		return service.genre(genre);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/year/{year}")
	public List<Movies> year(@PathVariable("year") String year)
	{
		return service.year(year);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/sortImdbRaing")
	public List<Movies> sortImdbRaing()
	{
		return service.sortImdbRaing();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/sortImdbVotes")
	public List<Movies> sortImdbVotes()
	{
		return service.sortImdbVotes();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/sortYear")
	public List<Movies> sortYear()
	{
		return service.sortYear();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Movies create(@RequestBody Movies movies)
	{
		return service.create(movies);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{movies_Id}" )
	public Movies update(@PathVariable("movies_Id") String movies_Id,@RequestBody Movies movies)
	{
		return service.update(movies_Id, movies);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{movies_Id}")
	public void delete(@PathVariable("movies_Id") String movies_Id)
	{
		service.delete(movies_Id);
	}
}
