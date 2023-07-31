// Link in codeforces
// https://codeforces.com/contest/266/problem/B

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after reading t
        
        String queue = scanner.nextLine();
        char[] queueArray = queue.toCharArray();
 
        while (t > 0) {
            for (int i = 0; i < n - 1; i++) {
                if (queueArray[i] == 'B' && queueArray[i + 1] == 'G') {
                    // Swap the positions of 'B' and 'G'
                    queueArray[i] = 'G';
                    queueArray[i + 1] = 'B';
                    i++; // Skip the next element as it is already processed
                }
            }
            t--;
        }
 
        System.out.println(new String(queueArray));
    }
}