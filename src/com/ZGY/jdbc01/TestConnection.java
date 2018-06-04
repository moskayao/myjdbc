package com.ZGY.jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn=null;
        Statement stmt=null;
        ResultSet rs = null;
        try{
        	//使用反射加载驱动 抛出类找不到的异常
            Class.forName("com.mysql.cj.jdbc.Driver");
            //创建链接 抛出SQLException异常
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","root");
            //查询数据库中的t_user表
            stmt = conn.createStatement();
            String sql = "select * from t_user;";
            rs = stmt.executeQuery(sql);
            //遍历结果集
            while(rs.next()){
                //每有一条记录操作该记录
                System.out.println(rs.getString ("username"));
            }
    
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            conn.close();
            stmt.close();
            rs.close();
        }
	}

}
