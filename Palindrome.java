import java.util.*;
public class Palindrome {
    static void palindrome(int n)
    {
        int r,sum=0,num=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==num)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("non Palindrome");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :::>");
        n=sc.nextInt();
        palindrome(n);
    }
}
