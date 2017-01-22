package io.prudhvi.api.service;


import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.prudhvi.api.entity.Movies;
import io.prudhvi.api.exceptions.BadRequestException;
import io.prudhvi.api.repository.MoviesRepository;

@Service
public class MoviesServiceImplementation implements MoviesService 
{
	@Autowired
	private MoviesRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Movies> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Movies findOne(String movies_Id) {
		Movies movies = repository.findOne(movies_Id);
		if(movies == null)
		{
			throw new EntityNotFoundException("Movie or TV Series Not Found");
		}
		return movies;
	}

	@Override
	@Transactional(readOnly = true)
	public Movies findBytitle(String title) {
		Movies movies = repository.findBytitle(title);
		if(movies == null)
		{
			throw new EntityNotFoundException("Movie or TV Series Not Found");
		}
		return movies;
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Movies> topRatedMovies() {
		return repository.topRatedMovies();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Movies> topRatedSeries() {
		return repository.topRatedSeries();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Movies> type(String type) {
		return repository.type(type);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Movies> genre(String genre) {
		return repository.genre(genre);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Movies> year(String year) {
		return repository.year(year);
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Movies> sortImdbRaing() {
		return repository.sortImdbRaing();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Movies> sortImdbVotes() {
		return repository.sortImdbVotes();
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Movies> sortYear() {
		return repository.sortYear();
	}
	
	@Override
	@Transactional
	public Movies create(Movies movies) 
	{
		Movies exsiting = repository.findBytitle(movies.getTitle());
		if(exsiting != null)
		{
			throw new BadRequestException("Movie or TV Series Title Already Exsists");
		}
		return repository.create(movies);
	}

	@Override
	@Transactional
	public Movies update(String movies_Id, Movies movies) {
		Movies exsisting = repository.findOne(movies_Id);
		if(exsisting == null)
		{
			throw new EntityNotFoundException("Movie or TV Serires not found");
		}
		return repository.update(movies);
	}

	@Override
	@Transactional
	public void delete(String movies_Id) 
	{
		Movies movies = repository.findOne(movies_Id);
		if(movies == null)
		{
			throw new EntityNotFoundException("Movie or TV Serires not found");
		}
		repository.delete(movies);
	}

}
