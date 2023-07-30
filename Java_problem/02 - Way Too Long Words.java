// Link in codeforces
// https://codeforces.com/contest/71/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
 
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                String abbreviated = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbreviated);
            } else {
                System.out.println(word);
            }
        }
    }
}