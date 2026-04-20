import java.util.HashMap;
public class leetcode40 {
    int maxConsecutiveArr(int a[])
    {
        HashMap<Integer, Boolean>map=new HashMap<>(); 
        for(int i:a)
        {
            map.put(i, false);
        }   
        for(int j:map.keySet())
        {
            if(map.containsKey(j-1)==false)
            {
                map.replace(j,true);
            }
        }
        int max=0;
        int curr=0;
        for(int e:map.keySet())
        {
            if(map.get(e)==true)
            {
                curr=1;
                while (map.containsKey(e+curr)==true) {
                    curr++;
                }
            }
            max=Math.max(max, curr);
        }
        return max;

    }
    public static void main(String[] args) {
        int a[]={10,120,1,9,2,3,4,5};
        leetcode40 obj=new leetcode40();
        System.out.println(obj.maxConsecutiveArr(a));
    }
}
