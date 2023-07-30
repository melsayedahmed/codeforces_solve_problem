// Link in codeforces
// https://codeforces.com/contest/158/problem/A

import java.util.Scanner;
 
public class NextRound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt(); // Total number of participants
        int k = scanner.nextInt(); // Position of the k-th participant
 
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt(); // Scores of participants
        }
 
        int kthParticipantScore = scores[k - 1]; // Score of the k-th participant
        int advancingParticipants = 0;
 
        for (int i = 0; i < n; i++) {
            // Check if the participant's score is greater than 0 and greater than or equal to kthParticipantScore
            if (scores[i] > 0 && scores[i] >= kthParticipantScore) {
                advancingParticipants++;
            }
        }
 
        System.out.println(advancingParticipants);
 
        scanner.close();
    }
}