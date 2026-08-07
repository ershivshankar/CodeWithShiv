class Solution {
    HashMap<Character,Integer>charcount=new HashMap<>();
    private int compareChar(char a,char b){
        if(charcount.get(a).equals(charcount.get(b))){
            return a-b;
        }
        return charcount.get(b)-charcount.get(a);
    }
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        PriorityQueue<Character>minheap= new PriorityQueue<>((a,b)->compareChar(a,b));
        for(char c:s.toCharArray()){
            charcount.put(c,charcount.getOrDefault(c,0)+1);
            
        }
        for(char c:charcount.keySet()){
            minheap.add(c);
        }
        while(!minheap.isEmpty()){
             char ch=minheap.poll();
             int count=charcount.get(ch);
             for(int i=0;i<count;i++){
                sb.append(ch);
                
             }
        }
        return sb.toString();
        
    }
}