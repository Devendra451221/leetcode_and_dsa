public class leetsheet8 {
    
    boolean wildcardMatch(String str,String pattern){
      return helper(str, pattern, str.length()-1, pattern.length()-1);
    }
    boolean helper(String str,String pattern,int i,int j){
      //base case
       if(i<0 && j<0){
        return true;
       }else if(i>=0 && j<0){
        return false;
       }else if(j>=0 && i<0){
         for(int k=0;k<=j;k++){
            if(pattern.charAt(k)!='*'){
                return false;
            }
         }
         return true;
       }
      // matching conditions
      
      if(str.charAt(i)==pattern.charAt(j)){
        return helper(str, pattern, i-1, j-1);
      }else if((pattern.charAt(j)=='?')){
        return helper(str, pattern, i-1, j-1);
      }else if((pattern.charAt(j)=='*')){
        boolean ans1 = helper(str, pattern, i, j-1);
        boolean ans2 = helper(str, pattern, i-1, j);

        return ans1||ans2;
      }else{
        return false;           // when str.chatAt(i) != pattern.chatAt(j) 
      }
    }
    public static void main(String[] args) {
 
     String str="abcde";
     String pattern="**a*d?";
     leetsheet8 obj=new leetsheet8();   
     
     System.out.println("Is Wildcard Pattern matched : "+obj.wildcardMatch(str, pattern));

    }
}
