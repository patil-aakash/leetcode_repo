public class BuildArrayFromPermutation_1920 {
    public int [] buildArray ( int[] nums) {
        int[] ans = new int[nums.length];
        int temp=0;
        for( int i=0; i <nums.length; i++){
            temp = nums[i];
            ans[i] = nums[temp];
        }
        return ans;
    }
}
