public class Sort_Colors_75M {
    /**
     * This program works on dutch national flag algorithm
     * we declare three pointers low, mid pointing to start and high pointing to end of array
     * All elements to left of low are 0's, and to the right of high are 2's
     * we traverse until mid crosses high
     * if mid == 0, we swap mid and low
     * if mid == 1, we increment mid
     * if mid == 2, we swap mid and high, but decrement only high
     * @param nums
     */
    public void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length-1;
        int temp = 0;
        while(mid <= high){
            switch(nums[mid]){
                case 0:
                {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;
                }
            }
        }

    }
}
