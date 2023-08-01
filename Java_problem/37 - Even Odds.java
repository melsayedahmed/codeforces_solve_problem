// Link in codeforces
// https://codeforces.com/contest/318/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
 
        long oddNumbers = (n + 1) / 2;
        if (k <= oddNumbers) {
            // The k-th odd number is (2 * k) - 1
            System.out.println((2 * k) - 1);
        } else {
            // The k-th even number is (k - oddNumbers) * 2
            System.out.println((k - oddNumbers) * 2);
        }
    }
}