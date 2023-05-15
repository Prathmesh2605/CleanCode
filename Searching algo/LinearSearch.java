public class LinearSearch {
    public static int linearSearch(int inputArray[], int target)
    {
        int arrLength = inputArray.length;
        for (int i = 0; i < arrLength; i++) {
            if (inputArray[i] == target)
                return i;
        }
        return -1; //return -1 if not found
    }


    public static void main(String args[])
    {
        int inputArray[] = { 2, 3, 4, 10, 40 };
        int target = 10;

        // Call linearSearch function and store it in ‘result’
        int result = linearSearch(inputArray, target);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index "
                    + result);
    }
}
