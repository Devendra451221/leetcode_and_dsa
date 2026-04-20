public class leetcode95 {
    // Treenode prev = null;
    // boolean isBST(Treenode t){
    //   if(t==null){
    //     return true;
    //   }
    //   if(!isBST(t.l)){
    //     return false;
    //   }else if(prev!=null && prev.dta >= t.dta){
    //     return false;
    //   }
    //   prev = t;
    //   return isBST(t.r);
    // }

    boolean isBST(Treenode t){
      return helper(t, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    boolean helper(Treenode t,long min,long max){
        if(t==null){
            return true;
        }

        if(t.dta <= min || t.dta >= max){
            return false;
        }
        boolean left = helper(t.l, min, t.dta);
        boolean right = helper(t.r, t.dta, max);

        return left&&right;
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

        leetcode95 obj =new leetcode95();
        System.out.println("Is the tree BST : "+obj.isBST(t1));
    }
}
