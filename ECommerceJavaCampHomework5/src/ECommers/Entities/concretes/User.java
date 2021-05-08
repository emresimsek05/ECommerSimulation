package ECommers.Entities.concretes;

import ECommers.Entities.abstracts.Entity;

public class User implements Entity{
	
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	
	public User() { 
		
	} 
		public User(String FirstName, String LastName, String Email, String Password) {
			
			this.FirstName= FirstName;
			this.LastName= LastName;
			this.Email= Email;
			this.Password= Password;
	}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			this.FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			this.LastName = lastName;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			this.Email = email;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			this.Password = password;
		}
		
}