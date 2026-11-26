
import java.util.Scanner;

public class MatrixCalculator {
    static Scanner input = new Scanner(System.in);
    static int[][] A = new int[2][2];
    static int[][] B = new int[2][2];
    static boolean hasA = false;
    static boolean hasB = false;

    public static void main(String[] args) {
        char choice;

        do {
            System.out.println("\n=== MATRIX CALCULATOR ===");
            System.out.println("a. Enter Matrix A");
            System.out.println("b. Enter Matrix B");
            System.out.println("c. Display A + B");
            System.out.println("d. Display A - B");
            System.out.println("e. Display A * B");
            System.out.println("f. Exit");
            System.out.print("Choose an option: ");

            choice = input.next().toLowerCase().charAt(0);

            switch (choice) {
                case 'a':
                    A = enterMatrix("A");
                    hasA = true;
                    break;
                case 'b':
                    B = enterMatrix("B");
                    hasB = true;
                    break;
                case 'c':
                    if (ready()) display(add(A, B));
                    break;
                case 'd':
                    if (ready()) display(subtract(A, B));
                    break;
                case 'e':
                    if (ready()) display(multiply(A, B));
                    break;
                case 'f':
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 'f');

        input.close();
    }

    static int[][] enterMatrix(String name) {
        int[][] matrix = new int[2][2];

        System.out.println("Enter elements of Matrix " + name + ":");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        return matrix;
    }

    static boolean ready() {
        if (!hasA || !hasB) {
            System.out.println("Please enter both matrices first!");
            return false;
        }
        return true;
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                result[i][j] = a[i][j] + b[i][j];

        return result;
    }

    static int[][] subtract(int[][] a, int[][] b) {
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                result[i][j] = a[i][j] - b[i][j];

        return result;
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] result = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    static void display(int[][] matrix) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
