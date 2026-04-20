import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class leetsheet15 {

    List<Integer> leftSideView(Treenode t){
        if(t==null){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        traverse(t, list, 0);
        return list;
    }
    void traverse(Treenode t,List<Integer> list,int level){
        if(t!=null){
         if(list.size()==level){
            list.add(t.dta);
         }
         traverse(t.l, list, level+1);
         traverse(t.r, list, level+1);
        }
        return;
    }

    // // by bfs or level order
    // List<Integer> leftSideView(Treenode t){
    //     List<Integer> ans = new ArrayList<>();
    //     if(t==null){
    //         return ans;
    //     }
    //     Queue<Treenode> main = new ArrayDeque<>();
    //     Queue<Treenode> helper= new ArrayDeque<>();
    //     boolean isleveldone = false;
    //     main.add(t);
    //     while (!main.isEmpty()) {
    //         Treenode temp = main.poll();

    //         if(temp.l!=null){
    //             helper.add(temp.l);
    //         }
    //         if(temp.r!=null){
    //             helper.add(temp.r);
    //         }
    //         if(!isleveldone){
    //            ans.add(temp.dta);
    //            isleveldone=!isleveldone;
    //         }
    //         if(main.isEmpty()){
    //             main=helper;
    //             helper = new ArrayDeque<>();
    //             isleveldone = !isleveldone;
    //         }
    //     }
    //     return ans;
    // }
public static void main(String[] args) {
        Treenode t1 = new Treenode(1);
        Treenode t2 = new Treenode(2);
        Treenode t3 = new Treenode(3);
        Treenode t4 = new Treenode(4);
        Treenode t5 = new Treenode(5);
        Treenode t6 = new Treenode(6);
        Treenode t7 = new Treenode(7);

        // level 1
        t1.l = t2;
        t1.r = t3;

        // level 2
        t2.l = t4;
        t2.r = t5;

        t3.r = t6;

        // level 3
        t6.r = t7;
        // t1 is the root of the tree

    leetsheet15 obj =new leetsheet15();
    System.out.println(obj.leftSideView(t1));
}
}
