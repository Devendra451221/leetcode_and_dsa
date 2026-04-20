import java.util.ArrayList;
import java.util.List;

public class leetcode85 {
    // this is true but needs arraylist hence some space complexity 
    // List<Integer> inorder(Treenode t){
    //     List<Integer> list = new ArrayList<>();
    //     traverse(t, list);
    //     return list;
    // }
    // void traverse(Treenode t,List<Integer> list){
    //     if(t!=null){
    //         traverse(t.l, list);
    //         list.add(t.dta);
    //         traverse(t.r, list);
    //     }
    //     return;
    // }

    // int kthSmallestElement(Treenode t,int k){
    //     List <Integer> inorderList = inorder(t);
    //     int element=-1;
    //     try {
    //          element = inorderList.get(k-1);
    //     } catch (Exception e) {
    //         System.out.println("invalid index of kth element");
    //     }
    //     return element;
    // }

    int count =0;
    int element = 0;

    // // kth smallest element 
    //  void inorder(Treenode t,int k){
    //     if(t!=null){
    //         inorder(t.l, k);
    //           count++;
    //         if(count==k){
    //             element = t.dta;
    //         }
    //         inorder(t.r, k);
           
    //     }
    //     return;
    //  }
     int kthSmallestElement(Treenode t,int k){
        inorder(t, k);
        return element;
     }

     // kth largest element 
     void inorder(Treenode t,int k){
        if(t!=null){
            inorder(t.r, k);
            count++;
            if(count==k){
                element = t.dta;
            }
            inorder(t.l, k);
        }
        return;
     }
     int kthLargestElement(Treenode t,int k){
        inorder(t, k);
        return element;
     }

    public static void main(String[] args) {
        
        Treenode t1=new Treenode(4);
        Treenode t2=new Treenode(3);
        Treenode t3=new Treenode(2);
        Treenode t4=new Treenode(1);
        Treenode t5=new Treenode(5);
        Treenode t6=new Treenode(6);
        Treenode t7=new Treenode(7);
        t1.l=t2;
        t1.r=t5;
        t5.r=t6;
        t2.l=t3;
        t6.r=t7;
        t3.l=t4;

        leetcode85 obj = new leetcode85();
        
        // System.out.println("Kth smallest element : "+obj.kthSmallestElement(t1,2));
        // System.err.println("number of elemnts : "+obj.count);
    
        System.out.println("Kth largest element : "+obj.kthLargestElement(t1, 3));
        
    }
    
}
