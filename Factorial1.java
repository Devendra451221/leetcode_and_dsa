import java.util.*;
public class Factorial1 {
    static int factor(int n)
    {
        int f=1;
        while(n>1)
        {
            f=f*n;
            n--;
        }
        return f;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number::");
        n=sc.nextInt();
        System.out.println("The factorial : "+factor(n));
    }
}
