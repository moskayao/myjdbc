package com.ZGY.jdbc01.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ZGY.jdbc01.Util.DBUtil;
import com.ZGY.jdbc01.interfaces.IUserDAO;
import com.ZGY.jdbc01.pojo.User;


/**
 * 对User类的数据库进行<br>
 * 增删改查操作
 * @author moska
 * @version 1.0.1
 */
public class UserDAOImpl implements IUserDAO {
	
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "select * from t_user";
        List<User>users = new ArrayList<>();
        
        conn = DBUtil.getConnection();
        
        stmt = DBUtil.getStatement(conn);
        rs  = DBUtil.getResultSet(stmt,sql);
        User user = null;
        try{
            while(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddr(rs.getString("addr"));
                user.setRdate(rs.getTimestamp("rdate"));
                users.add(user);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return users;
	}
	
	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement prep =null;
        String sql ="insert into t_user values(null,?,md5(?),?,?,now())";
        try{
            conn = DBUtil.getConnection();
            prep = DBUtil.getPreparedStatement(conn,sql);
            prep.setString(1,user.getUsername());
            prep.setString(2,user.getPassword());
            prep.setString(3,user.getPhone());
            prep.setString(4,user.getAddr());
            //返回值 影响了多少数据
            prep.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            DBUtil.closeAll(conn,prep);
        }
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement prep =null;
        String sql = "delete from t_user where id = ?";
        try {
			conn = DBUtil.getConnection();
			prep = DBUtil.getPreparedStatement(conn, sql);
			prep.setInt(1, id);
			prep.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		 Connection conn = null;
	        PreparedStatement prep =null;
	        String sql ="insert into t_user values(null,?,md5(?),?,?,now())";
	        try{
	            conn = DBUtil.getConnection();
	            prep = DBUtil.getPreparedStatement(conn,sql);
	            prep.setString(1,user.getUsername());
	            prep.setString(2,user.getPassword());
	            prep.setString(3,user.getPhone());
	            prep.setString(4,user.getAddr());
	            //返回值 影响了多少数据
	            prep.executeUpdate();
	        }catch(Exception e){
	            e.printStackTrace();
	        }finally{
	            DBUtil.closeAll(conn,prep);
	        }
    }
	

	@Override
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        String sql = "select * from t_user where id = "+id;
        User user = null;
        
        conn = DBUtil.getConnection();
        
        
       
        try{
            //prep.setInt(1,id);
            prep = DBUtil.getPreparedStatement(conn,sql);
       	 	rs=prep.getResultSet();
            if(rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setPhone(rs.getString("phone"));
                user.setAddr(rs.getString("addr"));
                user.setRdate(rs.getTimestamp("rdate"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
	}

}
