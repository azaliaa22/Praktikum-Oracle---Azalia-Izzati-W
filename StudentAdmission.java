
import java.util.Scanner;

public class StudentAdmission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter GPA: ");
        double gpa = input.nextDouble();

        System.out.print("Enter SAT score: ");
        int sat = input.nextInt();

        boolean accepted = sat >= 1400
                || (gpa >= 4.0 && sat >= 1100)
                || (gpa >= 3.5 && sat >= 1300)
                || (gpa >= 3.0 && sat >= 1500);

        if (accepted) {
            System.out.println("Student is accepted.");
        } else {
            System.out.println("Student is not accepted.");
        }

        input.close();
    }
}
