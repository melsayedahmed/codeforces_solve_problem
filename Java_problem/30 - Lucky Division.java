// Link in codeforces
// https://codeforces.com/contest/122/problem/A

import java.util.Scanner;
 
public class LuckyDivision {
 
    public static boolean isLucky(int n) {
        // Check if the number is divisible by 4 or 7
        return n % 4 == 0 || n % 7 == 0 || n % 47 == 0 || n % 74 == 0 || n % 447 == 0 || n % 474 == 0 || n % 477 == 0;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        if (isLucky(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}