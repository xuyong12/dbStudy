package my_db;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import model.User;

public class Dao {
    public static void addUser(User user) {       //�����û�
    	String sql="insert into user values(?,?,?,?,?,?)";
    	QueryRunner qr=new QueryRunner(Cond.getDs());       //���ݿ⹤����
    	Object[] params= {user.getId(),user.getPassword(),user.getName(),user.getSex(),user.getTelephone(),user.getEmail()};
    	try {
			qr.update(sql, params);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
