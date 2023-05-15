public class InsertionSort {
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                // Shift elements greater than the key to the right
                array[j + 1] = array[j];
                j = j - 1;
            }

            // Place the key at the correct position
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1};

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);

        System.out.println("Sorted Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}