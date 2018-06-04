package com.ZGY.jdbc01.interfaces;



import java.util.List;

import com.ZGY.jdbc01.pojo.User;

public interface IUserDAO {
	public abstract List<User> findAll();
	void add(User user);
	void delete(Integer id);
	void update(User user);
	User findById(Integer id);
	
}
