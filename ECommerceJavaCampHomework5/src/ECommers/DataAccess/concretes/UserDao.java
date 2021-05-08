package ECommers.DataAccess.concretes;

import java.util.List;
import java.awt.desktop.UserSessionListener;
import java.util.ArrayList;
import java.util.List;

import ECommers.DataAccess.abstracts.UserDaoService;
import ECommers.Entities.concretes.User;

public class UserDao implements UserDaoService {
	private List<User> userList;
	public UserDao() {
		userList = new ArrayList<>(15);
	}
	@Override
	public void enterFirstName(User user) {
		System.out.println("Kullanicinin ismi : "+ user.getFirstName());
		
	}

	@Override
	public void enterLastName(User user) {
		System.out.println("Kullanici soyadi : " + user.getLastName());
		
	}

	@Override
	public void enterePosta(User user) {
		System.out.println("Kullanici epostasý : " + user.getEmail());
		
	}

	@Override
	public void enterPassword(User user) {
		System.out.println("Kullanici sifresi : " + user.getPassword());
		
	}

	@Override
	public List<User> getAll() {
		
		return userList;
	}

	@Override
	public void add(User user) {
		userList.add(user);
		System.out.println("Kullanici eklendi :" + user.getFirstName() + "--" + user.getEmail());
	}

	@Override
	public boolean loginByCheck(String email, String password) {
		for(User user : userList) {
			if(user.getEmail() == email &&  user.getPassword() == password)
				return true;
		}
		return false;
	}
	
	
}

