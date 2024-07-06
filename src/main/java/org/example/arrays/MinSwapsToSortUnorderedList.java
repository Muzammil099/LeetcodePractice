package org.example.arrays;

public class MinSwapsToSortUnorderedList {

    static int minimumSwaps(int[] arr) {

        int n = arr.length;
        int swaps = 0;

        // Create a visited array to track which elements have been swapped
        boolean[] visited = new boolean[n + 1];

        // Mark all elements as not visited
        for (int i = 0; i <= n; i++) {
            visited[i] = false;
        }

        // Iterate through the array elements
        for (int i = 0; i < n; i++) {
            // If the element is already in the correct position or visited, skip it
            if (visited[i] || arr[i] == i + 1) {
                continue;
            }

            // Find the cycle of swaps needed for the current element
            int cycleSize = 0;
            int x = i;
            while (!visited[x]) {
                visited[x] = true;
                x = arr[x] - 1;
                cycleSize++;
            }

            // Add the number of swaps for this cycle
            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        System.out.println(minimumSwaps(new int[]{7,1,3,2,4,5,6}));
    }
}
