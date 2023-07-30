// Link in codeforces
// https://codeforces.com/contest/282/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
 
        int x = 0;
        for (int i = 0; i < n; i++) {
            String operation = scanner.nextLine();
            if (operation.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
 
        System.out.println(x);
    }
}