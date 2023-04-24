import java.util.Random;

public class NormalDice implements Dice {


    @Override
    public int RollDice() {
        return new Random().nextInt(6)+1;
    }
}
