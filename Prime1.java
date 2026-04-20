import java.util.*;
class Prime1
{
    static boolean prime(int n)
    {
        boolean p=false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                p=true;
                break;
            }
        }
        return p;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number to check :");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(prime(n)==false)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Non Prime");
        }
    }
}