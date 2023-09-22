
/*                ------______--*/


import java.util.*;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character


        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();


            StringBuilder evenChars = new StringBuilder();
            StringBuilder oddChars = new StringBuilder();


            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);

                // Check if the index is even or odd
                if (j % 2 == 0) {
                    evenChars.append(c);
                } else {
                    oddChars.append(c);
                }
            }


            System.out.println(evenChars.toString() + " " + oddChars.toString());
        }

        scanner.close();
    }
}







