// Link in codeforces
// https://codeforces.com/problemset/problem/158/B

import java.util.*;

public class Taxi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of groups
        int[] groups = new int[4]; // Count of groups of size 1, 2, 3, and 4
        
        for (int i = 0; i < n; i++) {
            int groupSize = scanner.nextInt();
            groups[groupSize - 1]++; // Increment the corresponding count
        }
        
        int taxis = groups[3]; // All groups of size 4 can fit in separate taxis
        
        // Groups of size 3 and 1 can be combined into taxis
        taxis += groups[2];
        groups[0] -= groups[2];
        
        // Combine groups of size 2 into taxis
        taxis += groups[1] / 2;
        groups[1] %= 2;
        
        // Combine remaining groups of size 1 into taxis
        if (groups[1] == 1) {
            taxis++;
            groups[0] -= 2;
        }
        
        // Combine remaining groups of size 1 into taxis
        if (groups[0] > 0) {
            taxis += (groups[0] + 3) / 4;
        }
        
        System.out.println(taxis);
    }
}