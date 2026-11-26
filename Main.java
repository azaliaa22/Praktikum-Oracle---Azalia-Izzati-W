
public class Main {

    public static Fish nicestFish(Fish... fishes) {
        Fish temp = fishes[0];

        for (Fish fish : fishes) {
            if (fish.getFriendliness() > temp.getFriendliness()) {
                temp = fish;
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        Fish fish1 = new Fish("Amber", "AngelFish", 5);
        Fish fish2 = new Fish("James", "Guppy", 3);

        System.out.println("Fish 1: " + fish1);
        System.out.println("Fish 2: " + fish2);

        Fish nicest = nicestFish(fish1, fish2);

        System.out.println("Nicest fish: " + nicest);
    }
}
