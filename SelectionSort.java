public class SelectionSort {
    //{4,1,9,2,3,6,0}
    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            int min = i;
            for (int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                swap(arr,min,i);
            }
        }
    }

    public void swap(int[] arr,int min, int i){
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,1,9,2,3,6,0};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
