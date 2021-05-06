package DataAccess.Abstracts;

import java.util.ArrayList;

import Entities.Concretes.User;

public interface IUserDao {
	void add(User user);
	void delete();
	User get();
	ArrayList<User> getAll();
	

}
