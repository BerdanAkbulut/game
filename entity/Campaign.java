package entity;

import java.util.Date;

public class Campaign {
	 
	private int GameId;
	private int Discount;
	private Date DiscountExpiration;
	private String CampaingName;
	
	
	public Campaign(int gameId, int discount, Date discountExpiration, String campaingName) {
		GameId = gameId;
		Discount = discount;
		DiscountExpiration = discountExpiration;
		CampaingName = campaingName;
	}
	public int getGameId() {
		return GameId;
	}
	public void setGameId(int gameId) {
		GameId = gameId;
	}
	public int getDiscount() {
		return Discount;
	}
	public void setDiscount(int discount) {
		Discount = discount;
	}
	public Date getDiscountExpiration() {
		return DiscountExpiration;
	}
	public void setDiscountExpiration(Date discountExpiration) {
		DiscountExpiration = discountExpiration;
	}
	public String getCampaingName() {
		return CampaingName;
	}
	public void setCampaingName(String campaingName) {
		CampaingName = campaingName;
	}
	
}
