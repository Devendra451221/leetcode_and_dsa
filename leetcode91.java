public class leetcode91 {
    
    Treenode mergeTwoBinaryTree(Treenode t1,Treenode t2){
     if(t1==null && t2==null){
        return null;
     }else if(t1==null){
        return t2;
     }else if(t2==null){
        return t1;
     }
     
     // if both are not null then ----->
     Treenode t = new Treenode(t1.dta+t2.dta);

     t.l = mergeTwoBinaryTree(t1.l, t2.l);
     t.r = mergeTwoBinaryTree(t1.r, t2.r);

     return t;
    }

    void inorder(Treenode t){
        if(t!=null){
            inorder(t.l);
            System.out.print(t.dta+" ");
            inorder(t.r);
        }
        return;
    }

    public static void main(String[] args) {
    
        Treenode t1=new Treenode(1);
        Treenode t2=new Treenode(2);
        Treenode t3=new Treenode(3);

        t2.l=t1;
        t2.r=t3;

        Treenode t11=new Treenode(6);
        Treenode t12=new Treenode(4);
        Treenode t13=new Treenode(9);
        Treenode t14=new Treenode(7);

        t12.l=t11;
        t12.r=t13;
        t13.r=t14;

      leetcode91 obj = new leetcode91();
      System.out.println("Tree 1 : ");
      obj.inorder(t2);
      System.out.println("\nTree 2 : ");
      obj.inorder(t12);

      Treenode t = obj.mergeTwoBinaryTree(t2, t12);
      System.out.println("\nMerged Tree  : ");
      obj.inorder(t);
    }
}
