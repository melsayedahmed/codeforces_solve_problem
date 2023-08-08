// Link in codeforces
// https://codeforces.com/contest/443/problem/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();  // Read the input string
        
        Set<Character> distinctChars = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {  // Check if the character is a letter
                distinctChars.add(c);    // Add the character to the set
            }
        }
        
        System.out.println(distinctChars.size());  // Print the count of distinct characters
    }
}