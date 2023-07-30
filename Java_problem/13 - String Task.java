// Link in codeforces
// https://codeforces.com/contest/118/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input = input.toLowerCase();
 
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!isVowel(c)) {
                result.append(".").append(c);
            }
        }
 
        System.out.println(result.toString());
    }
 
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }
}