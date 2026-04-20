import java.util.ArrayList;
import java.util.List;

public class leetcode86 {
    // SBHI PATHS KE SUM KI LIST KE LIYE
    // List<Integer> pathSumList(Treenode t){
    //     List<Integer> list=new ArrayList<>();
    //     if(t==null){
    //         return list;
    //     }
    //     sum(t,0,list);
    //     return list;
    // }
    // void sum(Treenode t,int currSum,List<Integer> list){
    //     if(t==null){
    //         return;
    //     }
    //     else if(t.l==null && t.r==null){
    //         currSum+=t.dta;
    //         list.add(currSum);
    //         return;
    //     }

    //     currSum+=t.dta;

    //     sum(t.l, currSum, list);
    //     sum(t.r, currSum, list);

    // }

    boolean hasPathSum(Treenode t,int target){

        if(t==null){
           return false;
        }
        else if(t.l==null && t.r==null && target == t.dta){
           return true;
        }

        boolean ans1 = hasPathSum(t.l, target-t.dta);
        boolean ans2 = hasPathSum(t.r, target-t.dta);

        return ans1||ans2;
    }
    public static void main(String[] args) {
        Treenode t1=new Treenode(4);
        Treenode t2=new Treenode(3);
        Treenode t3=new Treenode(2);
        Treenode t4=new Treenode(10);
        Treenode t5=new Treenode(5);
        Treenode t6=new Treenode(12);
        //Treenode t7=new Treenode(7);
        t1.l=t2;   
        t1.r=t4;
        
        t2.l=t3;
 
        t4.l=t5;
        t4.r=t6;    

        leetcode86 obj = new leetcode86();
        System.out.println(obj.hasPathSum(t1,19));
        
    }
    
}
