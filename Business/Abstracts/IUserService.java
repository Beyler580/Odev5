package Business.Abstracts;

public interface IUserService {
	void register(String firstName,String lastname,String email,String password);
	void login(String email, String password);

}
