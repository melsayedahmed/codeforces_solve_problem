// Link in codeforces
// https://codeforces.com/contest/133/problem/A

import java.util.Scanner;
 
public class HQ9Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();
 
        if (containsHQ9(input)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
    public static boolean containsHQ9(String input) {
        // Check if the string contains any of the characters 'H', 'Q', or '9'.
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'H' || ch == 'Q' || ch == '9') {
                return true;
            }
        }
        return false;
    }
}