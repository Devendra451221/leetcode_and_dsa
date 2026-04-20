import java.util.*;
public class Reversenumber {
     int reverse(int n)
    {
        int r,sum=0,add=0;
        while(n!=0)
        {
          r=n%10;
          sum=sum*10+r;
          add=add+r;
          n=n/10;

          //System.out.print(r);
        }
        return sum;
    }
    int count(int n)
    {   int c=0;
        while(n!=0)
        {
            n/=10;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Reversenumber d = new Reversenumber();
        System.out.println("Enter the number::>>");
        n=sc.nextInt();
        System.out.println("\nThe number of digits : : : >> "+d.count(n));
       int sum = d.reverse(n); 
       System.out.println("The number in reverse is : "+sum);

    }
}
