package business.Concrete;

import business.Abstract.UserService;
import entity.User;

public class UserManager implements UserService {

	@Override
	public void Add(User user) {
		System.out.println(user.getFirstName()+ " adlý user kayýt edildi.");
		
	}

	@Override
	public void Delete(User user) {
		System.out.println(user.getFirstName()+ " adlý user silindi.");
		
		
	}

	@Override
	public void Update(User user) {
		System.out.println(user.getFirstName() + " adlý user güncellendi.");
		
	}

	
	
	

}
