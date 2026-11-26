
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String message = "";

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            while (number < 1 || number > 7) {
                System.out.print("Unknown code! Enter again: ");
                number = input.nextInt();
            }

            switch (number) {
                case 1:
                    message += "D";
                    break;
                case 2:
                    message += "W";
                    break;
                case 3:
                    message += "E";
                    break;
                case 4:
                    message += "L";
                    break;
                case 5:
                    message += "H";
                    break;
                case 6:
                    message += "O";
                    break;
                case 7:
                    message += "R";
                    break;
            }
        }

        System.out.println("Decoded message: " + message);

        input.close();
    }
}
