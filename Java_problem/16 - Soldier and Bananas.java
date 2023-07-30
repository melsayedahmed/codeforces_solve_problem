// Link in codeforces
// https://codeforces.com/contest/546/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read the input
        int k = scanner.nextInt(); // Initial number of bananas
        int n = scanner.nextInt(); // Total dollars he has
        int w = scanner.nextInt(); // Number of bananas he wants to buy
 
        // Calculate the total cost of buying w bananas
        int totalCost = (w * (w + 1) / 2) * k;
 
        // Calculate the amount borrowed (if any)
        int borrowed = Math.max(0, totalCost - n);
 
        // Print the minimum amount of money needed
        System.out.println(borrowed);
 
        scanner.close();
    }
}