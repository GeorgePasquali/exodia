package Games;


import java.util.ArrayList;
import java.util.List;

public class MainGameService {
	private static List<MainGame> games = new ArrayList<MainGame>();
	static {
		games.add(new MainGame("Super Mario", "Adventure/Action"));
		games.add(new MainGame("FarCry5", "Action/FPS/Adventure"));
		games.add(new MainGame("World of Warcraft", "MMORPG"));
	}

	public List<MainGame> retrieveTodos() {
		return games;
	}

	public void addTodo(MainGame game) {
		games.add(game);
	}

	public void deleteTodo(MainGame game) {
		games.remove(game);
	}

}