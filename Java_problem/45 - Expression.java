// Link in codeforces
// https://codeforces.com/problemset/problem/479/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the input numbers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
 
        // Calculate all possible values
        int[] values = new int[6];
        values[0] = a + b + c;
        values[1] = a * b * c;
        values[2] = a + b * c;
        values[3] = a * b + c;
        values[4] = (a + b) * c;
        values[5] = a * (b + c);
 
        // Find the maximum value
        int max = values[0];
        for (int i = 1; i < 6; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
 
        // Print the maximum value
        System.out.println(max);
 
        scanner.close();
    }
}