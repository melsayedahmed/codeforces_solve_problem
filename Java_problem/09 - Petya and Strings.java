// Link in codeforces
// https://codeforces.com/contest/112/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next().toLowerCase();
        String secondString = scanner.next().toLowerCase();
        
        int result = firstString.compareTo(secondString);
        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}