// Link in codeforces
// https://codeforces.com/contest/1/problem/A

import java.util.Scanner;
 
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();
        
        long horizontalFlagstones = n % a == 0 ? n / a : n / a + 1;
        long verticalFlagstones = m % a == 0 ? m / a : m / a + 1;
        
        long totalFlagstones = horizontalFlagstones * verticalFlagstones;
        
        System.out.println(totalFlagstones);
    }
}