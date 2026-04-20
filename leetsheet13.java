import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class leetsheet13 {
    // this can also be done by using sorted string Arrays.sort(str);
    String frequencyString(String s){
      if(s.isEmpty()){
        return null;
      }
      int frequency[]=new int[26];
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int idx=ch-97; // or ch-'a';
        frequency[idx]+=1;
      }
      StringBuilder sb=new StringBuilder("");
      char ch='a';
      for(int i=0;i<frequency.length;i++){
        if(frequency[i] > 0){
          sb.append(ch+"");
          sb.append(frequency[i]+"");
        }
        ch++;
      }
      return sb.toString();
    }
    List<List<String>> groupAanagrams(String str[]){
        List<List<String>> answer = new ArrayList<>();
        if(str.length==0){
            return answer;
        }
        HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<str.length;i++){
          String frequencyStr=frequencyString(str[i]);
          
          if(hm.containsKey(frequencyStr)){
            hm.get(frequencyStr).add(str[i]);
           // hm.replace(frequencyStr, hm.get(frequencyStr)); no need !!!
          }else{
            List<String> list=new ArrayList<>();
            list.add(str[i]);
            hm.put(frequencyStr, list);
          }
        }

        answer.addAll(hm.values());
        return answer;
    }
    public static void main(String[] args) {
     String strings1[]={"eat","tea","tan","ate","nat","bat"};
     String strings2[]={""};
     String strings3[]={"aab","aba","baa","abbccc"};

     leetsheet13 obj=new leetsheet13();
     System.out.println(obj.groupAanagrams(strings3));
     
    }
}
