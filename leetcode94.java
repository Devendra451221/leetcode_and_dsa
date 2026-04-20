public class leetcode94 {
    Treenode fff(Treenode t,int dta){
        if(t!=null){
           if(t.dta==dta){
            return t;
           }else if(t.dta > dta){
            t = fff(t.l, dta);
           }else if(t.dta < dta){
            t = fff(t.r, dta);
           }
           return t;
        }
        return null;
    }
    Treenode lowestCommonAncestor(Treenode t,int dta1,int dta2){
        Treenode temp = t;
        if(t==null){
            return null;
        }

        while (temp!=null) {
            if(temp.dta > dta1 && temp.dta > dta2){
               temp=temp.l;
            }else if(temp.dta < dta1 && temp.dta < dta2){
                temp=temp.r;
            }
            else{
                break;
            }
        }

        return temp;
    }
//     Treenode lca(Treenode t,int dta1,int dta2){
//     if(t==null){
//       return null;
//     }
//     else if(t.dta > dta1 && t.dta > dta2){
//       return lca(t.l, dta1, dta2);
//     }else if(t.dta < dta1 && t.dta < dta2){
//       return lca(t.r, dta1, dta2);
//     }
//     return t;
//   }
    public static void main(String[] args) {
        
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

        leetcode94 obj = new leetcode94();
        System.out.println("The Lowest Common Ancestor of 1 and 3 : "+obj.lowestCommonAncestor(t1, 1, 3).dta);
        System.out.println("Find : "+obj.fff(t1, 59));
    }
}
