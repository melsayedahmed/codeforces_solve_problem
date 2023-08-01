// Link in codeforces
// https://codeforces.com/contest/486/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long result = calculateFunction(n);
        System.out.println(result);
    }
 
    public static long calculateFunction(long n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return -(n / 2 + 1);
        }
    }
}