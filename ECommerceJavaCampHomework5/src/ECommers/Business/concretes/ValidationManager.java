package ECommers.Business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import ECommers.Business.abstracts.ValidationService;
import ECommers.Entities.concretes.User;

public class ValidationManager implements ValidationService {
	
	private List<User> userArray = new ArrayList<>();
	public ValidationManager(List<User> userArray) {
		this.userArray = userArray;
	}
	
	public ValidationManager() {}
	
	@Override
	public boolean FirstNameValidation(User user) {
		if(user.getFirstName() == null || user.getFirstName().length() <3 ) {
			return false;
		}
		for(char c : user.getFirstName().toCharArray()) {
			if(Character.isDigit(c))
				return false;
		}
		return true;
	}

	@Override
	public boolean LastNameValidation(User user) {
		if(user.getLastName() == null || user.getLastName().length() < 3) {
			return false;
		}
		for(char c : user.getLastName().toCharArray()) {
			if(Character.isDigit(c))
				return false;
		}
		return true;
	}

	@Override
	public boolean EmailValidation(User user) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		
		Pattern pat = Pattern.compile(emailRegex);
		if(user.getEmail() == null)
			return false;
		return pat.matcher(user.getEmail()).matches();
	}

	@Override
	public boolean PasswordValidation(User user) {
		 if(user.getPassword() == null ||  user.getPassword().length() < 7) {
			return false; 
		 }
			return true;
		
		
	}

}
