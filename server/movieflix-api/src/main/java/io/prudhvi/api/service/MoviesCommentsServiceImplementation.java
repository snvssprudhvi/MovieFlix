package io.prudhvi.api.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import io.prudhvi.api.entity.MoviesComments;
import io.prudhvi.api.repository.MoviesCommentsRepository;

@Service
public class MoviesCommentsServiceImplementation implements MoviesCommentsService
{

	@Autowired
	private MoviesCommentsRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<MoviesComments> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public List<MoviesComments> movieComments(String title) {
		return repository.movieComments(title);
	}

	@Override
	@Transactional
	public MoviesComments create(MoviesComments moviesComments) {
		return repository.create(moviesComments);
	}

}
