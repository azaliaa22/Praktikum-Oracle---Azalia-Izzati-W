import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight on Earth (lbs): ");
        double weight = input.nextDouble();

        System.out.println("Select a planet:");
        System.out.println("1. Mercury");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturn");
        System.out.println("6. Uranus");
        System.out.println("7. Neptune");

        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        double factor = 0;
        String planet = "";

        switch (choice) {
            case 1:
                planet = "Mercury";
                factor = 0.38;
                break;
            case 2:
                planet = "Venus";
                factor = 0.91;
                break;
            case 3:
                planet = "Mars";
                factor = 0.38;
                break;
            case 4:
                planet = "Jupiter";
                factor = 2.36;
                break;
            case 5:
                planet = "Saturn";
                factor = 0.92;
                break;
            case 6:
                planet = "Uranus";
                factor = 0.89;
                break;
            case 7:
                planet = "Neptune";
                factor = 1.13;
                break;
            default:
                System.out.println("Invalid choice!");
        }

        if (factor != 0) {
            double result = weight * factor;
            System.out.println("Your weight on " + planet
                    + " is " + result + " lbs.");
        }

        input.close();
    }
}