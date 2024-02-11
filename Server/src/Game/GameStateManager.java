package Game;

import java.util.HashMap;
import java.util.UUID;
public class GameStateManager {
    private HashMap<UUID, GameState> games = new HashMap<>();

    public UUID createNewGame() {
        UUID gameId = UUID.randomUUID();
        games.put(gameId, new GameState());
        return gameId;
    }

    public GameState getGame(UUID gameId) {
        return games.get(gameId);
    }
}
