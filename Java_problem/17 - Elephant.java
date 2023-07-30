// Link in codeforces
// https://codeforces.com/contest/617/problem/A

import java.util.Scanner;
 
public class Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int steps = 0;
        
        // The elephant can move 5 units at a time
        // So, we divide the distance by 5 and round up to the nearest integer
        steps = (int) Math.ceil((double) x / 5);
        
        System.out.println(steps);
    }
}