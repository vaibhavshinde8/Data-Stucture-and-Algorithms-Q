// How Insertion Sort Works (Step-by-Step)
// Assume the first element is already sorted.

// Pick the next element from the unsorted part.

// Compare it with elements in the sorted part (left side).

// Shift elements in the sorted part to the right if they are greater than the picked element.

// Insert the picked element at the correct position.

// Repeat until all elements are sorted.

// Example: Sorting [5, 3, 8, 4, 2] Using Insertion Sort
// Initial State:
// mathematica
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//  5          |  3  8  4  2
// Pass 1: Insert 3 in the correct position.
// Compare 3 with 5, shift 5 right.

// Insert 3 in its place.

// mathematica
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//  3  5       |  8  4  2
// Pass 2: Insert 8 in the correct position.
// 8 is already greater than 5, so no shift needed.

// mathematica
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//  3  5  8    |  4  2
// Pass 3: Insert 4 in the correct position.
// Compare 4 with 8 → shift 8 right.

// Compare 4 with 5 → shift 5 right.

// Insert 4 in its place.

// mathematica
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//  3  4  5  8 |  2
// Pass 4: Insert 2 in the correct position.
// Compare 2 with 8 → shift 8 right.

// Compare 2 with 5 → shift 5 right.

// Compare 2 with 4 → shift 4 right.

// Compare 2 with 3 → shift 3 right.

// Insert 2 in its place.

// mathematica
// Copy
// Edit
// Sorted Part  |  Unsorted Part
// -------------|--------------
//  2  3  4  5  8
// 🎉 The array is now sorted: [2, 3, 4, 5, 8].

// Time Complexity
// Case	Time Complexity
// Best Case	O(n) (Already sorted)
// Worst Case	O(n²) (Reversed order)
// Average Case	O(n²)

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 7, 90 };
        Sort(arr);
        printArray(arr);
    }

    public static void Sort(int arr[]) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Pick the element to insert
            int j = i - 1;

            // Shift elements of the sorted part to make space
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the element at the correct position
            arr[j + 1] = key;
        }

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
