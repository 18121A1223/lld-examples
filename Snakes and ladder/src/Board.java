import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Board {

    private Map<Integer, Integer> playerPieces = new HashMap<>();
    private Map<Integer, Integer> snakes = new HashMap<>();
    private Map<Integer, Integer> ladders = new HashMap<>();

    public static int size;

    public Board(Map<Integer, Integer> playerPieces, Map<Integer, Integer> snakes, Map<Integer, Integer> ladders) {
        this.playerPieces = playerPieces;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public Map<Integer, Integer> getPlayerPieces() {
        return playerPieces;
    }

    public void setPlayerPieces(Map<Integer, Integer> playerPieces) {
        this.playerPieces = playerPieces;
    }

    public Map<Integer, Integer> getSnakes() {
        return snakes;
    }

    public void setSnakes(Map<Integer, Integer> snakes) {
        this.snakes = snakes;
    }

    public Map<Integer, Integer> getLadders() {
        return ladders;
    }

    public void setLadders(Map<Integer, Integer> ladders) {
        this.ladders = ladders;
    }
}
