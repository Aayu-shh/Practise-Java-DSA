package Array;

public class SortingAlgos {
    public static void main(String[] args) {
        int[] arr1 = {7,8,3,1,2};
        int[] bubbleSortedArr = bubbleSort(arr1);
        printArray(bubbleSortedArr);
        int[] selectionSortedArr = selectionSort(arr1);
        printArray(selectionSortedArr);
        int[] selectionSortedDescArr = selectionSortDesc(arr1);
        printArray(selectionSortedDescArr);
        int[] insertionSortedArray = insertionSort(new int[]{5,3,4,1,2});
        printArray(insertionSortedArray);
        int[] insertionSortedDescArray = insertionSortDesc(new int[]{5,3,4,1,2});
        printArray(insertionSortedDescArray);

        //Searching
        int n = 4;
        System.out.print("Number "+n+" found at index: "+binarySearch(insertionSortedArray,n)+" in ");
        printArray(insertionSortedArray);
    }
    private static int[] bubbleSort(int[] intArr){
        for(int i=0;i<intArr.length-1;i++){         // i: 0 to len-1 -1 => 0 to len-2 => 2nd Last elem
            for(int j=0;j< intArr.length-1-i;j++){      //j : 0 to len-2 - i ( 2nd part - last i+1 elements are sorted)
                if(intArr[j]>intArr[j+1]){
                    swap(intArr, j, j + 1);
                }
            }
        }
        return intArr;
    }

    private static int[] selectionSort(int [] intArr){
        //Select minimum in unsorted array -> Replace with outerloop var (i) => 1st part of array sorted
        for (int i=0;i<intArr.length;i++){
            int smallestIndex = i;
            for(int j=i+1;j<intArr.length;j++)
            {
                if(intArr[smallestIndex]>intArr[j]) smallestIndex=j;
            }
            if(smallestIndex!=i){
                //SWAP
                swap(intArr, smallestIndex, i);
            }
        }
        return intArr;
    }

    private static int[] selectionSortDesc(int[] arr){
        for(int i=0;i<arr.length;i++){
            int maxIn = i;
            for(int j=i+1;j< arr.length;j++){
                maxIn=arr[j]>arr[i]?j:maxIn;
            }
            if(maxIn!=i) swap(arr,maxIn,i);
        }
        return arr;
    }

    private static int[] insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
        return arr;
    }

    private static int[] insertionSortDesc(int[] arr){
        for(int i = 0; i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]>arr[j-1]) swap(arr,i,j);
            }
        }
        return arr;
    }

    private static int binarySearch(int[] arr, int elem) {
        //asuming arr is asending order sorted
        int start = 0;
        int end = arr.length - 1;

        while (end > start) {
            int mid = (start + end) / 2 +1;

            if (arr[mid] == elem)
                return mid;
            else if (arr[mid] > elem) //bigger to smaller L->R
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    // Utility Methods
    private static void swap(int[] intArr, int j, int i) {
        int tmp = intArr[j];
        intArr[j]= intArr[i];
        intArr[i] = tmp;
    }

    private static void printArray(int[] intArray){
        System.out.print("Your array: ");
        System.out.print("[");

        for(int i = 0; i<intArray.length; i++) {
            if(i != intArray.length-1) System.out.printf("%d,", intArray[i]);
            else System.out.printf("%d", intArray[i]);
        }

        System.out.println("]");
    }
}

