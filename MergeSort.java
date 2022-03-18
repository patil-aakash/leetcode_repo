import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{6,1,7,3,9,2,0};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length-1);
       // System.out.println(Arrays.toString(array));
        System.out.print("Sorted Array --> ");
        printArray(array);

    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public void sort(int[] arr, int l, int r){
       if (l < r){

           int mid = l + (r-l)/2;

           sort(arr,l,mid);
           sort(arr,mid+1,r);

           merge(arr, l, mid, r);
       }
    }

    public void merge(int[] arr, int l, int mid, int r){
        int n1 = mid - l + 1;
        int n2 = r-mid;

        // create temp array left and right
        int[] left = new int[n1];
        int[] right = new int[n2];

        // copy data into sub array
        for (int i = 0; i < n1; i++){
            left[i] = arr[l+i];
        }
        for (int j = 0; j < n2; j++){
            right[j] = arr[mid+1+j];
        }

        int i = 0, j = 0;
        // Merge the temp arrays
        int k = l;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
              //  i++;
            } else {
                arr[k++] = right[j++];
            //    j++;
            }
            //k++;
        }
        // copy remaining

        while( i < n1){
            arr[k++] = left[i++];
           // i++;
           // k++;
        }
        while(j < n2){
            arr[k++] = right[j++];
//            j++;
//            k++;
        }

    }

}