public class leetcode90 {
    Treenode sortedArrayToBinaryTree(int a[]){
        if(a.length==0){
            return null;
        }
        Treenode t = formTreeFromArray(a, 0, a.length-1);
        return t;
    }
    Treenode formTreeFromArray(int a[],int l,int h){
        if(l<=h){
         
            int mid = (l+h)/2;
            Treenode t = new Treenode(a[mid]);
          
            t.l = formTreeFromArray(a, l, mid-1);
            t.r = formTreeFromArray(a, mid+1, h);
  
            return t;
        }
        return null;
    }
    void inorder(Treenode t){
        if(t!=null){
           inorder(t.l);
           System.out.print(t.dta+" ");
           inorder(t.r);
        }
    }
    public static void main(String[] args) {
        
        int a[]={10,20,30,40,50,60,70};
        leetcode90 obj = new leetcode90();

        Treenode t = obj.sortedArrayToBinaryTree(a);
        System.out.println("Tree formed : ");
        obj.inorder(t);

    }
}
