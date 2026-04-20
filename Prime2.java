import java.util.*;
class Prime2
{
    static void printprime(int n1,int n2)
    {
       
        for(int i=n1;i<=n2;i++)
        {
            boolean isprime=true;
            if(i<=1){
            continue;
            }
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    isprime=false;
                    break;
                }
            }
           if(isprime)
           {
            System.out.print(i+" ");
           }
        }
    }
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Enter the range::>>");
        Scanner sc = new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        printprime(n1, n2);

    }
}