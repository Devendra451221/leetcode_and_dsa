import java.util.HashMap;

public class leetcode41 {
    int duplicateValue1(int a[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i])==false)
            {
                map.put(a[i],1);
            }
            else
            {
                map.put(a[i], map.get(a[i])+1);
            }
        }
        for(int i:map.keySet())
        {
            if(map.get(i)>1)
            {
                return i;
            }
        }
        return -1;
    }
    int duplicateValue2(int a[])
    {
        int n,ans=0;
        for(int i=0;i<a.length;i++)
        {
            n=Math.abs(a[i]);
            if(a[n]>0)
            {
                a[n]=-a[n];
            }
            else 
            {
                ans= n;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            a[i]=Math.abs(a[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int a[]={1,3,4,4,2};
        leetcode41 obj=new leetcode41();
        System.out.println(obj.duplicateValue1(a));
        System.out.println(obj.duplicateValue2(a));
    }
}
