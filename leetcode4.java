import java.util.Scanner;
public class leetcode4 {
int TribonaaciSeries(int n)
{
    if(n==0)
    return 0;
    else if(n==1||n==2)
    return 1;
    else
       return TribonaaciSeries(n-3)+TribonaaciSeries(n-2)+TribonaaciSeries(n-1);
       
}    
public static void main(String[] args) {
    int m,sum=0,num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number : ");
    m=sc.nextInt();
    leetcode4 obj=new leetcode4();
    System.out.println("The Tribonacci series is : ");
    for(int i=0;i<m;i++)
    { num=obj.TribonaaciSeries(i);
        System.out.print(num+" ");
        sum=sum+num;
    }
    System.out.println();
    System.out.println("The sum : "+sum);
    
}
}
