package com.ZGY.jdbc01;

import java.util.ArrayList;
import java.util.List;

import com.ZGY.jdbc01.interfaces.IUserDAO;
import com.ZGY.jdbc01.interfaces.impl.UserDAOImpl;
import com.ZGY.jdbc01.pojo.User;

public class testUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUserDAO db =new UserDAOImpl();
		//findAll test
//		List<User>users=new ArrayList<>();
//		users=db.findAll();
//		for (User user : users) {
//			System.out.println(user);
//		}
		//addUser test
		List<User>users=new ArrayList<>();
//		User user =new User("moskalin","moskalin","12345612345","Ç¨°²");
//		db.add(user);
//		users=db.findAll();
//		for (User tempUser : users) {
//			System.out.println(tempUser);
//		}
//		db.delete(6);
//		db.delete(7);
//		db.delete(8);
		
		users=db.findAll();
		for (User tempUser : users) {
			System.out.println(tempUser);
		}
	}

}
