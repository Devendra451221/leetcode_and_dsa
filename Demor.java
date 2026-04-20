import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import javax.swing.tree.TreeNode;

 
public class Demor {

  private Treenode bsts(Treenode t, int dta){
    while (t!=null) {
      if(t.dta==dta){
         return t;
      }else if(t.dta<dta){
        t=t.r;
      }else{
        t=t.l;
      }
    }
    return null;
  } 
  public static void main(String[] args){ 
        Treenode t1=new Treenode(4);
        Treenode t2=new Treenode(2);
        Treenode t3=new Treenode(6);
        Treenode t4=new Treenode(1);
        Treenode t5=new Treenode(3);
        Treenode t6=new Treenode(7);
        Treenode t7=new Treenode(5);
        t1.l=t2;   
        t1.r=t3;
        
        t2.l=t4;
        t2.r=t5;
 
        t3.r=t6;
        t3.l=t7;
    Demor d = new Demor();
    Treenode t=d.bsts(t1, 5);
    System.out.println(t!=null?t.dta:null);
   
   
}
}
