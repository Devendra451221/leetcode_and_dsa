public class leetcode11 {
    int result(int a[],int n)
    {  
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=n)
            {
                a[k]=a[i];
                k++;
            }
        }  
             return k;
             
    }
    public static void main(String[] args) {
        int a[]={0,1,2,1,4};
        int n=1;
        leetcode11 obj=new leetcode11();
        //obj.result(a, n);
        System.out.println("Result : "+obj.result(a, n));
    }
}
