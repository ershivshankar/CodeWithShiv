class Solution {
    public boolean isHappy(int n) {
        int count=0;
        while(n!=1&&count<100){
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum=sum+(rem*rem);
                n=n/10;
            }
            n=sum;
            count++;
        }
    
    return n==1;
        
    }
}