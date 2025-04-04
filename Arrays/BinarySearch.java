package Arrays;
import java.util.*;

public class BinarySearch {
    
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] < key) {
                low = mid + 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                return mid; // Key found
            }
        }
        return -1; // Key not found
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the key to search:");
        int key = sc.nextInt();
        
        int result = binarySearch(arr, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        sc.close();
    }
}
