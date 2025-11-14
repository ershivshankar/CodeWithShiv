class Solution {
    public static boolean isvalid(String s, int start,int end){
        String sh=s.substring(start,end);
        for(int i=0;i<sh.length()/2;i++){
            if(sh.charAt(i)!=sh.charAt(sh.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static String longestPalindrome(String s){
        int maxlength=0,length=0,start=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isvalid(s,i,j+1)){
                    length=j-i+1;
                    if(maxlength<length){
                        maxlength=length;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start,start+maxlength);
    }
    public static void main(String [] args){
        String s="babad";
        System.out.println(longestPalindrome(s));
    }

}

