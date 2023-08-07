// Link in codeforces
// https://codeforces.com/problemset/problem/208/A

import java.util.Scanner;

public class SongDecoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String remix = scanner.nextLine();
        scanner.close();

        // Replace "WUB" with a single space and trim any leading/trailing spaces
        String originalSong = remix.replaceAll("WUB", " ").trim();

        // Replace consecutive spaces with a single space
        originalSong = originalSong.replaceAll("\\s+", " ");

        System.out.println(originalSong);
    }
}