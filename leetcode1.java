import java.util.HashMap;

public class leetcode1 {
    
  int[] ts(int a[],int t){
    
    int ans[]=new int[2];

    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<a.length;i++){ 
      int complement = t-a[i];
      if(hm.containsKey(complement)){
        ans[0] = hm.get(complement);
        ans[1] = i;
        return ans;
      }
      hm.put(a[i], i);
    }

    return ans;
  } 
    public static void main(String[] args) {
        int a[]={2,7,11,15};
        leetcode1 obj=new leetcode1();
        for(int i:obj.ts(a, 9)){
            System.out.print(i+" ");
        }
    }
    
}
