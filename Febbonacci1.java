import java.util.*;
class Febbonacci1
{
    static int febb(int n)
    {
        int a=0,b=1,c,i=0;
        while(i<=n)
        {   c=a+b;
            System.out.print(a+" ");
            
            a=b;
            b=c;
            i++;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number upto print :");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        febb(n);
    }
}