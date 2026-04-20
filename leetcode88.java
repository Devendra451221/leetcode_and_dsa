public class leetcode88 {
    Treenode invertTree(Treenode t){
        if(t==null){
            return null;
        }

        Treenode left = invertTree(t.l);
        Treenode right = invertTree(t.r);

        t.l=right;
        t.r=left;

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

        leetcode88 obj=new leetcode88();
        System.out.println("Traverse before iverting :"); 
        obj.inorder(t1);
        Treenode t = obj.invertTree(t1);
        System.out.println("Traversing after inverting :");
        obj.inorder(t);
    }
    
}
