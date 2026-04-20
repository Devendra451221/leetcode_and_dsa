public class leetcode84 {
    
    // THIS HAS TIME COMPLEXITY : O(n) * O(n)  = O(n^2)  
     
    // int height(Treenode t){

    //     if(t==null){
    //         return 0;
    //     }

    //     int lh = height(t.l);
    //     int rh = height(t.r);

    //     return Math.max(lh, rh)+1;
    // }

    // boolean isBalacedBinaryTree(Treenode t){

    //     if(t==null){
    //         return true;
    //     }

      
    //     int lh = height(t.l);
    //     int rh = height(t.r);

    //     if(Math.abs(lh-rh)>1){
    //         return false;
    //     }

    //     boolean left = isBalacedBinaryTree(t.l);
    //     boolean right = isBalacedBinaryTree(t.r);  

    //     return left&&right;
    // }


    boolean balanceFactor = true;  // declare a class variable !!
    int height(Treenode t){
        if(t==null){
            return 0;
        }

        int lh = height(t.l);
        int rh = height(t.r);

        if(Math.abs(lh-rh) > 1){
            balanceFactor = false;  // agar upar kbhi tree me balance hua bhi to balanceFactor false hi rhega agar ek baar false ho gya to !!
        }

        return Math.max(lh, rh)+1;
    }

    boolean isBalacedBinaryTree(Treenode t){
        int height = height(t);   // just only to access balanceFactor 
        
        return balanceFactor;
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

        // Treenode t1=new Treenode(4);
        // Treenode t2=new Treenode(3);
        // Treenode t3=new Treenode(2);
        // Treenode t4=new Treenode(1);
        // Treenode t5=new Treenode(5);
        // Treenode t6=new Treenode(6);
        // Treenode t7=new Treenode(7);
        // t1.l=t2;   
        // t1.r=t5;
        // t5.r=t6;
        // t2.l=t3;
        // t6.r=t7;
        // t3.l=t4; 

        leetcode84 obj=new leetcode84();

        System.out.println("Is Balanced Binary Tree : "+obj.isBalacedBinaryTree(t1));

    } 
}