import java.util.Scanner;

class Day4 {
    private int age;

    public Person(int initialAge) {
        // Check if the initialAge is negative
        if (initialAge < 0) {
            age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        } else {
            age = initialAge;
        }
    }

    public void yearPasses() {
        // Increment the age by 1
        age++;
    }

    public void amIOld() {
        // Perform the age-based checks and print the appropriate message
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < T; i++) {
            int age = scanner.nextInt();
            Person person = new Person(age);
            person.amIOld();

            // Simulate a year passing
            for (int j = 0; j < 3; j++) {
                person.yearPasses();
            }

            person.amIOld();
            System.out.println(); // Print a new line between test cases
        }

        scanner.close();
    }
}
