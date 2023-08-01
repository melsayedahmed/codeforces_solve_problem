// Link in codeforces
// https://codeforces.com/problemset/problem/405/A

import java.util.Arrays;
import java.util.Scanner;
 
public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the number of columns
        int n = scanner.nextInt();
 
        // Read the number of cubes in each column
        int[] columns = new int[n];
        for (int i = 0; i < n; i++) {
            columns[i] = scanner.nextInt();
        }
 
        // Sort the array in non-decreasing order
        Arrays.sort(columns);
 
        // Print the rearranged array
        for (int i = 0; i < n; i++) {
            System.out.print(columns[i] + " ");
        }
    }
}