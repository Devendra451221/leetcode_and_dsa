public class leetcode14 {
    void total(int []a,int []right)
    {
        int n=a.length,val=1;
       
        for(int i=n-1;i>=0;i--)
           {
             val=val*a[i];
             right[i]=val;
           }
         
    }
    void arr(int a[])
    {
       int right[]=new int[a.length];
     total(a,right);
     int l=1;
     int b[]=new int[a.length];
     for(int i=0;i<a.length-1;i++)
     {
        b[i]=right[i+1]*l;
        l*=a[i];
     }
     b[a.length-1]=l;
        System.out.println("Final : ");
        for(int x:b)
        {
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int a[]={-1,1,0,-3,3};
        leetcode14 obj=new leetcode14();
        obj.arr(a);
    }
    
}
