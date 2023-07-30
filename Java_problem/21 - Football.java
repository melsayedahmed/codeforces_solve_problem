// Link in codeforces
// https://codeforces.com/contest/96/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String players = scanner.nextLine();
 
        if (isFormationValid(players)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
    private static boolean isFormationValid(String players) {
        int count = 1;
        char current = players.charAt(0);
 
        for (int i = 1; i < players.length(); i++) {
            char player = players.charAt(i);
 
            if (player == current) {
                count++;
 
                if (count >= 7) {
                    return true;
                }
            } else {
                current = player;
                count = 1;
            }
        }
 
        return false;
    }
}