package business.Concrete;

import business.Abstract.GameService;
import entity.Game;

public class GameManager implements GameService {

	@Override
	public void Add(Game game) {
		System.out.println(game.getName() + " Eklendi");
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getName() + " Silindi");
		
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getName() + " Güncellendi");
		
	}

	
}
