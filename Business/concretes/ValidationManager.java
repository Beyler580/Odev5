package Business.concretes;

import java.util.regex.Pattern;

import Business.Abstracts.IValidationService;
import Entities.Concretes.User;

public class ValidationManager implements IValidationService {
    static final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	public static boolean isEmailValid(String email) {
	    if( EMAIL_REGEX.matcher(email).matches()) {
	    	return true;
	    }
	    System.out.println("Wrong email format");
	    return false;
	}
	
	
	public boolean validateUserPasswordLenght(String password)
	{
		if(password.length() >6) {
			return true;
		}
		System.out.println("Ur password must be above 6 letters");
		return false;
	}
	
	public boolean validateUsernameLenght(String username,String lastname) {
		if(username.length() >2 && lastname.length() >2) {
			return true;
		}
		System.out.println("Username and Password must be above 2 letters");
		return false;
	}
	public boolean checkEmail(String email) {
		if(UserManager.userEmails.contains(email)) {
			System.out.println("This email already exist");
			return false;
		}
		return true;
	}
	
	


	
	@Override
	public boolean validate(User user) {
		if(validateUsernameLenght(user.getFirstName(),user.getLastname()) && 
				validateUserPasswordLenght(user.getPassword()) && isEmailValid(user.getEmail()) && checkEmail(user.getEmail())) {
			return true;
		}
	    System.out.println("Register Unsuccesfully");
		return false;
	}
	
	

}
