public class leetcode93 {
    // Treenode insertIntoBST(Treenode t,int dta){
    //     Treenode roott = t;
    //     Treenode prevt = null;
    //     while (t!=null){
    //             if(t.dta == dta){
    //                 return roott;
    //             }else if(t.dta > dta){
    //                 prevt = t;
    //                 t=t.l;
    //             }else if(t.dta < dta){
    //                 prevt = t;
    //                 t=t.r;
    //             }
    //         }
    //         // if t==null means position to insert found!!
    //         Treenode newt = new Treenode(dta);
    //         if(dta > prevt.dta){
    //             prevt.r = newt;
    //         }else{
    //             prevt.l = newt;
    //         }

    //         return roott;
    // }

    Treenode insertIntoBST(Treenode t,int dta){

        if(t==null){
            Treenode newt=new Treenode(dta);
            return newt;
        }

        if(t.dta > dta){
           t.l = insertIntoBST(t.l, dta);
        }else{
            t.r = insertIntoBST(t.r, dta);
            
        }

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
        //Treenode t5=new Treenode(3);
        Treenode t6=new Treenode(7);
        Treenode t7=new Treenode(5);
        t1.l=t2;   
        t1.r=t3;
        
        t2.l=t4;
        //t2.r=t5;
 
        t3.r=t6;
        t3.l=t7;

        leetcode93 obj =new leetcode93();
        System.out.println("Traversal before inserting : ");
        obj.inorder(t1);
        t1 = obj.insertIntoBST(t1, 3);
        System.out.println("\nTraversal after inserting : ");
        obj.inorder(t1);
     
    }
}
