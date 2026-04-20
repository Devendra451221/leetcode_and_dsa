                      /*Calculate Power of a Number*/
import java.util.Scanner;
class Power 
{
    static int power(int n)
    {
        int pwr;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the power:");
        pwr = sc.nextInt();
        int result = 1,i;
        for(i=1;i<=pwr;i++)
        {

            result = result*n;
        }
        return result;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number :");
        n = sc.nextInt();
        System.out.println("\nThe result : "+power(n));
    }
}
