import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetsheet7 {

    String replaceWordsWithRoot(List<String> list,String sentence){
    
        if(list.isEmpty()){
            return sentence;
        }

        String[] words = sentence.split("\\s+");
        HashSet<String> rootsSet = new HashSet<>(list);
        StringBuilder result = new StringBuilder("");

        for(String word:words){

            String ans = "";
            for(int i=0;i<word.length();i++){
                String currans=word.substring(0, i);
                if(rootsSet.contains(currans)){
                   ans=currans;
                   break;
                }
            }
            if(result.length() > 0){
                result.append(" ");
            }
            result.append(ans.isEmpty() ? word : ans);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String sentence = "the cattle was rattled by the battery ";
        List<String> roots = List.of("cat","rat","bat","catt");

        leetsheet7 obj=new leetsheet7();
        System.out.println(obj.replaceWordsWithRoot(roots, sentence));
    }
}
