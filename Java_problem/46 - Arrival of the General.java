// Link in codeforces
// https://codeforces.com/problemset/problem/144/A

import java.util.Scanner;
 
public class ArrivalOfTheGeneral {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
 
        int minIndex = 0;
        int maxIndex = 0;
 
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
            // Finding the index of the minimum height
            if (heights[i] <= heights[minIndex]) {
                minIndex = i;
            }
            // Finding the index of the maximum height
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
 
        // Calculate the number of swaps required
        int swaps = maxIndex + (n - 1 - minIndex);
        // If the maximum height is before the minimum height, reduce 1 from swaps
        if (maxIndex > minIndex) {
            swaps--;
        }
 
        System.out.println(swaps);
    }
}