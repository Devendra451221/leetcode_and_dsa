import java.util.ArrayList;

public class leetcode99 {
    int sum=0;
    Treenode bstTogst(Treenode t){
       inorder(t);
       return t; 
    }
    void inorder(Treenode t){
        if(t!=null){
          inorder(t.r);
          sum+=t.dta;
          t.dta = sum;
          inorder(t.l);
        }
        return;
    }
    void helper(Treenode t){
         if(t!=null){
          helper(t.l);
          System.out.print(t.dta+" ");
          helper(t.r);
        }
        return;
    }
    void inorder(Treenode t,ArrayList<Integer> list){
      if(t!=null){
        inorder(t.l,list);
        list.add(t.dta);
        inorder(t.r,list);
      }
      return;
    }
    public static void main(String[] args) {
        Treenode t1=new Treenode(4);
        Treenode t2=new Treenode(2);
        Treenode t3=new Treenode(6);
        Treenode t4=new Treenode(1);
        Treenode t5=new Treenode(3);
        Treenode t6=new Treenode(7);
        Treenode t7=new Treenode(5);
        t1.l=t2;   
        t1.r=t3;
        
        t2.l=t4;
        t2.r=t5;
 
        t3.r=t6;
        t3.l=t7;
        
        leetcode99 obj = new leetcode99();
        System.out.println("Initial Tree : ");
        obj.helper(t1);
        Treenode t = obj.bstTogst(t1);
        System.out.println("\nTHE GREATER SUM TREE : ");
        obj.helper(t);
    }
}
