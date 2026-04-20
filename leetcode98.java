public class leetcode98 {
    int ans = 0;
    int height(Treenode t){
        if(t==null){
            return 0;
        }

        int l = height(t.l);
        int r = height(t.r);

        return Math.max(l, r)+1;
    }
    int sumOfDeepestLeafNode(Treenode t){
        int height = height(t);
        helper(t, height);
        return ans;
    }
    void helper(Treenode t,int height){
        if(t==null){
            return;
        } 

        if(height==1){
            ans+=t.dta;
        }

        helper(t.l, height-1);
        helper(t.r, height-1);
    }
    public static void main(String[] args) {

    Treenode t1 = new Treenode(10);
    Treenode t2 = new Treenode(5);
    Treenode t3 = new Treenode(15);
    Treenode t4 = new Treenode(3);
    Treenode t5 = new Treenode(7);
    Treenode t6 = new Treenode(12);
    Treenode t7 = new Treenode(18);
    Treenode t8 = new Treenode(1);
    Treenode t11 = new Treenode(8);

    // level 1
    t1.l = t2;
    t1.r = t3;
    
    // level 2
    t2.l = t4;
    t2.r = t5;
    
    t3.l = t6;
    t3.r = t7;
    
    // level 3
    t4.l = t8;
    
    t5.r = t11;

    leetcode98 obj = new leetcode98();
    System.out.println("The sum of deepest leaf nodes : "+obj.sumOfDeepestLeafNode(t1));
   
    
}
    
}
