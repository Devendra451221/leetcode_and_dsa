import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

class Treenode
{
    int dta;
    Treenode l;
    Treenode r;
    
    public Treenode() {
    }
    public Treenode(int dta){
        this.dta=dta;
    }
    public Treenode(int dta, Treenode l, Treenode r) {
        this.dta = dta;
        this.l = l;
        this.r = r;
    }
    
}
public class leetcode83 {

    // List<List<Integer>> zigzag_bfs(Treenode t){
    //     List<List<Integer>> ansList = new ArrayList<>();
    //     List<Integer> currList = new ArrayList<>();
    //     if(t==null){
    //         return ansList;
    //     }

    //     Queue<Treenode> main = new ArrayDeque<>();
    //     Queue<Treenode> help = new ArrayDeque<>();
        
    //     boolean left_to_right = true;
         
    //     main.add(t);

    //     while (!main.isEmpty()) {
    //         Treenode temp = main.poll();

    //         if(temp.l!=null){
    //             help.add(temp.l);
    //         }
    //         if(temp.r!=null){
    //             help.add(temp.r);
    //         }

    //         currList.add(temp.dta);

    //         if(main.isEmpty()){

    //             if(!left_to_right){
    //               Collections.reverse(currList);   // reverse current list if right to left or (left_to_right  == false)
    //             }
    //             ansList.add(currList);

    //             main = help;
    //             help = new ArrayDeque<>();

    //             currList = new ArrayList<>();

    //             left_to_right = !left_to_right;   // toggle it for every level !!
    //         }
    //     }

    //     return ansList;
    // }

    List<List<Integer>> zigzag_bfs(Treenode t){
        List<List<Integer>> ansList = new ArrayList<>();
        List<Integer> currList = new ArrayList<>();

        if(t==null){
            return ansList;
        }
        
        int level = 0;

        Stack<Treenode> main = new Stack<>();
        Stack<Treenode> help = new Stack<>();

        main.add(t);

        while (!main.isEmpty()) {
            Treenode temp = main.pop();

            if(level == 0){
              if(temp.l!=null){
                help.add(temp.l);
              }
              if(temp.r!=null){
                help.add(temp.r);
              }
            }
            else{
                if(temp.r!=null){
                help.add(temp.r);
              }
              if(temp.l!=null){
                help.add(temp.l);
              } 
            }
 
            currList.add(temp.dta);

            if(main.isEmpty()){

                ansList.add(currList);

                main = help;
                help = new Stack<>();

                currList = new ArrayList<>();

                level = 1-level;    // toggle level between 1 and 0
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

        leetcode83 obj=new leetcode83();

        System.out.println("ZIG-ZAG BFS : "+obj.zigzag_bfs(t1));
    }
    
}
