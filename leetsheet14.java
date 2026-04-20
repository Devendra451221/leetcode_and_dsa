import java.util.HashMap;

public class leetsheet14 {
    int longestConsecutiveSequence(int a[]){
        if(a.length==0 || a.length==1){
            return a.length;
        }
        int max=0;
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            hm.put(a[i], false);
        }
        for(int key:hm.keySet()){
            if(!hm.containsKey(key-1)){
                hm.replace(key, true);
            }
        }
        for(int key:hm.keySet()){
           if(hm.get(key)){
            int curr=1;
             while (hm.containsKey(key+curr)) {
             curr++;
           }
           max = Math.max(curr,max);
           }
           
        }
        return max;
    }
    public static void main(String[] args) {
        leetsheet14 obj=new leetsheet14();
        int a[]={0,3,7,2,5,8,4,6,0,1};
        System.out.println(obj.longestConsecutiveSequence(a));
    }
    
}
