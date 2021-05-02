package business.Concrete;
import business.Abstract.CampaignService;
import entity.Campaign;

public class CampaignManager implements CampaignService {

		
	@Override
	public void Add(Campaign campaign) {
		System.out.println(campaign.getGameId() + " ' id li oyuna " + campaign.getCampaingName() + " uygulandý.");
		
	}

	@Override
	public void Delete(Campaign campaign) {
		System.out.println(campaign.getGameId() + " ' id li oyundan " + campaign.getCampaingName() + " silindi ");
		
	}

	@Override
	public void Update(Campaign campaign) {
		System.out.println(campaign.getGameId() + " ' id li oyunun" + campaign.getCampaingName() + " güncellendi ");
		
	}

	

	

}
