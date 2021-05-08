package ECommers.Business.abstracts;

import ECommers.Entities.concretes.User;

public interface ValidationService {
	
		public boolean FirstNameValidation(User user);
		public boolean LastNameValidation(User user);
		public boolean EmailValidation(User user);
		public boolean PasswordValidation(User user);
		


}
