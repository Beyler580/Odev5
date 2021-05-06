package Core;

public interface IAuthService {
	void login(String email , String password);
	void register(String firstName,String lastName,String email,String password );

}
