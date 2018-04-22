package login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("Nikolai") && password.equals("123"))
			return true;

		return false;
	}

}