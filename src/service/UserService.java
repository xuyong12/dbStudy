package service;
import java.sql.SQLException;

import model.User;
import my_db.Cond;
import my_db.Dao;

public class UserService {
    public static void main(String[] args) {
		try {
			Cond.beginTransaction();
			User user=new User("151515","56515","45545","4485454","54545","545545");
			Dao.addUser(user);
			Cond.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
