import java.util.ArrayList;
import java.util.List;

public class Recursion {
    static void show(List<?> list,int idx){
  if(idx==list.size()){
    return;
  }
  System.out.print(list.get(idx)+" ");
  show(list, idx+1);
}
  public static void main(String[] args) {
     List<Character> l1=new ArrayList<>();
     l1.add('a');
     l1.add('b');
     l1.add('c');
     List<Integer> l2=new ArrayList<>();
     l2.add(1);
     l2.add(2);
     l2.add(3);
     show(l1, 0);
     System.out.println();
     show(l2, 0);
    }
}
