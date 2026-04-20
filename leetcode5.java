import java.util.Scanner;

public class leetcode5 {
    void bottles(int bottle,int exchange)
    {
        int sum=bottle;
        int remained;
        int newbottle;

        while(bottle>=exchange)
        {
          newbottle=bottle/exchange;
          remained=bottle%exchange;
          
          sum+=newbottle;
          bottle=newbottle+remained;
        }
        System.out.println("The maximum bottles can be drinked : "+sum);

    }
    public static void main(String[] args) {
        int filled;
        int exchange;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the filled bottles you have : ");
        filled = sc.nextInt();
        System.out.println("Enter the exchange range : ");
        exchange = sc.nextInt();
        leetcode5 obj=new leetcode5();
        obj.bottles(filled, exchange); 
    }
}
