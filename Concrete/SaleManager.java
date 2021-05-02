package business.Concrete;

import business.Abstract.SaleService;
import entity.Game;
import entity.User;

public class SaleManager implements SaleService {

	public void GameSale(User user, Game game) {
		
		if (user.getMoney() >= game.getPrice() ) {
			
			System.out.println(user.getFirstName() + ", " + game.getName() + " adlý oyunu satýn aldýnýz.");
			
		}
		else {
			System.out.println("Satýn alma iþlemi baþarýsýz, Bakiyeniz Yetersiz.");
		}
		
	}

	
}
