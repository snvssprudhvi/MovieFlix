package io.prudhvi.api.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import io.prudhvi.api.entity.MoviesComments;

@Repository
public class MoviesCommentsRepositoryImplementation implements MoviesCommentsRepository
{
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<MoviesComments> findAll() {
		TypedQuery<MoviesComments> query = em.createNamedQuery("MoviesComments.findAll", MoviesComments.class);
		return query.getResultList();
	}

	@Override
	public List<MoviesComments> movieComments(String title) {
		TypedQuery<MoviesComments> query = em.createNamedQuery("MoviesComments.findBytitle", MoviesComments.class);
		query.setParameter("pTitle", title);
		return query.getResultList();
	}

	@Override
	public MoviesComments create(MoviesComments movies) 
	{
		em.persist(movies);
		return movies;
	}
		
}
