// Link in codeforces
// https://codeforces.com/contest/110/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int count = 0;
        
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '4' || number.charAt(i) == '7') {
                count++;
            }
        }
        
        if (count == 4 || count == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}