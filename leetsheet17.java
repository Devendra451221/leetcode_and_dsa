public class leetsheet17 {

    int maximumDepth(Treenode t){
        if(t==null){
            return 0;
        }
        return helper(t);
    }
    int helper(Treenode t){
        if(t==null){
            return 0;
        }
        int l=helper(t.l);
        int r=helper(t.r);

        return Math.max(l,r)+1;
    }
    public static void main(String[] args) {
        Treenode t1=new Treenode(1);
        Treenode t2=new Treenode(2);
        Treenode t3=new Treenode(3);
        Treenode t4=new Treenode(4);
        Treenode t5=new Treenode(5);
        Treenode t6=new Treenode(6);
        Treenode t7=new Treenode(7);
        t1.l=t2;   
        t1.r=t3;
        
        t2.l=t4;
        t2.r=t5;
 
        t3.r=t6;
        t3.l=t7;

        leetsheet17 obj=new leetsheet17();
        System.out.println("Maximum depth : "+obj.maximumDepth(t1));
    }
}
