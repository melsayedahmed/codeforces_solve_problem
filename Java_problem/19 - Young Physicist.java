// Link in codeforces
// https://codeforces.com/contest/69/problem/A

import java.util.Scanner;
 
public class ForcesEquilibrium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt();
        int xSum = 0, ySum = 0, zSum = 0;
 
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
 
            // Calculate the sums of x, y, and z components
            xSum += x;
            ySum += y;
            zSum += z;
        }
 
        // Check if the sums are all zero
        if (xSum == 0 && ySum == 0 && zSum == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
        scanner.close();
    }
}