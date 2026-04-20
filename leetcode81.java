                         // BFS BFS BFS using two queue's //

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class leetcode81 {
    void swapQueues(Queue<Treenode> q1,Queue<Treenode> q2){
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
    }
    List<List<Integer>> levelOrder(Treenode t){
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        Queue<Treenode> main = new ArrayDeque<>();
        Queue<Treenode> help = new ArrayDeque<>();

        if(t==null){
            return ansList;
        }

        main.add(t);
       
        while (!main.isEmpty()) { 
            /* || !help.isEmpty() */ /* || !help.isEmpty()  include nhi krenge to 
             bhi chlega kyunki hm queues ko swap kr rhe hein !!!*/
           
            Treenode tempTree = main.poll();
            if(tempTree.l!=null){
                   help.add(tempTree.l);
            }
            if(tempTree.r!=null){
                   help.add(tempTree.r);
            }

            currList.add(tempTree.dta);

            if(main.isEmpty()){
            ansList.add(currList);
            currList=new ArrayList<>();
            swapQueues(help, main);
            }
        }
        return ansList;
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
    
        leetcode81 obj = new leetcode81();
        List<List<Integer>> ans = obj.levelOrder(t1);
        System.out.println("The level order : "+ans);
    }
    
}
