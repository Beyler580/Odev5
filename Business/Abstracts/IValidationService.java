package Business.Abstracts;

import Entities.Concretes.User;

public interface IValidationService {
	boolean validate(User user);

}
