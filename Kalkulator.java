import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        double hasil = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                if (b != 0) {
                    hasil = a / b;
                } else {
                    System.out.println("Tidak bisa dibagi nol!");
                    valid = false;
                }
                break;
            case '%':
                if (b != 0) {
                    hasil = a % b;
                } else {
                    System.out.println("Tidak bisa modulo nol!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + hasil);
        }

        input.close();
    }
}