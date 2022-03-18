import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        // This is unsorted array
        Integer[] array = new Integer[] { 5,2,3,6,1,0};

        // Let's sort using quick sort
        quickSort( array, 0, array.length - 1 );

        // Verify sorted array
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(Integer[] arr, int low, int high)
    {
        //check for empty or null array
        if (arr == null || arr.length == 0){
            return;
        }

        if (low >= high){
            return;
        }


// 5,2,3,6,1,0
        //Get the pivot element from the middle of the list
      //  int middle = low + (high - low) / 2;
        int pivot = arr[high];
        int middle = high;

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j)
        {
            //Check until all values on left side array are lower than pivot
            while (arr[i] < pivot)
            {
                i++;
            }
            //Check until all values on left side array are greater than pivot
            while (arr[j] > pivot)
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swapping
            //After swapping move the iterator on both lists
            if (i <= j)
            {
                swap (arr, i, j);
                i++;
                j--;
            }
        }
        //Do same operation as above recursively to sort two sub arrays

            quickSort(arr, low, middle-1);

            quickSort(arr, middle+1, high);

    }

    public static void swap (Integer array[], int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}


