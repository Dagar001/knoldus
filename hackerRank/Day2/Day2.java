import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        double mealCost;
        int tipPercent;
        int taxPercent;
        double tip;
        double tax;
        double totalCost;
        int Total;


        System.out.print("");
        mealCost = scanner.nextDouble();

        System.out.print("");
        tipPercent = scanner.nextInt();

        System.out.print("");
        taxPercent = scanner.nextInt();

        // Calculate Tip and Tax
        tip = mealCost * (tipPercent / 100.0);
        tax = mealCost * (taxPercent / 100.0);


        totalCost = mealCost + tip + tax;

        // Round to Nearest Integer
        Total = (int)Math.round(totalCost);






        System.out.println(Total);


        scanner.close();
    }
}
