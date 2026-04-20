import java.util.HashMap;

public class leetsheet11 {
    boolean isValidAanagram(String s1,String s2){
        if(s1.isEmpty() && s2.isEmpty()){
            return true;
        }else if(s1.length()!=s2.length()){
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s1.toCharArray()){
            if(hm.containsKey(ch)){
                hm.replace(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }

        for(char ch:s2.toCharArray()){
            if(hm.containsKey(ch)){
                hm.replace(ch, hm.get(ch)-1);
            }else{
                return false;
            }
        }
        for(Integer cnt:hm.values()){
            if(cnt!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="aab";
        String str2="ab";
        leetsheet11 obj=new leetsheet11();
        System.out.println(obj.isValidAanagram(str1, str2));
    }
}
