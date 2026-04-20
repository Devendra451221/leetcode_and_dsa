public class leetcode89{
    // 1. Diameter is longest path bw any two nodes
    // 2. It is not compulsary that it passes from the root node

    int diameter = 0;
    int diameterOfBinaryTree(Treenode t){
      if(t==null){
        return 0;
      }
      height(t);
      return diameter;
    }
    int height(Treenode t){
        if(t==null){
            return 0;
        }

        int left = height(t.l);
        int right = height(t.r);

        diameter = Math.max(diameter, (left+right));

        return Math.max(left, right)+1;
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
      
        leetcode89 obj = new leetcode89();
        System.out.println(obj.diameterOfBinaryTree(t1));
    
    }
    
}
