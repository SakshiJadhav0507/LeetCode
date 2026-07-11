class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
            int current=nums[i];
            int pre=i-1;
            while(pre>=0 && nums[pre]>current)
            {
              
              nums[pre+1]=nums[pre];
              pre--;
            }
            nums[pre+1]=current;
           
           
        }
 return nums;
        
    }
}