package business.Concrete;

import business.Abstract.Validate;
import entity.User;

public class EDevletValidationManager implements Validate {

	public boolean Validation(User user) {
		if(user.getFirstName().length()<2 || user.getTck().length()!=11)
		{
			System.out.println("Kimlik Do�rulanamad�.");
			return false;
		}
		System.out.println("Kimlik Do�ruland�.");
			return true;
			
	}

}
