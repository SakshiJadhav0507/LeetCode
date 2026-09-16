class Solution {
    public int dominantIndex(int[] nums) {
        int large=-1;
               int secondlarge=-1;
               int ans=0;
        for(int i=0; i<nums.length; i++)
        {
              
            if(large<nums[i])
            { 
             secondlarge=large;
             large=nums[i];
             ans=i;
            }else if(secondlarge<nums[i])
            {
                secondlarge=nums[i];
            }
            
        }
        if(secondlarge*2<=large)
            {
                return ans;
            }
            else
            {
                return -1;
            }
        
    }
}
