public class leetcode34 {
    int[] plusone(int a[])
    {
        int n=a.length;
        if(a[n-1]!=9)
        {
            a[n-1]+=1;
            return a;
        }
        else
        {
            a[n-1]=0;
            for(int i=n-2;i>=0;i--)
            {
                if(a[i]!=9)
                {
                    a[i]+=1;
                    return a;
                }
                a[i]=0;
            }
            int newa[]=new int[n+1];
            newa[0]=1;
            return newa;
        }
    }
    public static void main(String[] args) {
        int a[]={9,9,9};
        leetcode34 obj=new leetcode34();
        for(int i:obj.plusone(a))
        {
            System.out.print(i+" ");
        }
    }
}
