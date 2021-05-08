package ECommers.DataAccess.abstracts;

import java.util.List;

import ECommers.Entities.concretes.User;

public interface UserDaoService {
		void enterFirstName(User user);
		void enterLastName(User user);
		void enterePosta(User user);
		void enterPassword(User user);
		List<User> getAll();
		void add(User user);
		boolean loginByCheck(String email, String password);
}
