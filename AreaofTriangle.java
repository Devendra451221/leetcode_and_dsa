import java.util.Scanner;
class AreaofTriangle {
 
    static void area(int a,int b,int c)
    {
        double sp = (a+b+c)/2;
        double area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("The area is "+area);
    }
    public static void main(String[] args) {
        int a,b,c;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        area(a,b,c);
    }
}
