// Link in codeforces
// https://codeforces.com/contest/61/problem/A

import java.util.Scanner;
 
public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
 
        String result = xorBinaryStrings(a, b);
        System.out.println(result);
    }
 
    private static String xorBinaryStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n = a.length();
 
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i))
                sb.append("1");
            else
                sb.append("0");
        }
 
        return sb.toString();
    }
}