// Link in codeforces
// https://codeforces.com/contest/160/problem/A

import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        int totalSum = 0;
 
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
            totalSum += coins[i];
        }
 
        // Sort the coins in descending order to make the greedy approach work
        Arrays.sort(coins);
 
        int mySum = 0;
        int myCoins = 0;
 
        for (int i = n - 1; i >= 0; i--) {
            mySum += coins[i];
            myCoins++;
 
            if (mySum > totalSum / 2) {
                break;
            }
        }
 
        System.out.println(myCoins);
    }
}