package com.test.UserManage.service;

import java.util.List;

import com.test.UserManage.entity.User;

public interface UserService {
	void saveUser(User user);
	User getUser(String name);
	void deleteUser(int id);
	void updateUser(User user);
	List<User> findAll();
}
