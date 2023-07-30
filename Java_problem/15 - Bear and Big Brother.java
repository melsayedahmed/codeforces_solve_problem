// Link in codeforces
// https://codeforces.com/contest/791/problem/A

import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
 
        int years = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            years++;
        }
 
        System.out.println(years);
    }
}