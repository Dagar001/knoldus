/* ------------               */


import java.util.Scanner;

public class MultiplesTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        int n = scanner.nextInt();

        // Loop to print the first n multiples
        for (int i = 1; i <= 10; i++) { // We're printing the first 10 multiples
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
