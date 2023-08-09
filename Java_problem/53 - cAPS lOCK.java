// Link in codeforces
// https://codeforces.com/problemset/problem/131/A

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        if (word.equals(word.toUpperCase())) {
            System.out.println(word.toLowerCase());
        } else if (Character.isLowerCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toUpperCase())) {
            System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());
        } else {
            System.out.println(word);
        }
    }
}