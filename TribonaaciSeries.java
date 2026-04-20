import java.util.*;
class TribonaaciSeries
{
    int febb(int n)
    {
        if(n==0)
        return 0;
        else if(n==1 || n==2)
        return 1;        
        else
        return febb(n-1)+febb(n-2)+febb(n-3);
    }
    public static void main(String[] args) {
       
        int n,a=0,b=1,c=1,d;
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
      TribonaaciSeries ts=new TribonaaciSeries();
       int i=0,m=n;
        while(i<n)
       {
         System.out.print(a+" ");
         d=a+b+c;
         a=b;
         b=c;
         c=d;
         i++;
       }
         
       System.out.println("Tribonnaci series by recursion : ");
        i=0;
       while(i<m)
       {
         System.out.print(ts.febb(i)+" ");
         i++;
       }
    

    }
}