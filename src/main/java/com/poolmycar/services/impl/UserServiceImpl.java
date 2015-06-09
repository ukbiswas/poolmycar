package com.poolmycar.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poolmycar.dao.UserDAO;
import com.poolmycar.domain.User;
import com.poolmycar.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDAO userDAO;

	public void saveUser(User user) {
		// TODO Auto-generated method stub

	}

	public void updateUser() {
		// TODO Auto-generated method stub

	}

	public void deleteUser() {
		// TODO Auto-generated method stub

	}

	public User getUser(String userName) {
		// TODO Auto-generated method stub
		return userDAO.getUser(userName);
	}

}
