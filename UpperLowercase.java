import java.util.*;
public class UpperLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch,ch2;
        System.out.println("Enter the character :");
        ch = sc.next().charAt(0);
       if(ch>='A'&&ch<='Z')
       {
          ch2 = Character.toLowerCase(ch);
         System.out.println("Lowercase : "+ch2);
         
        
       }
       else if(ch>='a'&&ch<='z')
       {
        ch2 = Character.toUpperCase(ch);
        System.out.println("Uppercase : "+ch2);
       }
       else
       {
         System.out.println("Enter the Valid input");
       }
    }
}
