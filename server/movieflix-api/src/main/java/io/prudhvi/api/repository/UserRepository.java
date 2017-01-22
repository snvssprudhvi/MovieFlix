package io.prudhvi.api.repository;

import java.util.List;

import io.prudhvi.api.entity.User;

public interface UserRepository 
{
	public List<User> findAll();
	
	public User findOne(String id);
	
	public User findByEmail(String email);
	
	public User passwordEValidation(String email, String password);
	
	public User passwordIValidation(String id, String password);
	
	public User create(User user);
	
	public User update(User user);
	
	public void delete (User user);
}
