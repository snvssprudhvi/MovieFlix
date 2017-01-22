package io.prudhvi.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import io.prudhvi.api.entity.Movies;

@Repository
public class MoviesRepositoryImplementation implements MoviesRepository
{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Movies> findAll() {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.findAll", Movies.class);
		return query.getResultList();
	}

	@Override
	public Movies findOne(String movies_Id) {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.findOne", Movies.class);
		query.setParameter("pMovies_Id", movies_Id);
		
		List<Movies> movies = query.getResultList();
		
		if (movies != null && movies.size() == 1) 
		{
			return movies.get(0);
		} 
		else 
		{
			return null;
		}
	}

	@Override
	public Movies findBytitle(String title) {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.findBytitle", Movies.class);
		query.setParameter("pTitle", title);
		List<Movies> movies = query.getResultList();
		
		if (movies != null && movies.size() == 1) 
		{
			return movies.get(0);
		} 
		else 
		{
			return null;
		}
	}
	
	@Override
	public List<Movies> topRatedMovies() {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.topRatedMovies", Movies.class);
		return query.getResultList();
	}
	
	@Override
	public List<Movies> topRatedSeries() {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.topRatedSeries", Movies.class);
		return query.getResultList();
	}
	
	@Override
	public List<Movies> type(String type) {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.type", Movies.class);
		query.setParameter("pType", type);
		return query.getResultList();
	}
	
	@Override
	public List<Movies> genre(String genre) {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.genre", Movies.class);
		query.setParameter("pGenre", genre);
		return query.getResultList();
	}
	
	@Override
	public List<Movies> year(String year) {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.year", Movies.class);
		query.setParameter("pYear", year);
		return query.getResultList();
	}
	
	@Override
	public List<Movies> sortImdbRaing() {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.sortImdbRaing", Movies.class);
		return query.getResultList();
	}
	
	@Override
	public List<Movies> sortImdbVotes() {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.sortImdbVotes", Movies.class);
		return query.getResultList();
	}
	
	@Override
	public List<Movies> sortYear() {
		TypedQuery<Movies> query = em.createNamedQuery("Movies.sortYear", Movies.class);
		return query.getResultList();
	}
	
	@Override
	public Movies create(Movies movies) 
	{
		em.persist(movies);
		return movies;
	}

	@Override
	public Movies update(Movies movies) {
		return em.merge(movies);
	}

	@Override
	public void delete(Movies movies) {
		em.remove(movies);
	}
}
