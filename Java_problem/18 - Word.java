// Link in codeforces
// https://codeforces.com/contest/59/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
 
        int uppercaseCount = 0;
        int lowercaseCount = 0;
 
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercaseCount++;
            } else {
                lowercaseCount++;
            }
        }
 
        if (uppercaseCount > lowercaseCount) {
            System.out.println(input.toUpperCase());
        } else if (lowercaseCount > uppercaseCount) {
            System.out.println(input.toLowerCase());
        } else {
            System.out.println(input.toLowerCase());
        }
    }
}