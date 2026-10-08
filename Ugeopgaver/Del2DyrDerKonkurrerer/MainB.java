import java.util.ArrayList;

public class MainB {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Lion("Simba", 80));
        animals.add(new Rabbit("Bunny", 100));
        animals.add(new Wolf("Wolfie", 70));
        animals.add(new Lion("Leo", 90));

        System.out.println("=== Dyr i konkurrencen ===");

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println();

        // Kamp 1
        System.out.println("=== Kamp 1 ===");

        Contest contest1 = new Contest(animals.get(0), animals.get(1));

        while (contest1.getWinner() == null &&
                animals.get(0).isActive() &&
                animals.get(1).isActive()) {

            contest1.playRound();
        }

        Animal winner1 = contest1.getWinner();

        if (winner1 != null) {
            System.out.println("Vinderen er: " + winner1);
        } else {
            System.out.println("Der er endnu ingen vinder.");
        }

        System.out.println();

        // Kamp 2
        System.out.println("=== Kamp 2 ===");

        Contest contest2 = new Contest(animals.get(2), animals.get(3));

        while (contest2.getWinner() == null &&
                animals.get(2).isActive() &&
                animals.get(3).isActive()) {

            contest2.playRound();
        }

        Animal winner2 = contest2.getWinner();

        if (winner2 != null) {
            System.out.println("Vinderen er: " + winner2);
        } else {
            System.out.println("Der er endnu ingen vinder.");
        }
    }
}