package Core;

import GoogleLoginAuth.GoogleManager;

public class GoogleLoginServiceAdapter implements IAuthService {

	@Override
	public void login(String email, String password) {
		GoogleManager googleManager= new GoogleManager();
		googleManager.Login(email, password);
		
	}

	@Override
	public void register(String firstName, String lastName, String email, String password) {
		GoogleManager googleManager= new GoogleManager();
		googleManager.Register(firstName, lastName, email, password);
		
	}

}
