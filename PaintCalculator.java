
import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter room height (feet): ");
        double height = input.nextDouble();

        System.out.print("Enter room length (feet): ");
        double length = input.nextDouble();

        System.out.print("Enter room width (feet): ");
        double width = input.nextDouble();

        double wallArea = 2 * height * (length + width);
        double ceilingArea = length * width;
        double totalArea = wallArea + ceilingArea;

        int buckets5L = (int) (totalArea / 1500);
        double remainingArea = totalArea % 1500;

        int buckets1L = (int) Math.ceil(remainingArea / 300);

        int totalBuckets = buckets5L + buckets1L;
        double totalCost = (buckets5L * 15) + (buckets1L * 4);

        System.out.println("Total area: " + totalArea + " square feet");
        System.out.println("5-liter buckets: " + buckets5L);
        System.out.println("1-liter buckets: " + buckets1L);
        System.out.println("Total buckets: " + totalBuckets);
        System.out.println("Total cost: $" + totalCost);

        input.close();
    }
}
