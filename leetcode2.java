/*  if 2^4 = 16 then 16/2=8, 8/2=4, 4/2=2, 2/2 =1;
               & lets take 14 : 14/2= 7, 7/2= not one 
               */

import java.util.Scanner;
               public class leetcode2 {

   boolean powerof2(int n)
   {
  
     if(n<=0)
     {
       return false;
     }
     else 
     {
       while(n%2==0)
       {
        n=n/2;
       }
       if(n==1)
       {
         return true;
       }
       else
       {
         return false;
       }
     }
   }
   public static void main(String[] args) {
    int n;
    Scanner sc=new Scanner(System.in);
    leetcode2 obj=new leetcode2();
     System.out.println("Enter number : ");
     n=sc.nextInt();
     System.out.println("The number is power of 2 : "+obj.powerof2(n));
   }
}