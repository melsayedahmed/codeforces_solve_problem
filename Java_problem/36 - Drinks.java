// Link in codeforces
// https://codeforces.com/contest/200/problem/B

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt();
        int[] percentages = new int[n];
 
        for (int i = 0; i < n; i++) {
            percentages[i] = scanner.nextInt();
        }
 
        double sum = 0;
        for (int percentage : percentages) {
            sum += percentage;
        }
 
        double average = sum / n;
        System.out.printf("%.12f%n", average);
    }
}