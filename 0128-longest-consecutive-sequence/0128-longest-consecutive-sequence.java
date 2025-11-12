class Solution {
    public int longestConsecutive(int[] nums) {
        int current, maxcount=0,count=1;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                 current=num;
                 count=1;
            
            while(set.contains(current+1)){
                current++;
                count++;
            }
            maxcount=Math.max(count,maxcount);
            }

        }
        return maxcount;
        
    }
}