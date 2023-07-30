// Link in codeforces
// https://codeforces.com/contest/263/problem/A

import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int targetRow = 0, targetCol = 0;
        
        // Read the input matrix
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    targetRow = i;
                    targetCol = j;
                }
            }
        }
        
        // Calculate the minimum number of moves
        int moves = Math.abs(targetRow - 2) + Math.abs(targetCol - 2);
        System.out.println(moves);
    }
}