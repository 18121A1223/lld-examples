import java.util.LinkedList;
import java.util.Queue;

public class Game {

    private Board board;
    private Dice dice;
    private Queue<Player> playerList = new LinkedList<>();

    private int winnerCount = 1;

    public Game(Board board, Dice dice, Queue<Player> playerList) {
        this.board = board;
        this.dice = dice;
        this.playerList = playerList;
    }


    public void StartGame() {

        while (playerList.size() != 0) {
            Player player = playerList.poll();
            int diceValue = dice.RollDice();
            int PlayerCurrentPosition = board.getPlayerPieces().get(player.id);
            if (diceValue + PlayerCurrentPosition <= board.size) {
                int val = diceValue + PlayerCurrentPosition;
                val = checkForSnakesAndLadder(val);
                System.out.println("player " + player.name + "moved from " + PlayerCurrentPosition + " to" + val);
                if (val == 100) {
                    System.out.println(player.name + "won the game"+"\n"+ "rank: "+winnerCount );
                    board.getPlayerPieces().put(player.id,val);
                    winnerCount++;
                }
                else {
                    playerList.add(player);
                    board.getPlayerPieces().put(player.id,val);
                }

            }

        }
        System.out.println("game completed");
        Player player = playerList.peek();
        System.out.println(player.name + "rank: "+winnerCount );

    }

    public int checkForSnakesAndLadder(int val){

        if (board.getSnakes().containsKey(val)) {
            val = board.getPlayerPieces().get(val);
        }
        if (board.getLadders().containsKey(val)) {
            val = board.getLadders().get(val);
        }
        return val;
    }


}
