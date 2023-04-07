package com.ex.lesson04.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.lesson04.DAO.UserMapper;
import com.ex.lesson04.model.User;


@Service
public class UserBO {
	
	@Autowired
	private UserMapper userMapper;
	
	public void AddUser(String name,String yyyymmdd,String email,String introduce) {
		userMapper.AddUser(name, yyyymmdd, email, introduce);
	}
	
	// input: X		output:User(최신 가입자)
	public User getLatestUser() {
		return userMapper.selectLatestUser();
	}
	
	// input:name		output:boolean
	public boolean existUserByName(String name) {
		return userMapper.existUserByName(name);
	}
}
