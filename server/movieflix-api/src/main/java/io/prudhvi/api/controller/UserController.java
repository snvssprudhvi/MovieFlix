package io.prudhvi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.prudhvi.api.entity.User;
import io.prudhvi.api.service.UserService;

@RestController
@RequestMapping(value="user")
public class UserController 
{
	@Autowired
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET )
	public List<User> findAll()
	{
		return  service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/id/{id}")
	public User findOne(@PathVariable("id") String userId)
	{
		return service.findOne(userId);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/email/{email}")
	public User findByEmail(@PathVariable("email") String email)
	{
		return service.findByEmail(email);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/epassword/{epassword}/password/{password}")
	public User passwordEValidation(@PathVariable("epassword") String email,@PathVariable("password") String password)
	{
		return service.passwordEValidation(email,password);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/ipassword/{ipassword}/password/{password}")
	public User passwordIValidation(@PathVariable("ipassword") String id,@PathVariable("password") String password)
	{
		return service.passwordEValidation(id,password);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public User create(@RequestBody User user)
	{
		return service.create(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}" )
	public User update(@PathVariable("id") String id,@RequestBody User user)
	{
		return service.update(id, user);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/{id}")
	public void delete(@PathVariable("id") String id)
	{
		service.delete(id);
	}
}
