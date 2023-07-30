// Link in codeforces
// https://codeforces.com/contest/41/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        sc.close();
 
        if (isReverse(s, t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
    private static boolean isReverse(String s, String t) {
        // Reverse the string s
        String reversedS = new StringBuilder(s).reverse().toString();
 
        // Compare the reversed string s with t
        return t.equals(reversedS);
    }
}