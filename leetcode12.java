public class leetcode12 {
    void arrsqr(int a[])
    {
        int i,j,p;
        i=0;
        j=a.length-1;
        p=a.length-1;
        int b[]=new int[a.length];
        while(i<=j)
        {
            int s=a[i]*a[i];
            int e=a[j]*a[j];
            if(s>e)
            {
                b[p]=s;
                i++;
                p--;
            }
            else
            {
                b[p]=e;
                j--;
                p--;
            }
        }     
        for(int x:b)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={-6,-4,-2,1,7};
        leetcode12 obj=new leetcode12();
        obj.arrsqr(a);
    }
    
}
