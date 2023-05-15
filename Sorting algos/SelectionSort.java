public class SelectionSort {
    public void sort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            // Find the index of the minimum element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first unsorted element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1};

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);

        System.out.println("Sorted Array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
