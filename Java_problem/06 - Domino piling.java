// Link in codeforces
// https://codeforces.com/contest/50/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
 
        int totalDominos = m * n;
        int maxPossiblePieces = totalDominos / 2;
 
        System.out.println(maxPossiblePieces);
    }
}