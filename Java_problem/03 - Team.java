// Link in codeforces
// https://codeforces.com/contest/231/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
 
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
 
            if (a + b + c >= 2) {
                count++;
            }
        }
 
        System.out.println(count);
    }
}