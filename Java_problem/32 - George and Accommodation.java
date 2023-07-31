// Link in codeforces
// https://codeforces.com/contest/467/problem/A

import java.util.Scanner;
 
public class HotelRooms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int n = scanner.nextInt(); // Number of rooms
        int count = 0; // Counter for rooms that are not full
 
        for (int i = 0; i < n; i++) {
            int occupants = scanner.nextInt(); // Number of occupants
            int capacity = scanner.nextInt(); // Maximum room capacity
 
            if (capacity - occupants >= 2) {
                // If the difference between capacity and occupants is at least 2, the room is not full
                count++;
            }
        }
 
        scanner.close();
 
        System.out.println(count);
    }
}