import java.util.ArrayList;
import java.util.List;

public class leetcode82 {


    List<String> binaryTreePaths(Treenode t){
        List<String> ans = new ArrayList<>();
        
        if(t==null){
            return ans;
        }
        else if(t.l == null && t.r == null){
            ans.add(""+t.dta);
            return ans;
        }

        List<String> left = binaryTreePaths(t.l);
        List<String> right = binaryTreePaths(t.r);

        for(String i : left){
            ans.add(t.dta+" -> "+i);
        }
        for(String j : right){
            ans.add(t.dta+" -> "+j);
        }
    
        return ans;
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

        leetcode82 obj = new leetcode82();
        System.out.println("The paths : "+obj.binaryTreePaths(t1));
    }
    
}
