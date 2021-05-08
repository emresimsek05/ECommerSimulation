package ECommers.Business.abstracts;

import ECommers.Entities.concretes.User;

public interface UserService {
		
		void enterFirstName(User user);
		void enterLastName(User user);
		void enterePosta(User user);
		void enterPassword(User user);
		void add(User user);
		void getAll();
		void login(String Email, String Password);
}
