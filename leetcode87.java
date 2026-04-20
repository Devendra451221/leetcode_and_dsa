import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class leetcode87 {
    // Can be done by BFS type
    //   List<Integer> right_side_view(Treenode t){
    //     List<Integer> ansList = new ArrayList<>();
    //     if(t==null){
    //         return ansList;
    //     }

    //     Queue<Treenode> main = new ArrayDeque<>();
    //     Queue<Treenode> help = new ArrayDeque<>();
        
        
         
    //     main.add(t);

    //     while (!main.isEmpty()) {
    //         Treenode temp = main.poll();

    //         if(temp.l!=null){
    //             help.add(temp.l);
    //         }
    //         if(temp.r!=null){
    //             help.add(temp.r);
    //         }

    //         if(main.isEmpty()){
    //           ansList.add(temp.dta);
    //         }

    //         if(main.isEmpty()){

    //             main = help;
    //             help = new ArrayDeque<>();

    //         }
    //     }

    //     return ansList;
    // }


    List<Integer> rightSideView(Treenode t){
        List<Integer> ansList = new ArrayList<>();
        if(t==null){
            return ansList;
        }
        preorderModified(t,ansList,0);
        return ansList;

    }
    void preorderModified(Treenode t,List<Integer> list,int level){
        if(t!=null){
          if(level==list.size()){
            list.add(t.dta);
          }
          preorderModified(t.r, list, level+1);
          preorderModified(t.l, list, level+1);
        }
        return;
    }

    public static void main(String[] args) {
        Treenode t1=new Treenode(1);
        Treenode t2=new Treenode(2);
        Treenode t3=new Treenode(3);
        Treenode t4=new Treenode(5);
        Treenode t5=new Treenode(4);
       
        t1.l=t2;   
        t1.r=t3;
        
        t2.r=t4;
 
        t3.r=t5;
        

        leetcode87 obj=new leetcode87();
         
        System.out.println(obj.rightSideView(t1));
    }
}
