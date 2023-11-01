class Solution {
    public int removeElement(int[] nums, int val) {
      int i = 0, j=0;
        int n = nums.length;
        while(i < n){
             if(nums[i]  != val) {
                  nums[j] = nums[i];
                  j++ ;
                  i++;

                  }
             else{
                 i++;
             }
        }
         return j;
    }
}