import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is found
            if (sortedArray[mid] == target) {
                return mid; // Found
            }
            // Decide which half to search
            if (sortedArray[mid] < target) {
                left = mid + 1; // Look in the right half
            } else {
                right = mid - 1; // Look in the left half
            }
        }
        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sorted array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] sortedArray = new int[size];

        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < size; i++) {
            sortedArray[i] = scanner.nextInt();
        }

        // Input the target value
        System.out.println("Enter the target value to search:");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(sortedArray, target);

        // Print the result
        if (result == -1) {
            System.out.println("Target value not found.");
        } else {
            System.out.println("Target value found at index: " + result);
        }

        scanner.close();
    }
}
