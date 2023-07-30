// Link in codeforces
// https://codeforces.com/contest/281/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
 
        // Convert the first character to uppercase
        char firstChar = Character.toUpperCase(word.charAt(0));
 
        // Create a new string by replacing the first character
        String modifiedWord = firstChar + word.substring(1);
 
        // Print the modified word
        System.out.println(modifiedWord);
    }
}