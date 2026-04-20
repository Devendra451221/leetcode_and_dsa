public class leetcode92 {
    Treenode prevt = null;
    boolean isBST(Treenode t){
      if(t==null){
        return true;
      }
      if(!isBST(t.l)){
        return false;
      }else if(prevt!=null && prevt.dta >= t.dta){
        return false;
      }
      prevt = t;
      return isBST(t.r); 
    }

    boolean searchBinaryTree(Treenode t,int target){
    
        if(t==null){
            return false;
        }
        if(target == t.dta){
          return true;
        }else if(target < t.dta){
          boolean left = searchBinaryTree(t.l, target);
          return left;
          
        }else{
          boolean right = searchBinaryTree(t.r, target);
          return right;
        }
        
    }

    Treenode searchItrBinaryTree(Treenode t,int target){
        while(t!=null){
         if(t.dta == target){
            return t;
         }else if(t.dta > target){
            t = t.l;
         }else if(t.dta < target){
            t = t.r;
         }
        }
         return null;
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
        leetcode92 obj = new leetcode92();
        System.out.println("Is tree a BST : "+obj.isBST(t1));
        System.out.println("Is node found : "+obj.searchBinaryTree(t1,1));
        System.out.println("Is node found : "+obj.searchItrBinaryTree(t1, 1).dta);
        
    }
    
}
