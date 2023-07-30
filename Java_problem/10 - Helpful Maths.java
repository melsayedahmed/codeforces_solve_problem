// Link in codeforces
// https://codeforces.com/contest/339/problem/A

import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = helpfulMaths(input);
        System.out.println(result);
        sc.close();
    }
 
    public static String helpfulMaths(String input) {
        StringBuilder sb = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
 
        // Extract the digits from the input string
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                int num = Character.getNumericValue(ch);
                nums.add(num);
            }
        }
 
        // Sort the digits in non-decreasing order
        Collections.sort(nums);
 
        // Build the resulting string with '+' operator
        for (int i = 0; i < nums.size(); i++) {
            sb.append(nums.get(i));
            if (i != nums.size() - 1) {
                sb.append('+');
            }
        }
 
        return sb.toString();
    }
}