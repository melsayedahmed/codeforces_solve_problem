// Link in codeforces
// https://codeforces.com/contest/228/problem/A

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class HorseshoeColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int[] horseshoes = new int[4];
        for (int i = 0; i < 4; i++) {
            horseshoes[i] = sc.nextInt();
        }
 
        int distinctColors = countDistinctColors(horseshoes);
        int minHorseshoesNeeded = 4 - distinctColors;
        System.out.println(minHorseshoesNeeded);
 
        sc.close();
    }
 
    private static int countDistinctColors(int[] horseshoes) {
        Set<Integer> colorsSet = new HashSet<>();
        for (int horseshoe : horseshoes) {
            colorsSet.add(horseshoe);
        }
        return colorsSet.size();
    }
}