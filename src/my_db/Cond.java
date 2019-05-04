package my_db;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Cond {
	static ComboPooledDataSource ds = null;
			
	static Connection connection=null;   //针对事务的connection
	static {
		ds=new ComboPooledDataSource();        //对数据库链接池进行实例化
	}
    @Test
	public static Connection getConnection() {
		// TODO Auto-generated method stub
		try {
			connection = ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
    public static void beginTransaction() throws SQLException {
    	if(connection!=null) {
    		connection.setAutoCommit(false); //开启事务
    	}
    }
    public static void commit() throws SQLException {
    	if(connection!=null) {
    		connection.commit();   //提交事务
    		connection=null;
    		connection.close();
    	}
    }
    public static void rollBack() throws SQLException {
    	if(connection!=null) {
    		connection.rollback();     //回滚事务
    		connection=null;
    		connection.close();
    	}
    }
	public static ComboPooledDataSource getDs() {
		return ds;
	}
}
