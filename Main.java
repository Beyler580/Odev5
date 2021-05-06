import Business.concretes.AuthManager;
import Business.concretes.EmailManager;
import Business.concretes.UserManager;
import Business.concretes.ValidationManager;
import Core.GoogleLoginServiceAdapter;
import Core.IAuthService;
import DataAccess.Contcretes.UserDao;

public class Main {

	public static void main(String[] args) {
		IAuthService authService = new AuthManager(new UserManager(), new ValidationManager(),new EmailManager(),new UserDao());
		authService.register("Beyler", "Qurbanov", "hayelsiz0132@gmail.com", "12345678"); // Kayit olundu,gmail gonderildi
		System.out.println("------------------------------------------------------");
		authService.register("Beyler", "Qurbanov", "hayelsiz0132@gmail.com", "12345678"); //Email zaten var hatasi
		System.out.println("------------------------------------------------------");
		authService.register("Beyler", "Qurbanov", "hayelsiz0132gmail.com", "12345678"); // Regex yanlis email format
		System.out.println("------------------------------------------------------");
		authService.register("B", "Qu", "hayelsiz0132gmail.com", "12345678"); // 2 harfdan yuksek olmali hatasi
		System.out.println("------------------------------------------------------");
		authService.register("Beyler", "Qurbanov", "hayelsiz0132gmail.com", "12345"); // Sifre 6 harfdan yuksek olmali
		System.out.println("-------------------------------------------------------");
		authService.login("Ewejiwe", ""); // Bosluklari doldurun hatasi
		System.out.println("-------------------------------------------------------");
		authService.login("sample@gmail.com", "12334545"); // Yanlis sifre veya gmail hatasi
		System.out.println("-------------------------------------------------------");
		authService.login("hayelsiz0132@gmail.com", "12345678"); //Giris basarili
		System.out.println("----------------------------------------------------------------");
		IAuthService authGoogleService = new GoogleLoginServiceAdapter();
		authGoogleService.register("BeylerGoogle", "QurbanovGoogle", "googlegiris@gmail.com", "1234567"); //Google ile kayit(Simulasyon)
		System.out.println("----------------------------------------------------------------");
		authGoogleService.login("googlegiris@gmail.com", "1234567"); //Google ile giris(Simulasyon)
		
		
			


	}

}
