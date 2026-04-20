import java.util.Scanner;
public class leetcode3 {
    void febonaaci(int n)
    {
        int a=0,b=1,c,sum=0;
        System.out.println("The series is : ");
        for(int i=0;i<n;i++)
        {
            sum+=a;
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println();
        System.out.println("The sum upto "+n+"th term is : "+sum);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
        leetcode3 obj=new leetcode3();
        obj.febonaaci(n);
    }
}
