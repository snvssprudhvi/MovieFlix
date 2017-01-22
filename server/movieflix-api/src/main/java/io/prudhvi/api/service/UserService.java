package io.prudhvi.api.service;

import io.prudhvi.api.entity.User;
import java.util.List;

public interface UserService 
{
	public List<User> findAll();
	
	public User findOne(String id);
	
	public User findByEmail(String email);
	
	public User passwordEValidation(String email,String Password);

	public User passwordIValidation(String id,String Password);
	
	public User create(User user);
	
	public User update(String id, User user);
	
	public void delete (String id);
	
}
