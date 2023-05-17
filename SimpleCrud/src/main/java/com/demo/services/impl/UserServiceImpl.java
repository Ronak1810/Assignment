package com.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repository.UserRepository;
import com.demo.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String add(User user) {
		userRepository.save(user);
		return "User Added Successfully...";
	}

	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public String delete(int id) {
		User u = new User();
		if(u == null)
			return "User Not Found...";
		else
			userRepository.delete(u);
		return "User Deleted Successfully....";
	}

	@Override
	public String update(int id, User user) {
		User u = new User();
		if(u == null)
			return "User Not Found...";
		else
			u.setName(user.getName());
			u.setEmail(user.getEmail());
			userRepository.save(u);
		return "User Updated Successfully....";
	}

}
