// Link in codeforces
// https://codeforces.com/problemset/problem/1328/A


import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
 
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            int moves = solve(a, b);
            System.out.println(moves);
        }
 
        sc.close();
    }
 
    public static int solve(int a, int b) {
        if (a % b == 0) {
            return 0; // If 'a' is already divisible by 'b', then they are already equal.
        } else {
            // Otherwise, we need to find the smallest multiple of 'b' that is greater than 'a',
            // and the difference between this multiple and 'a' will be the number of moves needed.
            int multiple = (a / b) * b + b;
            return multiple - a;
        }
    }
}