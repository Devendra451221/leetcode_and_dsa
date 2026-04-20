public class leetcode79 {

    boolean check(Treenode t1,Treenode t2){
        if(t1==null || t2==null){
            return t1==t2;
        }
        if(t1.dta == t2.dta){

            boolean ans1 = check(t1.l, t2.r);
            boolean ans2 = check(t1.r, t2.l);
            return ans1 && ans2;
        }else{
            return false;
        }
    }
    boolean isSymmetric(Treenode t){
        if(t==null){
            return true;
        }
        return check(t.l, t.r);
    }
    public static void main(String[] args) {
        Treenode t1=new Treenode(1);
        Treenode t2=new Treenode(1);
        Treenode t3=new Treenode(1);
        Treenode t4=new Treenode(1);
        Treenode t5=new Treenode(1);
        Treenode t6=new Treenode(1);
        Treenode t7=new Treenode(1);
        t1.l=t2;   
        t1.r=t3;
        
        t2.l=t4;
        t2.r=t5;
 
        t3.r=t6;
        t3.l=t7;

        leetcode79 obj = new leetcode79();
        System.out.println("Is Symmetric : "+obj.isSymmetric(t1));
    }
    
}
