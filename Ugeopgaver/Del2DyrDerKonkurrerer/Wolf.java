import java.util.Random;

public class Wolf extends Animal {

    private Random random = new Random();

    public Wolf(String name, int energy) {
        super(name, energy);
    }

    @Override
    public int attack() {
        return random.nextInt(8) + 5;
    }
}