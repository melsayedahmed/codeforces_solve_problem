// Link in codeforces
// https://codeforces.com/contest/977/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
 
        while (k > 0) {
            if (n % 10 == 0) {
                n /= 10;
            } else {
                n--;
            }
            k--;
        }
 
        System.out.println(n);
    }
}