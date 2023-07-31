// Link in codeforces
// https://codeforces.com/contest/136/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] permutation = new int[n];
 
        // Reading the permutation
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            permutation[position - 1] = i + 1;
        }
 
        // Printing the original order
        for (int i = 0; i < n; i++) {
            System.out.print(permutation[i] + " ");
        }
    }
}