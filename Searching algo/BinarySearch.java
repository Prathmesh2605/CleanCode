class BinarySearch{

    public static int binarySearch(int[]inputArray, int target){
        int start = 0;
        int end = inputArray.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            //check if middle value is the target
            if(inputArray[mid] == target){
                return mid;
            }


            //check if target is greater than mid then ignore left half
            if(inputArray[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid - 1; //ignore right half
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int inputArray[] = { 2, 3, 4, 10, 40 };
        int length = inputArray.length;
        int target = 10;
        //call the binarySearch function and store the output in result
        int result = binarySearch(inputArray, target);

        if (result == -1){
            System.out.println("Element not found in the array");
        }
        else {
            System.out.println("Element is present at "
                    + "index " + result);
        }
    }
}
