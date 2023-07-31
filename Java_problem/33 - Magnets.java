// Link in codeforces
// https://codeforces.com/contest/344/problem/A

import java.util.Scanner;
 
public class Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading n.
 
        int groupCount = 1; // At least one group is formed by the first magnet.
        int lastMagnet = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int currentMagnet = scanner.nextInt();
            if (currentMagnet != lastMagnet) {
                groupCount++;
                lastMagnet = currentMagnet;
            }
        }
 
        System.out.println(groupCount);
    }
}