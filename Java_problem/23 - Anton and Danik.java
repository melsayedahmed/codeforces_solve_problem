// Link in codeforces
// https://codeforces.com/contest/734/problem/A

import java.util.Scanner;
 
public class ChessGameWinner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading the integer
        String outcome = scanner.nextLine();
        scanner.close();
 
        int antonCount = 0;
        int danikCount = 0;
 
        for (int i = 0; i < n; i++) {
            char result = outcome.charAt(i);
            if (result == 'A') {
                antonCount++;
            } else {
                danikCount++;
            }
        }
 
        if (antonCount > danikCount) {
            System.out.println("Anton");
        } else if (antonCount < danikCount) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}