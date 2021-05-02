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
		Game y�lanOyunu = new Game(1,"Y�lan Oyunu","2D",120);
		Campaign ramazanKampanyas� = new Campaign(1,20,new Date(),"Ramazan Kampanyas�");
		
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
		saleService.GameSale(berdan, y�lanOyunu);
		
		//
		
		GameService gameService = new GameManager();
		gameService.Add(y�lanOyunu);
		gameService.Delete(y�lanOyunu);
		gameService.Update(y�lanOyunu);
		
		//
		
		
		CampaignService campaignService =  new CampaignManager();
		campaignService.Add(ramazanKampanyas�);
		campaignService.Delete(ramazanKampanyas�);
		campaignService.Update(ramazanKampanyas�);
	}

	

}
