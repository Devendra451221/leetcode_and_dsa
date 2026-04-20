public class leetcode96 {

    Listnode mid(Listnode l){

   
   Listnode s = l;
   Listnode f = l.nxt;
   Listnode prev = s; 

   while (f!=null && f.nxt!=null) {
    prev=s;
    s=s.nxt;
    f=f.nxt.nxt;
   }

   
    prev.nxt = null;
   
   return s;

 }
 Treenode sortedListToBST(Listnode l){
  if(l==null){
    return null;
  }else if(l.nxt==null){
    Treenode t=new Treenode(l.dta);
    return t;
  }else if(l.nxt.nxt == null){           // IMPORTANT CONDITION !
    Treenode t = new Treenode(l.nxt.dta);
    t.l = new Treenode(l.dta);
    return t;
  }
  
    Listnode mid = mid(l);

    Treenode t =new Treenode(mid.dta);

    t.l = sortedListToBST(l);
    t.r = sortedListToBST(mid.nxt);

    return t;
 }
 void inorder(Treenode t){
  if(t!=null){
      inorder(t.l);
      System.out.print(t.dta+" ");
      inorder(t.r);
     }
     return;
    }
    public static void main(String[] args) {
        Listnode l1  = new Listnode(10);
        Listnode l11 = new Listnode(20);
        Listnode l12 = new Listnode(30);
        Listnode l13 = new Listnode(40);
        Listnode l14 = new Listnode(50);
        Listnode l15 = new Listnode(60);
        Listnode l16 = new Listnode(70);
        Listnode l17 = new Listnode(90);
      
        l1.nxt = l11;
        l11.nxt = l12;
        l12.nxt = l13;
        l13.nxt = l14;
        l14.nxt = l15;
        l15.nxt = l16;
        l16.nxt = l17;
        l17.nxt=null;

        leetcode96 obj = new leetcode96();

        Treenode t = obj.sortedListToBST(l1);
        System.out.println("The Tree of Sorted List : ");
        obj.inorder(t);
    }
    
}
