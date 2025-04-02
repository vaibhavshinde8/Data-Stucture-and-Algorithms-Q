// Selection Sort Explanation (Step by Step with Assumptions)
// Selection Sort works by dividing the array into two parts:

// Sorted part (Initially empty or contains only one element).

// Unsorted part (Initially contains the entire array except the first element).

// Step-by-Step Working of Selection Sort
// Start with an assumption:

// The leftmost part of the array is the sorted section (starts with just the first element).

// The remaining elements form the unsorted section.

// Find the Minimum Element:

// Use a loop to find the smallest element in the unsorted part of the array.

// Swap:

// Swap this smallest element with the first element of the unsorted part.

// Now, this smallest element is placed in the correct position in the sorted part.

// Move Boundary of Sorted Part:

// Increase the size of the sorted part by moving the boundary one step to the right.

// Decrease the size of the unsorted part.

// Repeat the Process:

// Continue until the entire array is sorted.

// Example: Sorting [5, 3, 8, 4, 2]
// Initial State:
// markdown
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//             |  5  3  8  4  2
// Pass 1:
// Find the smallest element in [5, 3, 8, 4, 2] → 2.

// Swap 2 with 5.

// mathematica
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//  2          |  3  8  4  5
// Pass 2:
// Find the smallest element in [3, 8, 4, 5] → 3.

// Swap 3 with 3 (no change).

// mathematica
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//  2  3       |  8  4  5
// Pass 3:
// Find the smallest element in [8, 4, 5] → 4.

// Swap 4 with 8.

// mathematica
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//  2  3  4    |  8  5
// Pass 4:
// Find the smallest element in [8, 5] → 5.

// Swap 5 with 8.

// mathematica
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//  2  3  4  5 |  8
// Now the array is fully sorted: [2, 3, 4, 5, 8]. 🎉


// Time Complexity
// Case	Time Complexity
// Best Case	O(n²)
// Worst Case	O(n²)
// Average Case	O(n²)
// ✅ Works Well for Small Data Sets
// ✅ Simple & Easy to Understand
// ❌ Inefficient for Large Data Sets

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 7, 90 };
        Sort(arr);
        printArray(arr);
    }

    public static void Sort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
