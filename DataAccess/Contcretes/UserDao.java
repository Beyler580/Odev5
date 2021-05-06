package DataAccess.Contcretes;

import java.util.List;
import java.util.ArrayList;

import DataAccess.Abstracts.IUserDao;
import Entities.Concretes.User;

public class UserDao implements IUserDao {
	 List<User> users = new ArrayList<User>();  

	@Override
	public void add(User user) {
		System.out.println("Added to Database");
		users.add(user);
		
	}
	
	public boolean checkEmailandPassword(String email, String password) {
		for (User user : users) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return true;
			}
			
		}
		return false;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
