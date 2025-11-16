class Solution {
    public int removeDuplicates(int[] arr) {
        int rd=0;
        for(int i=1;i<arr.length;i++){
            if(arr[rd]!=arr[i]){
                rd++;
                arr[rd]=arr[i];
            }
        }
        return rd+1;
        
    }
}