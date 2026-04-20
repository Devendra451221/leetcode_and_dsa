import java.util.HashMap;

public class leetcode20 {
    int luckyNum(int a[])
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int n=a[i];
            if(map.containsKey(n))
            {
               map.put(n,map.get(n)+1);
            }
            else
            {
                map.put(n,1);
            }
        }
        int result=-1;
       for(int k:map.keySet())
       {
         if(k==map.get(k))
         {
            result=Math.max(k,result);
         }
       }
       return result;
    }
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,3};
        leetcode20 obj=new leetcode20();
        System.out.println(" lucky : "+obj.luckyNum(a));
    }
}
