// Link in codeforces
// https://codeforces.com/contest/116/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of stops
        int[] enter = new int[n]; // Number of passengers entering at each stop
        int[] exit = new int[n]; // Number of passengers exiting at each stop
 
        // Read the input for passengers entering and exiting at each stop
        for (int i = 0; i < n; i++) {
            exit[i] = sc.nextInt();
            enter[i] = sc.nextInt();
        }
 
        int maxPassengers = 0;
        int currentPassengers = 0;
 
        // Calculate the total number of passengers at each stop and find the maximum
        for (int i = 0; i < n; i++) {
            currentPassengers -= exit[i];
            currentPassengers += enter[i];
            maxPassengers = Math.max(maxPassengers, currentPassengers);
        }
 
        System.out.println(maxPassengers);
    }
}