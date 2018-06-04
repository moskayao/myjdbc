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
        	//ʹ�÷���������� �׳����Ҳ������쳣
            Class.forName("com.mysql.cj.jdbc.Driver");
            //�������� �׳�SQLException�쳣
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop","root","root");
            //��ѯ���ݿ��е�t_user��
            stmt = conn.createStatement();
            String sql = "select * from t_user;";
            rs = stmt.executeQuery(sql);
            //���������
            while(rs.next()){
                //ÿ��һ����¼�����ü�¼
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
