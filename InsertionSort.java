public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,40,15,20,50,44};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
    }

    // {2,15,40,20,50,44}
    public void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}