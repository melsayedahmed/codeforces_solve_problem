// Link in codeforces
// https://codeforces.com/contest/271/problem/A

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class BeautifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();
 
        int nextYear = year + 1;
        while (!isDistinctDigits(nextYear)) {
            nextYear++;
        }
 
        System.out.println(nextYear);
    }
 
    private static boolean isDistinctDigits(int year) {
        Set<Integer> digits = new HashSet<>();
        while (year > 0) {
            int digit = year % 10;
            if (digits.contains(digit)) {
                return false;
            }
            digits.add(digit);
            year /= 10;
        }
        return true;
    }
}