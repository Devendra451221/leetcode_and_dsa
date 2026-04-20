public class leetsheet9 {
    boolean isdeletedonecharacter = false;
    boolean isvalidpalindroneII(String s){
        if(s.isEmpty()){
            return true;
        }
        int l=0;
        int h=s.length()-1;
        
        return helper(s, l, h);
    }
    boolean helper(String s,int l,int h){
      if(h<=l){
        return true;
      }else if(s.charAt(l) == s.charAt(h)){
        return helper(s, l+1, h-1);
      }
   //   else if(s.charAt(l)!=s.charAt(h) && !isdeletedonecharacter){
    //   isdeletedonecharacter=!isdeletedonecharacter;
    //   boolean ans1=helper(s, l+1, h);
    //   boolean ans2=helper(s, l, h-1);
    //   return ans1||ans2;
    // }

      if(!isdeletedonecharacter){
        isdeletedonecharacter=!isdeletedonecharacter;
        boolean ans1 = helper(s, l+1, h);
        boolean ans2 = helper(s, l, h-1);
        return ans1||ans2;
      }
      return false;
    }
    public static void main(String[] args) {
        String s="rotatxxor";
        leetsheet9 obj=new leetsheet9();
        System.out.println(obj.isvalidpalindroneII(s));
    }
    
}
