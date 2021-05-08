package ECommers;

import ECommers.Business.abstracts.UserService;
import ECommers.Business.concretes.UserManager;
import ECommers.Core.concretes.LoggerManager;
import ECommers.DataAccess.concretes.UserDao;
import ECommers.Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService = new UserManager(new UserDao() , new LoggerManager());
		
		User user1= new User("Emre" , "�im�ek" , "emresimsek05@gmail.com" , "98765");
		User user2 = new User("Emirhan" , "�im�ek" , "emirhansimsek05@gmail.com" , "123456");
		
		System.out.println(	"Siteye kaydolmak i�in : ");
		
		userService.enterFirstName(user1);
		userService.enterLastName(user1);
		userService.enterePosta(user1);
		userService.enterPassword(user1);
		userService.add(user1);
		
		
		System.out.println("+++++++++++++++++++");
		
		
		System.out.println("Sisteme giri� yapmak i�in");
		
		userService.login(user1.getEmail(), user1.getPassword());
		userService.getAll();
		
	}

}
