import java.util.ArrayList;
import java.util.List;

public class leetcode80 {
void postOrder(Treenode t){
    if(t!=null){
        postOrder(t.l);
        postOrder(t.r);
        System.out.print(t.dta+" ");
    }else{
        return;
    }
}

void traverse(Treenode t,List<Integer> list){
     if(t!=null){
      traverse(t.l, list);
      traverse(t.r, list);
      list.add(t.dta);
     }
     return;
}
public List<Integer> postOrderTraversal(Treenode t){
  List<Integer> list=new ArrayList<>();
  traverse(t, list);
  return list;
}
public static void main(String[] args) {
     Treenode t1=new Treenode(1);
        Treenode t2=new Treenode(2);
        Treenode t3=new Treenode(3);
        Treenode t4=new Treenode(4);
        Treenode t5=new Treenode(5);
        Treenode t6=new Treenode(6);
        Treenode t7=new Treenode(7);
        t1.l=t2;   
        t1.r=t3;
        
        t2.l=t4;
        t2.r=t5;
 
        t3.r=t6;
        t3.l=t7;
    
        leetcode80 obj=new leetcode80();
        System.out.println("Post Order : ");
        System.out.println(obj.postOrderTraversal(t1));
}    
}
