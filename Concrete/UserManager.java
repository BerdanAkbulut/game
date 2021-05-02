package business.Concrete;

import business.Abstract.UserService;
import entity.User;

public class UserManager implements UserService {

	@Override
	public void Add(User user) {
		System.out.println(user.getFirstName()+ " adl� user kay�t edildi.");
		
	}

	@Override
	public void Delete(User user) {
		System.out.println(user.getFirstName()+ " adl� user silindi.");
		
		
	}

	@Override
	public void Update(User user) {
		System.out.println(user.getFirstName() + " adl� user g�ncellendi.");
		
	}

	
	
	

}
