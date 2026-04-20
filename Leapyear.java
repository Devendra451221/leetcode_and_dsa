import java.util.*;
public class Leapyear {
public static void main(String[] args) {
    int y;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the year to check");
     y = sc.nextInt();
    if(y%400==0)
    {
        System.out.println("Leap Year");
    }
    else if(y%100==0)
    {
        System.out.println("Not leap Year");
    }
    else if (y%4==0) {
        System.out.println("Leap Year");
    }
    else
    {
        System.out.println("Not leap Year");
    }
}
    
}
