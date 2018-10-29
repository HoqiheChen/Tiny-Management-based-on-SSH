package com.test.UserManage.service;

import java.util.List;

import com.test.UserManage.dao.UserDAO;
import com.test.UserManage.entity.User;

public class UserServiceImpl implements UserService {
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void saveUser(User user){
		if( userDAO.findById(user.getId())==null){
			userDAO.save(user);
		}
	}
	
	public User getUser(String name){
		return userDAO.getUser(name);
	}
	
	public void deleteUser(int id){
		if(userDAO.findById(id)!=null){
			userDAO.delete(id);
		}
	}
	
	public void updateUser(User user){
		if(userDAO.findById(user.getId())!=null){
			userDAO.update(user);
		}
	}
	
	public List<User> findAll(){
		return userDAO.findAll();
	}
}
