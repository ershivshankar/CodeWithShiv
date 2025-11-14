class Solution {
    public int missingNumber(int[] nums) {
        //Arrays.sort(nums);
        int n=nums.length;
        int currsum=0;
        for(int i=0;i<nums.length;i++){
            currsum=currsum+nums[i];
        }
        int maxsum=(n*(n+1))/2;
        int miss=maxsum-currsum;
        return miss;

        
    }
}