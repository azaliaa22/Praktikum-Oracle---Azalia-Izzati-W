
import java.util.Scanner;

public class FinalExam {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What is your average in the class? ");
        double average = reader.nextDouble();

        System.out.print("How many classes have you missed? ");
        int daysAbsent = reader.nextInt();

        if ((average >= 90 && daysAbsent <= 3)
                || (average >= 80 && daysAbsent == 0)) {
            System.out.println(
                "Congratulations! You are exempt from the final exam.");
        } else {
            System.out.println(
                "You are not exempt from the final exam.");
        }

        reader.close();
    }
}
