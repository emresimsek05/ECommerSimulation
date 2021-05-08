package ECommers.Business.concretes;


import ECommers.Business.abstracts.UserService;
import ECommers.Business.abstracts.ValidationService;
import ECommers.Core.abstracts.LoggerService;
import ECommers.DataAccess.concretes.UserDao;
import ECommers.Entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private LoggerService loggerService;
	private ValidationService validationService;
	
	public UserManager(UserDao userDao, LoggerService loggerService) {
		this.userDao = userDao;
		this.loggerService= loggerService;
	}
	
	ValidationService validationManager = new ValidationManager();

	@Override
	public void enterFirstName(User user) {
		if(validationManager.FirstNameValidation(user) == true) {
			userDao.enterFirstName(user);
		}else {
			System.out.println(	"Kullanici isim yanl�� , l�tfen tekrar deneyin");
			
		}
		
	}

	@Override
	public void enterLastName(User user) {
		if(validationManager.LastNameValidation(user)) {
			userDao.enterLastName(user);
			loggerService.Log("Do�rulamay� 60 saniye i�erisinde ger�ekle�tiriniz");
		
		}else {
			System.out.println(	"Kullanici soyadi yanl�� , l�tfen tekrar deneyiniz");
		}
		
	}

	@Override
	public void enterePosta(User user) {
		if(validationManager.EmailValidation(user) == true ) {
			userDao.enterePosta(user);
			loggerService.Log("Do�rulama yap�n�z");
		
		}else {
			System.out.println("Kullan�c� eposta yanl�� , l�tfen tekrar deneyiniz");
		}
		
	}

	@Override
	public void enterPassword(User user) {
		if(validationManager.PasswordValidation(user) == true) {
		userDao.enterPassword(user);	
		
		}else {
			System.out.println("Kullan�c� �ifresi yanl�� , l�tfen tekrar deneyiniz");
		}
		
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void getAll() {
		
		System.out.println("Kullan�c� listesi :");
		int a = 1;
		for(User user : userDao.getAll()) {
			System.out.println(a + "--" + user.getFirstName() + "--" + user.getLastName() + "--" + user.getEmail());
			a++;
		}
	}

	@Override
	public void login(String Email, String Password) {
		if(userDao.loginByCheck(Email, Password) == true) {
			System.out.println("Giri� yap�ld");
		
		}else {
			System.out.println(	"Giri� Ba�ar�s�z");
		}
		
	}
}
