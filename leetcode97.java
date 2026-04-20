import java.util.ArrayList;
import java.util.List;

public class leetcode97 {

    Treenode balanceTreeAVL(Treenode t){
      ArrayList<Integer> list = new ArrayList<>();
         inorder(t,list);

         Treenode balancedTree = formATree(list, 0, list.size()-1);

         return balancedTree;
    }
    Treenode formATree(ArrayList<Integer> list,int low,int high){
       if(list.size()==0){
        return null;
       }else if(list.size()==1){
        Treenode t= new Treenode(list.get(0));
        return t;
       }

       if(low <= high){
        int mid = (low+high)/2;

        Treenode t = new Treenode(list.get(mid));
        t.l=formATree(list, low, mid-1);
        t.r=formATree(list, mid+1, high);

        return t;
       }else{
       return null;
       }
    }
    void inorder(Treenode t,ArrayList<Integer> list){
      if(t!=null){
        inorder(t.l,list);
        list.add(t.dta);
        inorder(t.r,list);
      }
      return;
    }
    public static void main(String[] args) {
        Treenode t1=new Treenode(10);
        Treenode t2=new Treenode(20);
        Treenode t3=new Treenode(30);
        Treenode t4=new Treenode(40);
        Treenode t5=new Treenode(50);
        
        t1.r=t2;   
        t2.r=t3;
        t3.r=t4;
        t4.r=t5;

        leetcode97 obj = new leetcode97();

        Treenode t = obj.balanceTreeAVL(t1);
        
        ArrayList<Integer> inorderList =new ArrayList<>();
        obj.inorder(t,inorderList);
        System.out.println("The inorder : "+inorderList); 
    }
    
}
