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
			System.out.println(	"Kullanici isim yanlýþ , lütfen tekrar deneyin");
			
		}
		
	}

	@Override
	public void enterLastName(User user) {
		if(validationManager.LastNameValidation(user)) {
			userDao.enterLastName(user);
			loggerService.Log("Doðrulamayý 60 saniye içerisinde gerçekleþtiriniz");
		
		}else {
			System.out.println(	"Kullanici soyadi yanlýþ , lütfen tekrar deneyiniz");
		}
		
	}

	@Override
	public void enterePosta(User user) {
		if(validationManager.EmailValidation(user) == true ) {
			userDao.enterePosta(user);
			loggerService.Log("Doðrulama yapýnýz");
		
		}else {
			System.out.println("Kullanýcý eposta yanlýþ , lütfen tekrar deneyiniz");
		}
		
	}

	@Override
	public void enterPassword(User user) {
		if(validationManager.PasswordValidation(user) == true) {
		userDao.enterPassword(user);	
		
		}else {
			System.out.println("Kullanýcý þifresi yanlýþ , lütfen tekrar deneyiniz");
		}
		
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void getAll() {
		
		System.out.println("Kullanýcý listesi :");
		int a = 1;
		for(User user : userDao.getAll()) {
			System.out.println(a + "--" + user.getFirstName() + "--" + user.getLastName() + "--" + user.getEmail());
			a++;
		}
	}

	@Override
	public void login(String Email, String Password) {
		if(userDao.loginByCheck(Email, Password) == true) {
			System.out.println("Giriþ yapýld");
		
		}else {
			System.out.println(	"Giriþ Baþarýsýz");
		}
		
	}
}
