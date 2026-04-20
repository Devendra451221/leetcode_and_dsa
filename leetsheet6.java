import java.util.Collections;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class leetsheet6 {
    
  int llss(String s){
    int count=0;
    if(s.isEmpty()){
       return count;
    }
    
    int l=0;
    int h=0;
    int curr=0;
    int max=0;
    HashMap<Character,Integer> hm=new HashMap<>();
    SortedMap<Integer,Integer> sm=new TreeMap<>(Collections.reverseOrder());
    while(h<s.length()){
 
      char ch=s.charAt(h);
      
      if(hm.containsKey(ch) && hm.get(ch) >= l){

        l=hm.get(ch)+1;
        hm.replace(ch, h);
        
      }else{
        hm.put(ch, h);
        
      }
      curr=h-l+1;
      h++;
 
      max=Math.max(max, curr);

    }
    return max;

    
  }
   public static void main(String[] args) { 

    String s="cadbzabcd";
    leetsheet6 obj=new leetsheet6();
    System.out.println("Longest consecutive substring without repeating characters : "+obj.llss(s));
  }
}
