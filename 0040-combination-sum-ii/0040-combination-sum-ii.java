class Solution {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer>curr=new ArrayList<>();
        recur(candidates,target,0,result,curr);
        return result;
        
    }
    public static void recur(int []candidates,int target,int index,List<List<Integer>>result,List<Integer>curr){
       
            if(target==0){
                result.add(new ArrayList<Integer>(curr));

            
            return ;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1])continue;
            if(candidates[i]<=target){
                curr.add(candidates[i]);
                recur(candidates,target-candidates[i],i+1,result,curr);
                 curr.remove(curr.size()-1);
            }
        }
    }
}