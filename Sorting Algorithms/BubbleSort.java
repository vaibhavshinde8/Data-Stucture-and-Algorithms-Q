
// Bubble Sort Explanation
// Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process repeats until the entire list is sorted. The algorithm gets its name because smaller elements "bubble" to the top of the list with each pass.

// How Bubble Sort Works
// Compare the first two elements; if the first is greater than the second, swap them.

// Move to the next pair and repeat the process.

// Continue this for the entire list (this completes one full pass).

// Repeat the process for the remaining elements until no more swaps are needed.

// Example
// Let's sort the array [5, 3, 8, 4, 2] using Bubble Sort.

// Pass 1:
// Compare 5 and 3 → Swap → [3, 5, 8, 4, 2]

// Compare 5 and 8 → No swap → [3, 5, 8, 4, 2]

// Compare 8 and 4 → Swap → [3, 5, 4, 8, 2]

// Compare 8 and 2 → Swap → [3, 5, 4, 2, 8]

// Pass 2:
// Compare 3 and 5 → No swap → [3, 5, 4, 2, 8]

// Compare 5 and 4 → Swap → [3, 4, 5, 2, 8]

// Compare 5 and 2 → Swap → [3, 4, 2, 5, 8]

// Compare 5 and 8 → No swap → [3, 4, 2, 5, 8]

// Pass 3:
// Compare 3 and 4 → No swap → [3, 4, 2, 5, 8]

// Compare 4 and 2 → Swap → [3, 2, 4, 5, 8]

// Compare 4 and 5 → No swap → [3, 2, 4, 5, 8]

// Compare 5 and 8 → No swap → [3, 2, 4, 5, 8]

// Pass 4:
// Compare 3 and 2 → Swap → [2, 3, 4, 5, 8]

// Compare 3 and 4 → No swap → [2, 3, 4, 5, 8]

// Compare 4 and 5 → No swap → [2, 3, 4, 5, 8]

// Compare 5 and 8 → No swap → [2, 3, 4, 5, 8]

// Since no swaps are needed, the array is now sorted: [2, 3, 4, 5, 8].

// Time Complexity
// Best Case (Already Sorted): O(n)
// Worst Case (Reversed List): O(n²)
// Average Case: O(n²)

class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 7, 90 };
        Sort(arr);
        printArray(arr);
    }

    public static void Sort(int arr[]) {
        int n = arr.length;
        boolean isSorted=true;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted=false;

                }
            }
            if(!isSorted) break;
        }

    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}