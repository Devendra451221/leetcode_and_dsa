               /* ARMSTRONG = 153;
                 1^3 + 5^3 + 3^3 = 153 */

import java.util.*;
public class Armstrong {
    static void armstrong(int n)
    {
        int sum=0,r;
        int num = n;
        while(n!=0)
        {
          r=n%10;
          sum=sum+r*r*r;
          n=n/10;
        }
        if(sum==num)
        {
             System.out.println("ARMSTRONG");
        }
        else
        {
            System.out.println("NON-ARMSTRONG");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number ::>>");
        n=sc.nextInt();
        armstrong(n);

    }
}
