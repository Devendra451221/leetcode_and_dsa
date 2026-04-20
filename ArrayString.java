/*         String Array printing in java using toString() , asList() and deepToString() methods. */

import java.util.*;
class ArrayString
{
  public static void main(String[] args) {
  
    String b[]={"Ram","Lakshaman","Hanuman"};
   int a[]={1,2,3};
    System.out.println("toString : "+Arrays.toString(b));
    System.out.println("toString : "+Arrays.toString(a));
    System.out.println("asList : "+Arrays.asList(b));
   
    int d[][]={{1,2},{3,4}};
    String s[][]={{"r","a"},{"m","a"}};
   
    System.out.println("deepToString : "+Arrays.deepToString(d));
    System.out.println("deepToString : "+Arrays.deepToString(s));
  }
}
