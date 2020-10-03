package webapp;

public class UserValidationService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("miro") && password.equals("dydu");
	}

}