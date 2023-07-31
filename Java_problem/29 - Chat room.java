// Link in codeforces
// https://codeforces.com/contest/58/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
 
        String hello = "hello";
        int j = 0; // Index for characters in "hello"
 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == hello.charAt(j)) {
                j++;
            }
            if (j == hello.length()) {
                System.out.println("YES");
                return;
            }
        }
 
        System.out.println("NO");
    }
}