
import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] scores = new double[5];
        double total = 0;

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            scores[i] = input.nextDouble();
            total += scores[i];
        }

        double average = total / scores.length;

        System.out.println("Average score: " + average);

        input.close();
    }
}
