public class leetcode78 {
  
    // 
//      int nodes = 0;
//    void count(Treenode t){
//     if(t==null){
//       return;
//     }
//     else{
//       nodes++;
//     }

//     count(t.l);
//     count(t.r);

//    }

//    int conuntNodes(Treenode t){
//     count(t);
//     return nodes;
//    }

    int count(Treenode t){

        if(t==null){
            return 0;
        }

        int left = count(t.l);
        int right = count(t.r);

        return left+right+1;
    }

    public static void main(String[] args) {
         Treenode t1=new Treenode(1);
        Treenode t2=new Treenode(1);
        Treenode t3=new Treenode(1);
        Treenode t4=new Treenode(1);
        Treenode t5=new Treenode(5);
        Treenode t6=new Treenode(1);

        t1.l=t2;   
        t1.r=t3;
        
        t2.l=t4;
        t2.r=t5;
 
        t3.r=t6;

        leetcode78 obj=new leetcode78();
        System.out.println("the total nodes : "+obj.count(t1));
    }
    
}
