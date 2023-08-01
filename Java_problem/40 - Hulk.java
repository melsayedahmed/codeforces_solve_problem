// Link in codeforces
// https://codeforces.com/contest/705/problem/A

import java.util.Scanner;
 
public class HulkFeeling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
 
        String feeling = getHulkFeeling(n);
        System.out.println(feeling);
 
        scanner.close();
    }
 
    public static String getHulkFeeling(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sb.append("I hate ");
            } else {
                sb.append("I love ");
            }
 
            if (i == n) {
                sb.append("it");
            } else {
                sb.append("that ");
            }
        }
        return sb.toString();
    }
}