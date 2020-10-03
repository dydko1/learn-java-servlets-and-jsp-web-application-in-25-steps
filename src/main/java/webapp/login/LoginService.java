package webapp.login;

public class LoginService {
	public boolean validateUser(String user, String password) {
		if (user.equalsIgnoreCase("miro") && password.equals("dydu"))
			return true;
		else
			return false;
	}

}