// Link in codeforces
// https://codeforces.com/contest/677/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the input
        int n = scanner.nextInt(); // Number of friends
        int h = scanner.nextInt(); // Height of the fence
 
        int minimumWidth = 0;
 
        // Process each friend's height
        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
 
            // Check if the friend needs one or two widths of the fence
            if (height > h) {
                minimumWidth += 2; // If height is greater than h, they need two widths
            } else {
                minimumWidth += 1; // If height is at most h, they need one width
            }
        }
 
        // Output the minimum width required
        System.out.println(minimumWidth);
 
        scanner.close();
    }
}