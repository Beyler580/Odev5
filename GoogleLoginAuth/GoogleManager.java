package GoogleLoginAuth;

public class GoogleManager {
	public void Register(String firstName, String lastname, String email, String password) {
		System.out.println("Google ile kayit olundu: "+firstName);
	}
	public void Login(String email,String password) {
		System.out.println("Google ile giris yapildi: "+email);
	}

}
