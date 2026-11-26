
class Animal {
    int weight, height;
    double speed;

    Animal() {
        weight = 50;
        height = 4;
        speed = 2;
    }

    Animal(int w, int h, int s) {
        weight = w;
        height = h;
        speed = s;
    }

    public double getTime(double miles) {
        return miles / speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getSpeed() {
        return speed;
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(70, 5, 10);

        System.out.println("Animal #1 has a speed of "
                + animal1.getSpeed());

        System.out.println("Animal #2 has a speed of "
                + animal2.getSpeed());
    }
}
