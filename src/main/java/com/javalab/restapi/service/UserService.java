package com.javalab.restapi.service;

import java.util.List;

import com.javalab.restapi.vo.User;


public interface UserService {

	List<User> getUserList();
	User getUser(Integer id);
	Integer register(User userUser);
	Integer register2(User user);
	Integer modify(User user);
	Integer remove(Integer id);
	User login(User user);

}