package Business.concretes;

import Business.Abstracts.IEmailService;
import Business.Abstracts.IUserService;
import Business.Abstracts.IValidationService;
import Core.IAuthService;
import DataAccess.Contcretes.UserDao;
import Entities.Concretes.User;

public class AuthManager implements IAuthService {
	IUserService userservice;
	IValidationService validationservice;
	IEmailService emailService ;
	UserDao userdao ; 

	public AuthManager(IUserService userservice, IValidationService validationservice,IEmailService emailService,UserDao userdao) {
		super();
		this.userservice = userservice;
		this.validationservice = validationservice;
		this.emailService = emailService;
		this.userdao = userdao;
	}

	@Override
	public void login(String email, String password) {
		if(email.length() ==0  || password.length() == 0) {
			System.out.println("fill in the blanks");
			return;
		}
		if(userdao.checkEmailandPassword(email, password)) {
			userservice.login(email, password);
		}else {
			System.out.println("Wrong password or email");
		}
		
		
		
		
		
		
	}

	@Override
	public void register(String firstName, String lastName, String email, String password) {
		if (validationservice.validate(new User(firstName, lastName, email, password))) {
			userservice.register(firstName, lastName, email, password);
			User UserToRegister = new User(firstName, lastName, email, password);
			userdao.add(UserToRegister);
			emailService.send("Dogrulama linki gonderildi "+UserToRegister.getEmail()+" kontrol ediniz.");
			
		}
		
	}

}
