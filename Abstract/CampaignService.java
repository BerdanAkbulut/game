package business.Abstract;

import entity.Campaign;


public interface CampaignService {
	void Add(Campaign campaign);
	void Delete(Campaign campaign);
	void Update(Campaign campaign);

}
