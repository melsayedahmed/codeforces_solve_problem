// Link in codeforces
// https://codeforces.com/problemset/problem/520/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String input = scanner.next();

        // Convert the input to lowercase
        input = input.toLowerCase();

        // Initialize a boolean array to track the occurrence of letters
        boolean[] alphabetOccurrence = new boolean[26];

        // Iterate through the input string and mark the occurrence of letters
        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetOccurrence[ch - 'a'] = true;
            }
        }

        // Check if all letters are present
        boolean allLettersPresent = true;
        for (boolean letterOccurrence : alphabetOccurrence) {
            if (!letterOccurrence) {
                allLettersPresent = false;
                break;
            }
        }

        // Print the result
        if (allLettersPresent) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
