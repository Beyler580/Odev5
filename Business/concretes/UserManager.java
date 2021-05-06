package Business.concretes;

import java.util.List;
import java.util.ArrayList;

import Business.Abstracts.IUserService;
import DataAccess.Contcretes.UserDao;
import Entities.Concretes.User;

public class UserManager implements IUserService {
	static List<String> userEmails = new ArrayList<String>() ;
	


	@Override
	public void register(String firstName, String lastname, String email, String password) {
		System.out.println("User registered: "+ firstName);
		userEmails.add(email);
	}

	@Override
	public void login(String email, String password) {
		System.out.println("Login succesfully !"+"\t"+email+";"+password);
		
		
		
	}
	

}
