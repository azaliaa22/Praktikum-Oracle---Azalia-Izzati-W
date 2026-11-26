import java.util.Scanner;

public class GalToLit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter gallons: ");
        double gallons = input.nextDouble();

        double liters = gallons * 3.785;

        System.out.println(gallons + " gallons equals " + liters + " liters");

        input.close();
    }
}