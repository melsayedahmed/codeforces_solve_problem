// Link in codeforces
// https://codeforces.com/contest/236/problem/A

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        
        Set<Character> distinctChars = new HashSet<>();
        for (char c : username.toCharArray()) {
            distinctChars.add(c);
        }
        
        int distinctCount = distinctChars.size();
        if (distinctCount % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}