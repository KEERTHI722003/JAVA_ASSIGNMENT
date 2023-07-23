import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingularSocksCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of socks: ");
        int n = in.nextInt();
        int[] arrNum = new int[n];

        // Input sock IDs from the user
        System.out.println("Enter the sock IDs: ");
        for (int i = 0; i < n; i++) {
            arrNum[i] = in.nextInt();
        }

        Map<Integer, Integer> sockCounts = countSocks(arrNum);

        // Calculate and display the count of singular socks
        int singularCount = 0;
        for (int count : sockCounts.values()) {
            if (count % 2 != 0) {
                singularCount++;
            }
        }

        System.out.println("Count of singular socks = " + singularCount);
    }

    public static Map<Integer, Integer> countSocks(int[] arrNum) {
        Map<Integer, Integer> sockCounts = new HashMap<>();

        // Count the occurrences of each sock ID
        for (int sockID : arrNum) {
            sockCounts.put(sockID, sockCounts.getOrDefault(sockID, 0) + 1);
        }

        return sockCounts;
    }
}
