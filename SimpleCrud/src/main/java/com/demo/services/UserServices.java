package com.demo.services;

import java.util.List;

import com.demo.model.User;

public interface UserServices {

	String add(User user);

	List<User> getAll();

	User getUser(int id);

	String delete(int id);

	String update(int id, User user);
	
}
