import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class QUESTION2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many elements you want in an array : ");
        int n=in.nextInt();
        int[] list=new int[n];
        System.out.println("Enter the elements of the array (sorted in ascending order): ");
        for (int i = 0; i < n; i++) {
            list[i] = in.nextInt();
        }

        List<Integer> missingNumbers = findMissingNumbers(list);

        // Display the missing numbers
        System.out.println("Missing numbers in the array:");
        for (int num : missingNumbers) {
            System.out.print(num + " ");
        }
    }

    public static List<Integer> findMissingNumbers(int[] arr) {
        List<Integer> missingNumbers = new ArrayList<>();
        int expectedNumber = 1;
        for (int num : arr) {
            while (num > expectedNumber) {
                missingNumbers.add(expectedNumber);
                expectedNumber++;
            }

            if (num == expectedNumber) {
                expectedNumber++;
            }
        }

        // Add any remaining missing numbers after the last element
        while (expectedNumber <= arr[arr.length - 1]) {
            missingNumbers.add(expectedNumber);
            expectedNumber++;
        }

        return missingNumbers;





    }
}
