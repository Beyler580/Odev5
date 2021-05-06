package Business.concretes;

import Business.Abstracts.IEmailService;

public class EmailManager implements IEmailService {

	@Override
	public void send(String message) {
		System.out.println("Message sent: "+message);
		
	}
	
	

}
