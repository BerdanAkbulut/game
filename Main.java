import java.util.Date;

import business.Abstract.CampaignService;
import business.Abstract.GameService;
import business.Abstract.SaleService;
import business.Abstract.UserService;
import business.Abstract.Validate;
import business.Concrete.CampaignManager;
import business.Concrete.EDevletValidationManager;
import business.Concrete.GameManager;
import business.Concrete.SaleManager;
import business.Concrete.UserManager;
import entity.Campaign;
import entity.Game;
import entity.User;

public class Main {

	public static void main(String[] args) {
		
		User berdan = new User(1,100,"Berdan","Akbulut","11111111111");
		Game yılanOyunu = new Game(1,"Yılan Oyunu","2D",120);
		Campaign ramazanKampanyası = new Campaign(1,20,new Date(),"Ramazan Kampanyası");
		
		//
		UserService  userManager = new UserManager();
		userManager.Add(berdan);
		userManager.Delete(berdan);
		userManager.Update(berdan);
		
		//
		
		Validate validate = new EDevletValidationManager();
		validate.Validation(berdan);
		
		//
		
		SaleService saleService = new SaleManager();
		saleService.GameSale(berdan, yılanOyunu);
		
		//
		
		GameService gameService = new GameManager();
		gameService.Add(yılanOyunu);
		gameService.Delete(yılanOyunu);
		gameService.Update(yılanOyunu);
		
		//
		
		
		CampaignService campaignService =  new CampaignManager();
		campaignService.Add(ramazanKampanyası);
		campaignService.Delete(ramazanKampanyası);
		campaignService.Update(ramazanKampanyası);
	}

	

}
