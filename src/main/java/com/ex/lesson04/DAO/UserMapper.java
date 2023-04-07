package com.ex.lesson04.DAO;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ex.lesson04.model.User;

@Repository
public interface UserMapper {
	
	public int AddUser(
			@Param("name") String name,
			@Param("yyyymmdd") String yyyymmdd,
			@Param("email") String email,
			@Param("introduce") String introduce);
	public User selectLatestUser();
	
	// 0: false 그외: true(중복)
	public boolean existUserByName(String name);
}
