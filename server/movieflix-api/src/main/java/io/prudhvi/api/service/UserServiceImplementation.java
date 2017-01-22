package io.prudhvi.api.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.prudhvi.api.entity.User;
import io.prudhvi.api.exceptions.BadRequestException;
import io.prudhvi.api.exceptions.InvalidPasswordException;
import io.prudhvi.api.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public User findOne(String id) {
		User user = repository.findOne(id);
		if(user == null)
		{
			throw new EntityNotFoundException("Invalid User");
		}
		return user;
	}
	
	@Override
	@Transactional(readOnly = true)
	public User findByEmail(String email) {
		User user = repository.findByEmail(email);
		if(user == null)
		{
			throw new EntityNotFoundException("Invalid User");
		}
		return user;
	}
	
	@Override
	@Transactional(readOnly = true)
	public User passwordEValidation(String email,String password) {
		User user = repository.passwordEValidation(email,password);
		if(user == null)
		{
			throw new InvalidPasswordException("Invalid User Name or Password");
		}
		return user;
	}

	@Override
	@Transactional(readOnly = true)
	public User passwordIValidation(String id,String password) {
		User user = repository.passwordIValidation(id,password);
		if(user == null)
		{
			throw new InvalidPasswordException("Invalid User Name or Password");
		}
		return user;
	}
	
	@Override
	@Transactional
	public User create(User user) {
		User exsiting = repository.findByEmail(user.getEmail());
		if(exsiting != null)
		{
			throw new BadRequestException("User with this E-Mail Already Exsists");
		}
		return repository.create(user);
	}

	@Override
	@Transactional
	public User update(String id, User user) {
		User exsisting = repository.findOne(id);
		if(exsisting == null)
		{
			throw new EntityNotFoundException("Invalid User");
		}
		return repository.update(user);
	}

	@Override
	@Transactional
	public void delete(String id) 
	{
		User user = repository.findOne(id);
		if(user == null)
		{
			throw new EntityNotFoundException("Invalid User");
		}
		repository.delete(user);
	}

}
