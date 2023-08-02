// Link in codeforces
// https://codeforces.com/problemset/problem/469/A

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] levels = new int[N + 1];
 
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int level = sc.nextInt();
            levels[level] = 1;
        }
 
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) {
            int level = sc.nextInt();
            levels[level] = 1;
        }
 
        boolean canPassAllLevels = true;
        for (int i = 1; i <= N; i++) {
            if (levels[i] == 0) {
                canPassAllLevels = false;
                break;
            }
        }
 
        if (canPassAllLevels) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
 
        sc.close();
    }
}