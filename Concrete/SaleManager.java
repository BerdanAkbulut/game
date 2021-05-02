package business.Concrete;

import business.Abstract.SaleService;
import entity.Game;
import entity.User;

public class SaleManager implements SaleService {

	public void GameSale(User user, Game game) {
		
		if (user.getMoney() >= game.getPrice() ) {
			
			System.out.println(user.getFirstName() + ", " + game.getName() + " adl� oyunu sat�n ald�n�z.");
			
		}
		else {
			System.out.println("Sat�n alma i�lemi ba�ar�s�z, Bakiyeniz Yetersiz.");
		}
		
	}

	
}
